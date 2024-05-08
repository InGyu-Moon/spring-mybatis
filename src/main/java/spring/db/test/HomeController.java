package spring.db.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
public class HomeController {
	
	@Autowired
	private MyShopDao myShopDao;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<MyShopDto> list = myShopDao.getAllList();
		
		model.addAttribute("list", list);
		model.addAttribute("totalCount",list.size());
		
		return "home";
	}
	
}
