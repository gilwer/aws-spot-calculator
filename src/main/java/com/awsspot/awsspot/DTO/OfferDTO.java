package com.awsspot.awsspot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferDTO {
    private String type;
    private String OS;
    private Double onDemandPrice;
    private Double historicSpotPrice;
    private Double totalEstimatedPrice;
    private Double cpu;
    private Double memory;
    private Double network;
    private Double storage;
    private String storageType;
}
