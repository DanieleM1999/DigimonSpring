package it.dstech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.model.Product;
import it.dstech.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired ProductRepository repo;
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> listAll() {
		return (List<Product>) repo.findAll();
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Product> search(String keyword) {
		return repo.search(keyword);
	}
}
