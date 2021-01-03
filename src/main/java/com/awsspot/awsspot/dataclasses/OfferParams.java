package com.awsspot.awsspot.dataclasses;

import com.awsspot.awsspot.DTO.OSDTO;
import com.awsspot.awsspot.DTO.TypePurposeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferParams {
    private Double maxCpu;
    private Double maxMemory;
    private Double maxNetwork;
    private Double maxStorage;
    private OS OS;
    private TypePurpose typePurpose;
}
