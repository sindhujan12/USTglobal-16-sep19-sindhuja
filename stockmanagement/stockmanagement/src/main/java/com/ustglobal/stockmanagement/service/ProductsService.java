package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductsInfo;

public interface ProductsService {

	public boolean addProduct(ProductsInfo product);
	public boolean modifyProduct(ProductsInfo product);
	public List<ProductsInfo> searchByName(String name);
	public List<ProductsInfo> searchByCategory(String category);
	public List<ProductsInfo> searchByCompany(String company);
}
