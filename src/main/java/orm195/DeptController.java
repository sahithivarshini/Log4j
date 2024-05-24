package orm195;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import orm195.Dept;
import orm195.DeptDAO;

@Controller

public class DeptController {

	DeptDAO ddao;

	@Autowired

	public DeptController(DeptDAO dptdao) {

		ddao = dptdao;

	}

	/**
	 * 
	 * selects the Add New Employee view to render by returning its name.
	 * 
	 */

	@RequestMapping(value = "/deptlist", method = RequestMethod.GET)

	public String getAllDepts(Model model) {

		System.out.println("Departments List JSP Requested");

		// get all Departments from DAO

		List<Dept> deptList = ddao.findAll();

		// set it to the model

		model.addAttribute("dlist", deptList);

		// call the view

		return "deptlist";

	}

}
