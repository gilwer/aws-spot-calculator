package com.awsspot.awsspot.dataclasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferList {
    private List<Offer> hibernateOffers;
    private List<Offer> stopOffers;
    private List<Offer> terminationOffers;
}
