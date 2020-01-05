package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.web;
import com.example.demo.jpa.webjpa;


@RestController
public class web1 {
	@Autowired
	 webjpa webjpa;
@RequestMapping("/add1")
public web add(@RequestBody web student)
{
	return webjpa.save(student);
}

	@RequestMapping(value="/get",method=RequestMethod.GET,headers="Accept=application/json")
	public List<web> getAllUser()
	{
		List<web> tasks=webjpa.findAll();
				return tasks;
	}
@RequestMapping(value="/delete",method=RequestMethod.DELETE)
public List<web> deleteAllUser()
{
System.out.println("Deleting all user");
List<web> tasks=webjpa.findAll();
return tasks;
}
				
@RequestMapping(value="/deletebyid/{id}",method=RequestMethod.GET,headers="Accept=application/json")
public void deletestudent(@PathVariable long id)
{
	webjpa.deleteById(id);
}

@RequestMapping(value="/count",method=RequestMethod.GET,headers="Accept=application/json")
public long getcount()
{
	long tasks=webjpa.count();
	return tasks;
}
/*@RequestMapping(value="/update",method=RequestMethod.PUT,headers="Accept=application/json")
public web updateloe(@RequestBody web entity)
{
	return webjpa.flush(entity);
}
*/
}






