package com.Indtx.apirest.dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.type.TimestampType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Indtx.apirest.entity.Prices;

@Repository
public class PriceDAOImpl implements PriceDAO{

	@Autowired
    private EntityManager entityManager;
	
	@Override
	public List<Prices> findPrice(Date applicationDate, int productId, int brandId) {
		
		Session currentSession = entityManager.unwrap(Session.class);

		String sql="from prices where BRAND_ID=:brandId AND PRODUCT_ID=:productId AND START_DATE<=:applicationDate AND END_DATE>=:applicationDate ORDER BY PRIORITY DESC";

		Query<Prices> Query = currentSession.createQuery(sql, Prices.class);
		
		Query.setParameter("brandId", brandId);
		Query.setParameter("productId", productId);
		Query.setParameter("applicationDate", applicationDate, TimestampType.INSTANCE);
		
		List<Prices> Prices = Query.getResultList();

		return Prices;
	}

}
