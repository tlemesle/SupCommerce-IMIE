package fr.imie.supcommerce.dao;

import fr.imie.supcommerce.dao.jpa.JpaCategoryDao;
import fr.imie.supcommerce.dao.jpa.JpaProductDao;
import fr.imie.supcommerce.util.PersistenceManager;

public class DaoFactory {

	private DaoFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static ProductDao getProductDao() {
		return new JpaProductDao(PersistenceManager.getEntityManagerFactory());
	}
	
	public static CategoryDao getCategoryDao() {
		return new JpaCategoryDao(PersistenceManager.getEntityManagerFactory());
	}
}