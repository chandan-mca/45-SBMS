package in.ashokit.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;
import in.ashokit.service.EmailService;
import in.ashokit.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	
	private final EmailService emailService;
	
	public StudentServiceImpl(StudentRepository studentRepository, EmailService emailService) {
		this.studentRepository = studentRepository;
		this.emailService = emailService;
	}

	@Override
	public boolean saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		
		//email send logic
		String subject = "Student Registartion";
		//String body    = "You have sucessfully registered in Ashok IT.";
		String body    = "<h1>You have sucessfully registered in Ashok IT.</h1>"
				+ "<br><h2>Welcome to Ashok IT</h2>";
				
				//		+ "<br><h2>Welcome to Ashok IT</h2>";
		emailService.sendEmail2(subject,  body, student.getEmail());
		
		return savedStudent.getSid() != null;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void delete(Integer sid) {
		studentRepository.deleteById(sid);
	}

}
