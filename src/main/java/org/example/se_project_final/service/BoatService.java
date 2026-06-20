package org.example.se_project_final.service;

import org.example.se_project_final.model.Boat;
import org.example.se_project_final.repository.BoatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoatService {

    private final BoatRepository boatRepository;

    public BoatService(BoatRepository boatRepository) {
        this.boatRepository = boatRepository;
        // Create some initial boats if the database is empty
        if (boatRepository.count() == 0) {
            createInitialBoats();
        }
    }

    public List<Boat> getAllBoats() {
        return boatRepository.findAll();
    }

    public Optional<Boat> getBoatById(Long id) {
        return boatRepository.findById(id);
    }

    public Boat createBoat(Boat boat) {
        return boatRepository.save(boat);
    }

    public Boat updateBoat(Long id, Boat updatedBoat) {
        return boatRepository.findById(id).map(boat -> {
            boat.setName(updatedBoat.getName());
            boat.setType(updatedBoat.getType());
            boat.setDescription(updatedBoat.getDescription());
            boat.setCapacity(updatedBoat.getCapacity());
            boat.setStatus(updatedBoat.getStatus());
            return boatRepository.save(boat);
        }).orElse(null);
    }

    public void deleteBoat(Long id) {
        boatRepository.deleteById(id);
    }

    public List<Boat> getActiveBoats() {
        return boatRepository.findByStatus("active");
    }

    private void createInitialBoats() {
        Boat boat1 = new Boat("Sea Explorer", "Luxury", "Premium luxury boat with panoramic views", 20, "active");
        Boat boat2 = new Boat("Ocean Runner", "Speed", "Fast speed boat for adventure trips", 12, "active");
        Boat boat3 = new Boat("Sunset Cruiser", "Cruiser", "Comfortable cruiser for sunset tours", 15, "active");
        
        boatRepository.save(boat1);
        boatRepository.save(boat2);
        boatRepository.save(boat3);
        
        System.out.println("Initial boats created successfully!");
    }
}