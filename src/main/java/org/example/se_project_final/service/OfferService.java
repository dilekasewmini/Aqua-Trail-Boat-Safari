package org.example.se_project_final.service;

import org.example.se_project_final.model.Offer;
import org.example.se_project_final.repository.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    private final OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAllByOrderByOfferDateDesc();
    }

    public List<Offer> getOffersByType(String offerType) {
        return offerRepository.findByOfferTypeOrderByOfferDateDesc(offerType);
    }

    public Offer saveOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public Offer createOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public Offer getOfferById(Long id) {
        return offerRepository.findById(id).orElse(null);
    }

    public void deleteOffer(Long id) {
        offerRepository.deleteById(id);
    }

    public Offer updateOffer(Long id, Offer updatedOffer) {
        return offerRepository.findById(id).map(offer -> {
            offer.setOfferDate(updatedOffer.getOfferDate());
            offer.setStartTime(updatedOffer.getStartTime());
            offer.setEndTime(updatedOffer.getEndTime());
            offer.setOfferType(updatedOffer.getOfferType());
            offer.setDescription(updatedOffer.getDescription());
            return offerRepository.save(offer);
        }).orElse(null);
    }
}