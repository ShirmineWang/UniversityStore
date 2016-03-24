package sg.nus.iss.ft6.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class CategoryReg {
	private ArrayList<Category> categories;
	
	public CategoryReg(){
		categories=new ArrayList<>();
		Category temp=new Category("CLO", "clothes");
		Category temp2=new Category("STA","station");
		categories.add(temp);
		categories.add(temp2);
	}
	
	public ArrayList<Category> getCategories(){
		return categories;
	}
	
	public Category getCategoryByCode(String code){
		Iterator<Category> i=categories.iterator();
		while (i.hasNext()) {
			Category category = (Category) i.next();
			if(category.getCode().equals(code)){
				return category;
			}
		}
		return null;
	}
	
	public Category getCategoryByName(String name){
		Iterator<Category> i=categories.iterator();
		while (i.hasNext()) {
			Category category = (Category) i.next();
			if(category.getName().equals(name)){
				return category;
			}
		}
		return null;
	}
	
}
