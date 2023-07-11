package com.axis.filmfrenzy.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.filmfrenzy.dtos.BookingDTO;
import com.axis.filmfrenzy.dtos.ShowCheckDTO;
import com.axis.filmfrenzy.models.Hall;
import com.axis.filmfrenzy.services.BookingService;

@CrossOrigin
@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	@Autowired private BookingService service;
	
	@PostMapping
    public ResponseEntity<?> saveHall(@RequestBody BookingDTO dto){
        service.save(dto);
        return ResponseEntity.ok().body("Tickets Booked successfully");
    }

    @GetMapping
    public ResponseEntity<?> listall(Optional<Integer> userid){
    	if(userid.isPresent())
    		return ResponseEntity.ok(service.alluserbooking(userid.get()));
        return ResponseEntity.ok(service.listall());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> cancelBooking(@PathVariable("id") int id){
        service.delete(id);
        return ResponseEntity.ok("Booking cancelled successfully");
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findDetails(@PathVariable("id") int id){
        return ResponseEntity.ok().body(service.findById(id));
    }
    
    @GetMapping("check")
    public ResponseEntity<?> findByShow(ShowCheckDTO dto){
        return ResponseEntity.ok().body(service.allOccupiedBookings(dto));
    }
}
