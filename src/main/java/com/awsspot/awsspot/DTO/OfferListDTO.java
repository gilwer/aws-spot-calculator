package com.awsspot.awsspot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferListDTO {
    private List<OfferDTO> hibernateOffers;
    private List<OfferDTO> stopOffers;
    private List<OfferDTO> terminationOffers;
}
