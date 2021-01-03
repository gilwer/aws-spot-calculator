package com.awsspot.awsspot.services;

import com.awsspot.awsspot.dataclasses.Offer;
import com.awsspot.awsspot.dataclasses.OfferParams;
import org.springframework.stereotype.Service;

@Service
public class TotalPriceCalculatorService {
    private StorageService storageService;
    public Offer calculateTotalPrice(Offer offer, OfferParams params, boolean onlyEBS){
        double price = offer.getHistoricSpotPrice();

        return  offer;
    }
}
