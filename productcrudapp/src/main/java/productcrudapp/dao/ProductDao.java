package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.modal.Product;

@Component		
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	// create 
	// this is work only creating the product
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	// here this is work creating or update the product
	@Transactional
	public void creteOrUpdateProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// get all product 
	public List<Product> getProduct(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	// delete the single product
	@Transactional
	public void deleteProduct(int pId) {
		Product p = this.hibernateTemplate.load(Product.class, pId);
		this.hibernateTemplate.delete(p);
	}
	
	// get the single product
	public Product getProduct(int pId) {
		return this.hibernateTemplate.get(Product.class, pId);
	}
}
