package com.awsspot.awsspot.mappers;

import com.awsspot.awsspot.DTO.OfferDTO;
import com.awsspot.awsspot.DTO.OfferListDTO;
import com.awsspot.awsspot.DTO.OfferParamsDTO;
import com.awsspot.awsspot.dataclasses.Offer;
import com.awsspot.awsspot.dataclasses.OfferList;
import com.awsspot.awsspot.dataclasses.OfferParams;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferMapper {
    OfferDTO toDto(Offer offer);
    OfferListDTO toDto(OfferList offerList);
    OfferParams fromDto(OfferParamsDTO offerParamsDTO);
}
