package org.example.se_project_final.repository;

import org.example.se_project_final.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    List<Offer> findAllByOrderByOfferDateDesc();
    List<Offer> findByOfferTypeOrderByOfferDateDesc(String offerType);
}