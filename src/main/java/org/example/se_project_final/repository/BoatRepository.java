package org.example.se_project_final.repository;

import org.example.se_project_final.model.Boat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoatRepository extends JpaRepository<Boat, Long> {
    List<Boat> findByStatus(String status);
    List<Boat> findByNameContainingIgnoreCase(String name);
}