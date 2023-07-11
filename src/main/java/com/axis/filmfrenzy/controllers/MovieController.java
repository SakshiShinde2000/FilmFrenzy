package com.axis.filmfrenzy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.axis.filmfrenzy.models.Movie;
import com.axis.filmfrenzy.services.MovieService;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MovieController {
	@Autowired private MovieService mService;

    @PostMapping
    public ResponseEntity<?> saveMovie(Movie movie,@RequestPart(required = false) MultipartFile photo){
        mService.save(movie,photo);
        return ResponseEntity.ok().body("Movie saved successfully");
    }

    @GetMapping
    public ResponseEntity<?> listall(){
        return ResponseEntity.ok(mService.listall());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable("id") int id){
        mService.deleteMovie(id);
        return ResponseEntity.ok("Movie deleted successfully");
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findDetails(@PathVariable("id") int id){
        return ResponseEntity.ok().body(mService.findById(id));
    }
}
