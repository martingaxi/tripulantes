package com.example.demo.controller;

import com.example.demo.model.Tripulante;
import com.example.demo.service.TripulanteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tripulantes")
@AllArgsConstructor
public class TripulanteController {
    private final TripulanteService tripulanteService;

    @PostMapping("/")
    public ResponseEntity<Tripulante> createTripulante(@RequestBody Tripulante tripulante) {
        return ResponseEntity.ok().body(tripulanteService.createTripulante(tripulante));
    }

    @GetMapping("/")
    public ResponseEntity<List<Tripulante>> getAllTripulantes() {
        return ResponseEntity.ok().body(tripulanteService.getAllTripulantes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tripulante> getTripulanteById(@PathVariable(value = "id") Long id) {
        Tripulante tripulante = tripulanteService.getTripulanteById(id);
        if (tripulante == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(tripulante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTripulante(@PathVariable(value = "id") Long id) {
        tripulanteService.deleteTripulante(id);
        return ResponseEntity.ok().build();
    }
}
