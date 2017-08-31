package fr.imie.supcommerce.dao;

import java.util.ArrayList;
import java.util.List;

import fr.imie.supcommerce.entity.Product;

public class ProductDaoOld {
	
	public static List<Product> listProduct = new ArrayList<Product>();
	
	public static List<Product> getAllProducts() {
		//System.out.println("List of product : ");
		//System.out.println(listProduct);
		return listProduct;
	}
	
	public static void addProduct(Product p) {
		//p.setId(listProduct.size()+1);
		//listProduct.add(p);
		//System.out.println("Added to the list");
		//System.out.println(listProduct);
	}
	
	public static Product findProduct(long id) {
		/*for (Product product : listProduct) {
			if(product.getId() == id) {
				return product;
			}
		}*/
		return null;
	}
	
	public static void removeProduct(long id) {
		/*for(Product product : listProduct) {
			if(product.getId() == id) {
				listProduct.remove(product);
				return;
			}
		}*/
	}
}
