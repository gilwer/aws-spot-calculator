package com.awsspot.awsspot.controller;

import com.awsspot.awsspot.DTO.OfferListDTO;
import com.awsspot.awsspot.DTO.OfferParamsDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SpotCalculatorController {
    @ApiOperation(value = "offers")
    @PostMapping(value = "/getOffers")
    @ResponseStatus(HttpStatus.OK)
    OfferListDTO getSpotOffers(@RequestBody OfferParamsDTO params){
        return null;
    }
}
