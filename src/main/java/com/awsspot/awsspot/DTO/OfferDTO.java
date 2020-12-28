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
    private Integer onDemandPrice;
    private Integer historicSpotPrice;
    private Integer totalEstimatedPrice;
    private Integer cpu;
    private Integer memory;
    private Integer network;
    private Integer storage;
    private String storageType;
}
