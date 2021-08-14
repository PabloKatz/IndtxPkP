package com.Indtx.apirest.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import com.Indtx.apirest.entity.Prices;
import com.Indtx.apirest.service.PriceService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PriceRestController.class)
@WithMockUser
class PriceRestControllerTest {

	public void main(String[] args) throws Exception {
		Test1();
	}
	
	@MockBean
	PriceService PriceService;
	
	@Autowired
	private MockMvc mockMvc;
    
	@Autowired
    ObjectMapper mapper;
    
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private int productId=35455;
	private int brandId=1;
	
	
	//petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	@Test
	public void Test1() throws Exception {
		String ApplicationDateString="2020-06-14T10:00:00";
		Date applicationDate = null;
		Date Start_Date = null;
		Date End_Date = null;
		try {
			
			applicationDate = format.parse(ApplicationDateString);
			Start_Date = format.parse("2020-06-14T00:00:00");
			End_Date = format.parse("2020-12-31T23:59:59");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		BigDecimal Price = new BigDecimal(35.50);
		
		Prices Prices=new Prices(brandId, Start_Date, End_Date, 1, productId, 0, Price, "EUR");
		
	    Mockito.when(PriceService.findPrice(applicationDate, productId, brandId)).thenReturn(Prices);
	    mockMvc.perform(get("/api/prices?brandId=" + brandId + "&productId=" + productId + "&applicationDate=" + ApplicationDateString))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));

		verify(PriceService.findPrice(applicationDate, productId, brandId));
		verifyNoMoreInteractions(PriceService);
	}
	
	//petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	@Test
	public void Test2() throws Exception {
		String ApplicationDateString="2020-06-14T16:00:00";
		Date applicationDate = null;
		Date Start_Date = null;
		Date End_Date = null;
		try {
			
			applicationDate = format.parse(ApplicationDateString);
			Start_Date = format.parse("2020-06-14T15:00:00");
			End_Date = format.parse("2020-06-14T18:30:00");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		BigDecimal Price = new BigDecimal(25.45);
		
		Prices Prices=new Prices(brandId, Start_Date, End_Date, 2, productId, 1, Price, "EUR");
		
	    Mockito.when(PriceService.findPrice(applicationDate, productId, brandId)).thenReturn(Prices);
	    mockMvc.perform(get("/api/prices?brandId=" + brandId + "&productId=" + productId + "&applicationDate=" + ApplicationDateString))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));

		verify(PriceService.findPrice(applicationDate, productId, brandId));
		verifyNoMoreInteractions(PriceService);
	}
	
	//petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
	@Test
	public void Test3() throws Exception {
		String ApplicationDateString="2020-06-14T21:00:00";
		Date applicationDate = null;
		Date Start_Date = null;
		Date End_Date = null;
		try {
			
			applicationDate = format.parse(ApplicationDateString);
			Start_Date = format.parse("2020-06-14T00:00:00");
			End_Date = format.parse("2020-12-31T23:59:59");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		BigDecimal Price = new BigDecimal(35.50);
		
		Prices Prices=new Prices(brandId, Start_Date, End_Date, 1, productId, 0, Price, "EUR");
		
	    Mockito.when(PriceService.findPrice(applicationDate, productId, brandId)).thenReturn(Prices);
	    mockMvc.perform(get("/api/prices?brandId=" + brandId + "&productId=" + productId + "&applicationDate=" + ApplicationDateString))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));

		verify(PriceService.findPrice(applicationDate, productId, brandId));
		verifyNoMoreInteractions(PriceService);
	}
	
	//petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
	@Test
	public void Test4() throws Exception {
		String ApplicationDateString="2020-06-15T10:00:00";
		Date applicationDate = null;
		Date Start_Date = null;
		Date End_Date = null;
		try {
			
			applicationDate = format.parse(ApplicationDateString);
			Start_Date = format.parse("2020-06-15T00:00:00");
			End_Date = format.parse("2020-06-15T11:00:00");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		BigDecimal Price = new BigDecimal(30.50);
		
		Prices Prices=new Prices(brandId, Start_Date, End_Date, 3, productId, 1, Price, "EUR");
		
	    Mockito.when(PriceService.findPrice(applicationDate, productId, brandId)).thenReturn(Prices);
	    mockMvc.perform(get("/api/prices?brandId=" + brandId + "&productId=" + productId + "&applicationDate=" + ApplicationDateString))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));

		verify(PriceService.findPrice(applicationDate, productId, brandId));
		verifyNoMoreInteractions(PriceService);
	}
	
	//petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
	@Test
	public void Test5() throws Exception {
		String ApplicationDateString="2020-06-16T21:00:00";
		Date applicationDate = null;
		Date Start_Date = null;
		Date End_Date = null;
		try {
			
			applicationDate = format.parse(ApplicationDateString);
			Start_Date = format.parse("2020-06-15T16:00:00");
			End_Date = format.parse("2020-12-31T23:59:59");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		BigDecimal Price = new BigDecimal(39.95);
		
		Prices Prices=new Prices(brandId, Start_Date, End_Date, 4, productId, 1, Price, "EUR");
		
	    Mockito.when(PriceService.findPrice(applicationDate, productId, brandId)).thenReturn(Prices);
	    mockMvc.perform(get("/api/prices?brandId=" + brandId + "&productId=" + productId + "&applicationDate=" + ApplicationDateString))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));

		verify(PriceService.findPrice(applicationDate, productId, brandId));
		verifyNoMoreInteractions(PriceService);
	}
}
