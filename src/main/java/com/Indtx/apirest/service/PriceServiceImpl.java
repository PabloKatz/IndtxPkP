package com.Indtx.apirest.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Indtx.apirest.dao.PriceDAO;
import com.Indtx.apirest.entity.Prices;

@Service
public class PriceServiceImpl implements PriceService {

	    @Autowired
	    private PriceDAO priceDAO;
	    
		@Override
		public Prices findPrice(Date applicationDate, int productId, int brandId) {
			Prices price=null;
			List<Prices> prices= priceDAO.findPrice(applicationDate, productId, brandId);
			if (prices!=null && !prices.isEmpty()) {
				price=prices.get(0);
			}
			return price;
		}
}
