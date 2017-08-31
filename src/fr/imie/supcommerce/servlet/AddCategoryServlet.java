package fr.imie.supcommerce.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
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
@WebServlet(urlPatterns="/auth/addCategory")
public class AddCategoryServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		if(req.getSession().getAttribute("username") == null) {
			resp.sendRedirect("/SupCommerce/login.html");
		}else {
			String name = req.getParameter("name");
			Category category = new Category(name);
			CategoryDao dao = DaoFactory.getCategoryDao();
			dao.addCategory(category);
			
			resp.sendRedirect("/SupCommerce/listProduct");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = req.getRequestDispatcher("/auth/addCategory.jsp");
		rd.forward(req, resp);
	}
	
}
