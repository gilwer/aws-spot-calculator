package com.awsspot.awsspot.services;

import com.awsspot.awsspot.dataclasses.OS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferKey {
    private String region;
    private OS os;
}
