package com.Indtx.apirest.dao;

import java.util.Date;
import java.util.List;

import com.Indtx.apirest.entity.Prices;

public interface PriceDAO {
	
	public List<Prices> findPrice(Date applicationDate, int productId, int brandId);


}
