package com.Indtx.apirest.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Indtx.apirest.entity.Prices;
import com.Indtx.apirest.service.PriceService;

@RestController
@RequestMapping("/api")

public class PriceRestController {

    @Autowired
    private PriceService priceService;

    @GetMapping("/prices")
    public Prices findPrice(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") Date applicationDate, 
    							  @RequestParam int productId,
    							  @RequestParam int brandId){

    	Prices Prices=priceService.findPrice(applicationDate, productId, brandId);
    	return Prices;
    }
    
}
