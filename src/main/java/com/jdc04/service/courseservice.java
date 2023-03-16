package com.jdc04.service;

import java.util.List;

import com.jdc04.entity.Courses;

public interface courseservice {

	public List<Courses>getcourses();
	
	public Courses getcourses(long id);

	public Courses addcourses(Courses courses);
}
