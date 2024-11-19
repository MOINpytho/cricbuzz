package com.example.AccioBit.Controller;

import com.example.AccioBit.Service.BitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bit")
public class BitController {
    @Autowired
    BitService bitService;
    @GetMapping("/country")
    public Object getAssets(@RequestParam("country") String country, @RequestParam("api-key") String apiKey) {
        return bitService.getAssets(country,apiKey);
    }
}
