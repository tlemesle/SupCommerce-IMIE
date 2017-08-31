package fr.imie.supcommerce.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns="/auth/addProduct")
public class AddProductServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(req.getSession().getAttribute("username") == null) {
			resp.sendRedirect("/SupCommerce/login.html");
		}else {
			String name = req.getParameter("name");
			String description = req.getParameter("description");
			float price = Float.parseFloat(req.getParameter("price"));
			Long id = Long.parseLong(req.getParameter("category"));
			Product product = new Product(name,description,price);
			
			ProductDao daoP = DaoFactory.getProductDao();
			CategoryDao daoC = DaoFactory.getCategoryDao();
						
			Category category = new Category();
			category = daoC.findCategoryById(id);
			product.setCategory(category);

			//req.getSession().getAttribute("category");
			daoP.addProduct(product);
		
			resp.sendRedirect("/SupCommerce/showProduct?id="+product.getId());
		}

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CategoryDao daoC = DaoFactory.getCategoryDao();
		List<Category>categories = daoC.getAllCategories();
		req.setAttribute("categories", categories);
		RequestDispatcher rd = req.getRequestDispatcher("/auth/addProduct.jsp");
		rd.forward(req, resp);
	}
	
}
