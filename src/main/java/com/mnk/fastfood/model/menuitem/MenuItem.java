package com.mnk.fastfood.model.menuitem;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class MenuItem {

	private String name;

	public MenuItem(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
