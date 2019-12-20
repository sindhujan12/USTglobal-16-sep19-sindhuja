package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.ProductsInfo;

@Repository
public class ProductsDaoImpl  implements ProductsDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;

		}catch(Exception e) {
			e.printStackTrace();

			return false;
		}
	}
	@Override
	public boolean modifyProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductsInfo productsInfo = manager.find(ProductsInfo.class, product.getProduct_id());
		productsInfo.setName(product.getName());
		productsInfo.setCategory(product.getCategory());
		productsInfo.setCompany(product.getCompany());
		productsInfo.setQuantity(product.getQuantity());
		productsInfo.setPrice(product.getPrice());
		transaction.commit();
		
		return true;
	}
	@Override
	public List<ProductsInfo> searchByName(String name) {
		
		String jpql = "from ProductsInfo where name=:name";
		EntityManager manager =factory.createEntityManager();
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql,ProductsInfo.class);
		query.setParameter("name",name);
		List<ProductsInfo> productBeans = query.getResultList();
		return productBeans;
	}
	@Override
	public List<ProductsInfo> searchByCategory(String category) {
		String jpql = "from ProductsInfo where category=:category";
		EntityManager manager =factory.createEntityManager();
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql,ProductsInfo.class);
		query.setParameter("category",category);
		List<ProductsInfo> productBeans = query.getResultList();
		return productBeans;
	}
	@Override
	public List<ProductsInfo> searchByCompany(String company) {
		String jpql = "from ProductsInfo where company=:company";
		EntityManager manager =factory.createEntityManager();
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql,ProductsInfo.class);
		query.setParameter("company",company);
		List<ProductsInfo> productBeans = query.getResultList();
		return productBeans;
	}

}
