package fr.imie.supcommerce.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.entity.Product;

public class JpaProductDao implements ProductDao{

	EntityManagerFactory emf = null;

	public JpaProductDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(product);
		t.commit();
		return product;
	}

	@Override
	public Product findProductById(Long id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		EntityManager em = emf.createEntityManager();
		product = em.find(Product.class, id);
		em.close();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p FROM Product AS p");
		List<Product>products = query.getResultList();
		return products;
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		Query  query = em.createQuery("DELETE FROM Product AS p WHERE p.id = :id");
		query.setParameter("id", product.getId());
		int nbrDeleted = query.executeUpdate();
		t.commit();
		em.close();
	}

	@Override
	public List<Product> getAllProductsLowerThan(float price) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p FROM Product AS p WHERE p.price < ?1");
		query.setParameter("1", price);
		List<Product>products = query.getResultList();
		return products;	
		}
}
