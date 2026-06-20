package org.example.se_project_final.controller.customer;

import org.example.se_project_final.model.Customer;
import org.example.se_project_final.model.Offer;
import org.example.se_project_final.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/offers")
    public String viewOffers(HttpSession session, Model model) {
        // Get all offers
        List<Offer> offers = offerService.getAllOffers();
        model.addAttribute("offers", offers);
        
        // Add customer to session if logged in
        Customer customer = (Customer) session.getAttribute("customer");
        if (customer != null) {
            model.addAttribute("customer", customer);
        }
        
        return "user/offers";
    }
}