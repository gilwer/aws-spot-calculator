package com.awsspot.awsspot.dataclasses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer {
    private String type;
    private OS OS;
    private Double onDemandPrice;
    private Double historicSpotPrice;
    private Double totalEstimatedPrice;
    private Double cpu;
    private Double memory;
    private Double network;
    private Double storage;
    private String storageType;
    private Double interruptionFrequency;
    private Double currentSpotPrice;
    private String region;
    private TypePurpose typePurpose;
}
