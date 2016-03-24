package sg.nus.iss.ft6.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * author:WangXuemin
 */
public class Category {
	private String code;
	private String name;
	private ArrayList<Vendor> vendorList;
	
	public Category(){
		this.code = "";
		this.name = "";
	}
	public Category(String code,String name){
		this.code = code;
		this.name = name;
	}
	
	public Category(String code, String name, ArrayList<Vendor> vendorList) {
		super();
		this.code = code;
		this.name = name;
		this.vendorList = vendorList;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
