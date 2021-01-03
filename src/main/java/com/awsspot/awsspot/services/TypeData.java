package com.awsspot.awsspot.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeData {
    private String name;
    private Double cpu;
    private Double memory;
}
