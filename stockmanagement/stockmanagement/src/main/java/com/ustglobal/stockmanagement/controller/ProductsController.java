package com.ustglobal.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.ProductsInfo;
import com.ustglobal.stockmanagement.service.ProductsService;

@CrossOrigin(origins ="*",allowedHeaders="*",allowCredentials="true")
@RestController
public class ProductsController {

	@Autowired
	private ProductsService service;
	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduct(@RequestBody ProductsInfo product) {
		return service.addProduct(product);
	}

	@PutMapping(path = "/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean modifyProduct(@RequestBody ProductsInfo product) {
		return service.modifyProduct(product);

	}

	@GetMapping(path="/search/{name}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> searchByName(@PathVariable("name") String name){

		List<ProductsInfo> product = service.searchByName(name);

		if(product != null) {
			return product;
		}else {
			return null;
		}
	}

	@GetMapping(path="/searchcategory/{category}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> searchByCategory(@PathVariable("category") String category){
		List<ProductsInfo> product = service.searchByCategory(category);

		if(product != null) {
			return product;
		}else {
			return null;
		}
		
	}
	
	@GetMapping(path="/searchcompany/{company}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsInfo> searchByCompany(@PathVariable("company") String company){
		List<ProductsInfo> product = service.searchByCompany(company);

		if(product != null) {
			return product;
		}else {
			return null;
		}
		
	}

}
