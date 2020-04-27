package org.cap.service;

import java.util.List;

import org.cap.entities.Product;

public interface IProductService {

	List<Product> fetchAll();
	Product addProduct(Product product);
}
