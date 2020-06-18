package it.dstech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.dstech.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	@Query(value = "SELECT p FROM Product p WHERE p.name LIKE '%' || :keyword || '%'"
			+ " OR p.quantity LIKE '%' || :keyword || '%'"
			+ " OR p.type LIKE '%' || :keyword || '%'")
	public List<Product> search(@Param("keyword") String keyword);
}
