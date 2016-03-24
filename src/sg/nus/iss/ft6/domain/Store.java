package sg.nus.iss.ft6.domain;

import java.io.IOException;
import java.util.ArrayList;

public class Store {
	private ProductReg pr;
	private CategoryReg cr;
	
	public Store() throws IOException {
		// TODO Auto-generated constructor stub
		
		cr=new CategoryReg();
		
		pr=new ProductReg(this);
	}
	
	public ProductReg getProductReg(){
		return pr;
	}
	
	public CategoryReg getCategoryReg(){
		return cr;
	}
	
	public void readDataFromFile() throws IOException{
		pr.createListFromFile();
	}
	
	public void writeDataToFile() throws IOException{
		pr.writeListToFile();
	}
	
	public void removeProduct(Product p){
		pr.removeProduct(p);
	}
	
	public ArrayList<Category> getCategories(){
		return cr.getCategories();
	}

}
