package com.Indtx.apirest.service;

import java.util.Date;

import com.Indtx.apirest.entity.Prices;

public interface PriceService {

	public Prices findPrice(Date applicationDate, int productId, int brandId);
	
}
