package com.awsspot.awsspot.services;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoadDataService {
    private StorageService storageService;

    private void loadData() throws IOException {
        storageService.loadAcceleratedData(loadResource(new ClassPathResource("classpath:accelerated-computing-data")));
        storageService.loadComputeData(loadResource(new ClassPathResource("classpath:compute-optimized-data")));
        storageService.loadGeneralData(loadResource(new ClassPathResource("classpath:general-purpose-data")));
        storageService.loadMemoryData(loadResource(new ClassPathResource("classpath:memory-optimized-data")));
        storageService.loadStorageData(loadResource(new ClassPathResource("classpath:storage-optimized-data")));
    }

    private Map<String,TypeData> loadResource(Resource resource) throws IOException {
        HashMap<String,TypeData> map = new HashMap<String,TypeData>();
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()),1024);
        String line;
        while ((line = br.readLine()) != null) {
            String[] array = line.split(" ");
            map.put(array[0],new TypeData(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[1])));
        }
        br.close();
        return map;
    }


}
