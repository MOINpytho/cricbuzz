package com.example.AccioBit.Service;


import com.example.AccioBit.dto.BitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitService {

    @Autowired
    RestTemplate restTemplate;

    private static  final String baseUrl = "https://newsapi.org/v2/top-headlines";

    public BitResponse getAssets(String country, String apiKey) {
        String url = baseUrl +"?country="+country+"&category=business&apiKey="+apiKey;
        return  restTemplate.getForObject(url,BitResponse.class);
    }


}
