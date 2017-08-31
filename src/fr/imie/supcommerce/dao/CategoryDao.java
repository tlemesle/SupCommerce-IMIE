package fr.imie.supcommerce.dao;

import java.util.List;

import fr.imie.supcommerce.entity.Category;

public interface CategoryDao {
	Category addCategory(Category category);
	Category findCategoryById(Long id);
	List<Category> getAllCategories();
	void updateCategory(Category category);
	void removeCategory(Category category);
}
