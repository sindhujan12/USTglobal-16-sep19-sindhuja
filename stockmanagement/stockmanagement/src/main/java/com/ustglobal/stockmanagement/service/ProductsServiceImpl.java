package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductsDAO;
import com.ustglobal.stockmanagement.dto.ProductsInfo;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO dao;
	@Override
	public boolean addProduct(ProductsInfo product) {
		
		return  dao.addProduct(product);
	}
	@Override
	public boolean modifyProduct(ProductsInfo product) {

		return dao.modifyProduct(product);
	}
	@Override
	public List<ProductsInfo> searchByName(String name) {
		
		return dao.searchByName(name);
	}
	@Override
	public List<ProductsInfo> searchByCategory(String category) {

		return dao.searchByCategory(category);
	}
	@Override
	public List<ProductsInfo> searchByCompany(String company) {

		return dao.searchByCompany(company);
	}

}
