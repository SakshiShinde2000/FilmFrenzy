/*
 * package com.axis.filmfrenzy.controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.axis.filmfrenzy.models.Theater; import
 * com.axis.filmfrenzy.services.TheaterService;
 * 
 * @CrossOrigin
 * 
 * @RestController
 * 
 * @RequestMapping("/api/theaters") public class TheaterController {
 * 
 * @Autowired private TheaterService tService;
 * 
 * @PostMapping public ResponseEntity<?> saveTheater(Theater theater) {
 * tService.save(theater); return
 * ResponseEntity.ok().body("Theater saved successfully"); }
 * 
 * @GetMapping public ResponseEntity<?> listall(){ return
 * ResponseEntity.ok(tService.listall()); }
 * 
 * @DeleteMapping("{id}") public ResponseEntity<?>
 * deleteMovie(@PathVariable("id") int id){ tService.deleteTheater(id); return
 * ResponseEntity.ok("Theater deleted successfully"); }
 * 
 * @GetMapping("{id}") public ResponseEntity<?> findDetails(@PathVariable("id")
 * int id){ return ResponseEntity.ok().body(tService.findById(id)); }
 * 
 * 
 * }
 */