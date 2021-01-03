package com.awsspot.awsspot.services;

import com.awsspot.awsspot.dataclasses.OS;
import com.awsspot.awsspot.dataclasses.Offer;
import com.awsspot.awsspot.dataclasses.OfferParams;
import com.awsspot.awsspot.dataclasses.TypePurpose;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StorageService {

    private HashMap<OS,List<Offer>> offerMap;


    public void loadComputeData(Map<String, TypeData> loadResource) {
    }

    public void loadAcceleratedData(Map<String, TypeData> loadResource) {
    }

    public void loadGeneralData(Map<String, TypeData> loadResource) {
    }

    public void loadMemoryData(Map<String, TypeData> loadResource) {
    }

    public void loadStorageData(Map<String, TypeData> loadResource) {
    }


    public void loadOffers(List<Offer> offers){
        offers.stream().collect(Collectors.groupingBy(Offer::getOS))
                .forEach((os,offerList)->offerMap.put(os,offerList));
    }

    public List<Offer> getOffers(OfferParams params) {
        return  offerMap.get(params.getOS()).stream()
                .filter(offer -> params.getMaxCpu()<=offer.getCpu()
                        && params.getMaxMemory()<=offer.getMemory()
                        && params.getMaxNetwork()<=offer.getNetwork()
                        && (params.getTypePurpose().equals(TypePurpose.ALL)
                        || params.getTypePurpose().equals(offer.getTypePurpose()))
                ).collect(Collectors.toList());
    }
}
