package sg.nus.iss.ft6.gui;

import java.io.IOException;
import java.util.ArrayList;

import sg.nus.iss.ft6.domain.Category;
import sg.nus.iss.ft6.domain.Product;
import sg.nus.iss.ft6.domain.Store;

public class StoreApplication {
	
	private Store store;
	private StoreWindow storeWindow;
	
	public StoreApplication() throws IOException {
		// TODO Auto-generated constructor stub
		store=new Store();
		storeWindow=new StoreWindow(this);
	}
	
	public Store getStore(){
		return this.store;
	}
	
	public StoreWindow getStoreWindow(){
		return this.storeWindow;
	}
	
	public void start() throws IOException{
		store.readDataFromFile();
		storeWindow.refresh();
		storeWindow.setVisible(true);
		
	}
	
	public void shutdown() throws IOException{
		store.writeDataToFile();
		System.exit(0);
	}
	
	public void removeSelectedProduct(){
		Product selectedProduct=storeWindow.getSelectedProduct();
		if(selectedProduct==null){
			return;
		}
		store.removeProduct(selectedProduct);
	}
	
	public ArrayList<Category> getCategories(){
		return store.getCategories();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StoreApplication storeApplication=new StoreApplication();
//			Category temp=new Category("CLO", "clothes");
//			storeApplication.getStore().getProductReg().addProduct(temp,"specialCLO", "a new kind of CLO very beautiful", 6, 56.9, "1314520", 3, 6);
//			storeApplication.getStore().getProductReg().writeListToFile();
			storeApplication.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
