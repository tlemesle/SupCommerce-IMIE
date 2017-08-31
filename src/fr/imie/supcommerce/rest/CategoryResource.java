package fr.imie.supcommerce.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.imie.supcommerce.dao.DaoFactory;
import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.entity.Category;
import fr.imie.supcommerce.entity.Product;

@Path("/categories")
public class CategoryResource {
	
	@GET
	public String getTest() {
		return "Coucou";
	}

	@GET @Path("/json/{id}") @Produces(MediaType.APPLICATION_JSON)
	public Category getCategoryInJson(@PathParam("id") Long id) {
		return DaoFactory.getCategoryDao().findCategoryById(id);
	}
	
	@POST @Path("/add") 
	public Response addCategory(Category category) {
		DaoFactory.getCategoryDao().addCategory(category);
		String categoryUri = "/"+category.getId();
		return Response.created(URI.create(categoryUri)).build();
	}
}
