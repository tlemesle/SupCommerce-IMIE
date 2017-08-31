package fr.imie.supcommerce.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.imie.supcommerce.dao.CategoryDao;
import fr.imie.supcommerce.entity.Category;
import fr.imie.supcommerce.entity.Product;

public class JpaCategoryDao implements CategoryDao{

	EntityManagerFactory emf = null;

	public JpaCategoryDao(EntityManagerFactory emf) {
		// TODO Auto-generated constructor stub
		this.emf = emf;
	}

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(category);
		t.commit();
		return category;
	}

	@Override
	public Category findCategoryById(Long id) {
		// TODO Auto-generated method stub
		Category category = new Category();
		EntityManager em = emf.createEntityManager();
		category = em.find(Category.class, id);
		em.close();
		return category;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT c FROM Category AS c");
		List<Category>categories = query.getResultList();
		return categories;
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(Category category) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		Query  query = em.createQuery("DELETE FROM Category AS c WHERE c.id = :id");
		query.setParameter("id", category.getId());
		int nbrDeleted = query.executeUpdate();
		t.commit();
		em.close();
	}

}
