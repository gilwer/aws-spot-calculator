package com.awsspot.awsspot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferParamsDTO {
    private Double maxCpu;
    private Double maxMemory;
    private Double maxNetwork;
    private Double maxStorage;
    private OSDTO OS;
    private TypePurposeDTO typePurpose;
}
