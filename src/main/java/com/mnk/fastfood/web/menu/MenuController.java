package com.mnk.fastfood.web.menu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mnk.fastfood.model.menuitem.MenuItem;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@GetMapping("/")
	public String menu(Model model) {
		
		model.addAttribute("menuitems", new MenuItem[] {
				new MenuItem("Kebab"),
				new MenuItem("Pizza"),
				new MenuItem("Dodatki"),
				new MenuItem("Napoje")
		});
		
		return "menu";
	}
}
