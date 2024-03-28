package com.example.demo.repository;

import com.example.demo.model.Tripulante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripulanteRepository extends JpaRepository<Tripulante, Long> {
}
