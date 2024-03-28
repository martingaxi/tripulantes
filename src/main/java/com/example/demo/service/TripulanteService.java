package com.example.demo.service;

import com.example.demo.model.Tripulante;
import com.example.demo.repository.TripulanteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TripulanteService {
    private final TripulanteRepository tripulanteRepository;

    public List<Tripulante> getAllTripulantes() {
        return tripulanteRepository.findAll();
    }

    public Tripulante createTripulante(Tripulante tripulante) {
        return tripulanteRepository.save(tripulante);
    }

    public Tripulante getTripulanteById(Long id) {
        return tripulanteRepository.findById(id).orElse(null);
    }

    public void deleteTripulante(Long id) {
        tripulanteRepository.deleteById(id);
    }
}
