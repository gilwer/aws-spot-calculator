package com.awsspot.awsspot.services;

import com.awsspot.awsspot.dataclasses.Offer;
import com.awsspot.awsspot.dataclasses.OfferList;
import com.awsspot.awsspot.dataclasses.OfferParams;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpotOfferService {

    private StorageService storageService;

    public OfferList getOffers(OfferParams params) {
        List<Offer> offerList = storageService.getOffers(params);
        List<Offer> hibernate = offerList.stream().filter(this::canHibernate)
                .sorted((o1, o2) -> o1.getTotalEstimatedPrice().intValue()-o2.getOnDemandPrice().intValue())
                .collect(Collectors.toList());
        List<Offer> stop = offerList.stream().filter(this::canStop)
                .sorted((o1, o2) -> o1.getTotalEstimatedPrice().intValue()-o2.getOnDemandPrice().intValue())
                .collect(Collectors.toList());
        List<Offer> terminate = offerList.stream().
                sorted((o1, o2) -> o1.getTotalEstimatedPrice().intValue()-o2.getOnDemandPrice().intValue())
                .collect(Collectors.toList());
        return new OfferList(hibernate,stop,terminate);
    }

    private boolean canHibernate(Offer offer){
        String hibernateTypes = "c3|c4|c5|m4|m5|r3|r4";
        return offer.getType().split(".")[0].matches(hibernateTypes) && canStop(offer);
    }

    private boolean canStop(Offer offer){
        //TODO check stop requirements
        return true;
    }
}
