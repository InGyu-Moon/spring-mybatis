package spring.db.test.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/samsung")
public class CarController {
	@Autowired
	private CarDao carDao;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		int totalCount = carDao.getTotalCount();
		List<CarDto> list=carDao.getTotalCarList();

		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);
			
		return "car/carList";
	}
	
	@GetMapping("/writeform")
	public String carForm() {
		return "car/addForm";
	}
	@PostMapping("/write")
	public String insert(@ModelAttribute CarDto cardto) {
		carDao.insertCar(cardto);
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public String uform(@RequestParam String num,Model model){
		
		System.out.println("asd");
		CarDto carDto=carDao.getData(num);
		model.addAttribute("dto", carDto);
		System.out.println("asd");
		return "car/updateForm";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute CarDto dto){
		
		carDao.updateCar(dto);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam String num) {
		carDao.deleteCar(num);
		return "redirect:list";
	}
	
}
