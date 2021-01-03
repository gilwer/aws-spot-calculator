package com.awsspot.awsspot.controller;

import com.awsspot.awsspot.DTO.OfferListDTO;
import com.awsspot.awsspot.DTO.OfferParamsDTO;
import com.awsspot.awsspot.mappers.OfferMapper;
import com.awsspot.awsspot.services.SpotOfferService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SpotCalculatorController {

    private SpotOfferService spotOfferService;
    private OfferMapper mapper;

    @ApiOperation(value = "offers")
    @PostMapping(value = "/getOffers")
    @ResponseStatus(HttpStatus.OK)
    OfferListDTO getSpotOffers(@RequestBody OfferParamsDTO params){
       return mapper.toDto(spotOfferService.getOffers(mapper.fromDto(params)));
    }
}
