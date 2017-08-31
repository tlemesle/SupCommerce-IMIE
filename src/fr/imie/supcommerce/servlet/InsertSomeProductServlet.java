package fr.imie.supcommerce.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.supcommerce.dao.CategoryDao;
import fr.imie.supcommerce.dao.DaoFactory;
import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.entity.Category;
import fr.imie.supcommerce.entity.Product;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		if(req.getSession().getAttribute("username") == null) {
			resp.sendRedirect("/SupCommerce/login.html");
		}else {
		Category category  = new Category("Drink");
		Product product = new Product("Coca-Cola","It's a drink",1.0f);
		product.setCategory(category);

		
		ProductDao daoP = DaoFactory.getProductDao();
		CategoryDao daoC = DaoFactory.getCategoryDao();

		
		daoP.addProduct(product);
		daoC.addCategory(category);
		
		resp.sendRedirect("/SupCommerce/listProduct");
		}
	}
	
}
