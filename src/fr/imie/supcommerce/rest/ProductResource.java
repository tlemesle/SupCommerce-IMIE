package fr.imie.supcommerce.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.imie.supcommerce.dao.DaoFactory;
import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.entity.Product;

@Path("/products")
public class ProductResource {

	@GET @Path("/allXml") @Produces(MediaType.APPLICATION_XML)
	public List<Product> getAllProductsInXml() {
		return DaoFactory.getProductDao().getAllProducts();
	}
	
	@GET @Path("/allJson") @Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAllProductsInJson() {
		return DaoFactory.getProductDao().getAllProducts();
	}
	
	@GET @Path("/xml/{id}") @Produces(MediaType.APPLICATION_XML)
	public Product getProductInXml(@PathParam("id") Long id) {
		/*ProductDao dao = DaoFactory.getProductDao();
		Product product = dao.findProductById(id);
		return product;*/
		return DaoFactory.getProductDao().findProductById(id);
	}
	
	@GET @Path("/json/{id}") @Produces(MediaType.APPLICATION_JSON)
	public Product getProductInJson(@PathParam("id") Long id) {
		ProductDao dao = DaoFactory.getProductDao();
		Product product = dao.findProductById(id);
		return product;
	}
	
	@POST @Path("/remove/{id}") @Consumes(MediaType.APPLICATION_JSON)
	public Response removeProduct(@PathParam("id") Long id) {
		ProductDao dao = DaoFactory.getProductDao();
		Product product = dao.findProductById(id);
		dao.removeProduct(product);
		String productUri = "/"+product.getId();
		return Response.created(URI.create(productUri)).build();
	}
	
	
	@POST @Path("/add") 
	public Response addProduct(Product product) {
		DaoFactory.getProductDao().addProduct(product);
		String productUri = "/"+product.getId();
		return Response.created(URI.create(productUri)).build();
	}
	@GET
	public String getTest() {
		return "Coucou";
	}
}
