package com.axis.filmfrenzy.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.filmfrenzy.dtos.BookingDTO;
import com.axis.filmfrenzy.dtos.ShowCheckDTO;
import com.axis.filmfrenzy.models.Booking;
import com.axis.filmfrenzy.repos.BookingRepository;

@Service
public class BookingService {

	@Autowired private BookingRepository repo;
	@Autowired private ShowsService sservice;
	@Autowired private SeatTypeService stservice;
	@Autowired private UserService uservice;
	
	public void save(BookingDTO dto) {
		Booking bk=new Booking();
		bk.setShowDate(dto.getBookDate());
		bk.setNoOfSeats(dto.getNoOfSeats());
		bk.setSeatnos(IntStream.of(dto.getSeatnums())
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));
		bk.setCost(dto.getCost());
		bk.setShow(sservice.findById(dto.getShowId()));
		bk.setUser(uservice.findById(dto.getUserId()));
		repo.save(bk);
	}
	
	public List<Booking> listall(){
		return repo.findAll();
	}
	
	public List<Booking> alluserbooking(int id){
		return repo.findByUser(uservice.findById(id));
	}
	
	public Booking findById(int id) {
		return repo.getById(id);
	}
	
	public List<Booking> allOccupiedBookings(ShowCheckDTO dto){
		return repo.findByShowShowIdAndShowDate(dto.getShowid(), dto.getDate());
	}
	
	public void delete(int id) {
		Booking bk=repo.getById(id);
		bk.setStatus("Cancelled");
		bk.setCancelCharges((float) (bk.getCost()*.20));
		bk.setCost(0);
		repo.save(bk);
	}
}
