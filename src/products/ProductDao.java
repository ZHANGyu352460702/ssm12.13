package products;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {

	List<Products> queryAll();
	int insertProduct(Products pro);
}
