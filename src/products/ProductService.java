package products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductService {
    @Autowired
	private ProductDao dao;
	
	public List<Products> queryAll(){
		Products pro =new Products();
		Products pro1 =new Products();
		pro.setProductName("´¿Å£ÄÌ");
		pro1.setProductName("ËáÅ£ÄÌ");
		dao.insertProduct(pro);
		System.out.println(1/0);
		dao.insertProduct(pro1);
		
		List<Products> list=dao.queryAll();
		return list;
	}
}
