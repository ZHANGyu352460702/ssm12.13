package products;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import net.sf.json.JSONObject;

@Controller
@RequestMapping("/product")
public class ProductsController {
     
	@Autowired
    private ProductService service;	
    
    @RequestMapping("queryAll.html")
    public String queryAll(Model model){
    	List<Products> products=service.queryAll();
    	model.addAttribute("products", products);
		return "/products.jsp";
    }
    
    
    @Autowired
	private HttpServletResponse response;
	
	@ResponseBody
	@RequestMapping("/test14.html")
	public void func16(){
//		List<Products> products = service.queryAll();
//		JSONObject jo=JSONObject.fromObject(products);
		
		Products products =new Products();
		products.setProductName("asdf");
		JSONObject jo=JSONObject.fromObject(products);
		try {
			/*response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=utf-8");*/
			response.getWriter().println(jo.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}