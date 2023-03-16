package com.jdc04.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jdc04.entity.Courses;

@Service
public class couresserviceImpl implements courseservice {

	List<Courses>list;
	
public couresserviceImpl() {
	list= new ArrayList<>();
	list.add(new Courses(101, "java", "java is the independent"));
	list.add(new Courses(102, "python", "python is langauge"));
	list.add(new Courses(103, "HTml", "HTML is langauge"));
}
	
	@Override
	public List<Courses> getcourses() {
		return list;
		
	}

	@Override
	public Courses getcourses(long id) {
		
		Courses c=null;
		for(Courses courses:list) {
			
			if(courses.getId()==id) {
				c=courses;
				break;
				
			}
		}
		
		return c;
	}

	@Override
	public Courses addcourses(Courses courses) {
		
		list.add(courses);
		return courses;
	}

}
