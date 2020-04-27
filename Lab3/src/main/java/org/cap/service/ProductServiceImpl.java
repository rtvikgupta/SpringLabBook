package org.cap.service;

import java.util.List;

import org.cap.dao.IProductDao;
import org.cap.dao.ProductDaoImpl;
import org.cap.entities.Product;
import org.cap.exceptions.ProductExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements IProductService{

	private IProductDao productDao;
	
	public IProductDao getProductDao() {
		return productDao;
	}
	@Autowired
	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> fetchAll() {
		List<Product> list = productDao.fetchAll();
		return list;
	}

	@Override
	public Product addProduct(Product product) {
		Product fetched=productDao.fetch(product.getProductId());
		if(fetched!=null) {
			throw new ProductExistException("Product is already exist with id "+product.getProductId());
		}
		return productDao.addProduct(product);
	}

}
