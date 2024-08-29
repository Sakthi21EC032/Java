package com.sakthi.web2;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@CrossOrigin("http://localhost:8081/")
@RequestMapping("/ece")

public class controller {



	@Autowired
	Repository repo;
		

	@PostMapping("/savedata")
	public String save(@RequestBody StudentModel d)
	{
		repo.save(d);
		return "insert success";
	}

	@GetMapping("/getdata")
	List<StudentModel> getdata(){
		return repo.findAll();
	}
	
	
}