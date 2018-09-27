package com.yagizhanbadir.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentCheckBox {
	
	private String firstName;
	private String lastName;
	private String[] favoriteLanguages;
	
	public StudentCheckBox() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
	
	

}
