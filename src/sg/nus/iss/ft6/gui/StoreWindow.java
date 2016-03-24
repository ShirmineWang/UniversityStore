package sg.nus.iss.ft6.gui;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JFrame;

import sg.nus.iss.ft6.domain.Product;

public class StoreWindow extends JFrame {
	private StoreApplication storeApplication;
	private ProductPanel proPanel;
	private WindowListener windowListener=new WindowAdapter() {
		public void windowClosing(WindowEvent e){
			try {
				storeApplication.shutdown();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	};
	
	public StoreWindow(StoreApplication storeApplication){
		super("University Souvenir Management System");
		this.storeApplication=storeApplication;
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(windowListener);
		
		proPanel=new ProductPanel(this.storeApplication);
		
		Panel panel=new Panel();
		panel.setLayout(new GridLayout(0, 1));
		panel.add(proPanel);
		setContentPane(panel);
	}
	
	public void refresh(){
		proPanel.refresh();
	}
	
	public Product getSelectedProduct(){
		return proPanel.getSeclectedProduct();
	}
}
