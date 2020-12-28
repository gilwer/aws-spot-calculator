package com.awsspot.awsspot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferParamsDTO {
    private Double minCpu;
    private Double maxCpu;
    private Double minMemory;
    private Double maxMemory;
    private Double minNetwork;
    private Double maxNetwork;
    private Double minStorage;
    private Double maxStorage;
    private OSDTO OS;
    private TypePurposeDTO typePurpose;
}
