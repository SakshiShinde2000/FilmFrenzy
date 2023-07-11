package com.axis.filmfrenzy.controllers;

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

import com.axis.filmfrenzy.dtos.HallCapacityDTO;
import com.axis.filmfrenzy.models.Hall;
import com.axis.filmfrenzy.services.HallService;

@CrossOrigin
@RestController
@RequestMapping("/api/halls")
public class HallController {
	@Autowired private HallService service;

    @PostMapping("seats")
    public ResponseEntity<?> saveHallSeats(@RequestBody HallCapacityDTO hc){
        service.saveCapacity(hc);
        return ResponseEntity.ok().body("Hall Seats saved successfully");
    }
    
    @DeleteMapping("seats/{id}")
    public ResponseEntity<?> deleteSeat(@PathVariable("id") int id){
        service.deleteSeat(id);
        return ResponseEntity.ok("Seat deleted successfully");
    }
    
    @PostMapping
    public ResponseEntity<?> saveHall(@RequestBody Hall hall){
        service.save(hall);
        return ResponseEntity.ok().body("Hall saved successfully");
    }

    @GetMapping
    public ResponseEntity<?> listall(){
        return ResponseEntity.ok(service.listall());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteHall(@PathVariable("id") int id){
        service.deleteHall(id);
        return ResponseEntity.ok("Hall deleted successfully");
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findDetails(@PathVariable("id") int id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
