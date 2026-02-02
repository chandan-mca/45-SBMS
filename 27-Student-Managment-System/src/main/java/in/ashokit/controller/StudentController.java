package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	// method to display empty form
	@GetMapping("/student")
	public String loadForm(Model model) {
		//model.addAttribute("msg", "Hi");
		return "index";
	}
	
	// method to display empty form
		@GetMapping("/")
		public ModelAndView index() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			return mav;
		}

	// method to save student form data
	@PostMapping("/saveStudent")
	public ModelAndView handleSubmitBtn(Student s) {
		ModelAndView mav = new ModelAndView();
		boolean isSaved = studentService.saveStudent(s);
		if (isSaved) {
			mav.addObject("smsg", "Student Saved");
		} else {
			mav.addObject("emsg", "Failed To Save");
		}
		mav.setViewName("index");
		return mav;
	}

	// method to get all students data

	@GetMapping("/getData")
	public ModelAndView getAllStudents() {
		List<Student> stuList = studentService.getAllStudents();
		ModelAndView mav = new ModelAndView();
		mav.addObject("students", stuList);
		mav.setViewName("data");
		return mav;
	}

	@GetMapping("/delete")
	public ModelAndView deleteRecord(@RequestParam("sid") Integer sid) {
		studentService.delete(sid);
		List<Student> stuList = studentService.getAllStudents();
		ModelAndView mav = new ModelAndView();
		mav.addObject("students", stuList);
		mav.addObject("msg", "Deleted Successfully");
		mav.setViewName("data");
		return mav;
	}

}
