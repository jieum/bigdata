package com.t3q.hashcode;

import java.util.HashMap;
import java.util.Map;


public class OverrideToHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("car", "sonata");
		String car = map.get("car");
		System.out.println("car:"+car);
		
		Map<Student,String> m = new HashMap<Student,String>();
		
		m.put(new Student(20113263,"김성국","Computer Science"),"Sean");
		
		String studentStr = m.get(new Student(20113263,"김성국","Computer Science"));
		System.out.println("studentStr:"+studentStr);
		
		Student geniusStudent = new Student(20113263,"김성국","Computer Science");
		m.put(geniusStudent, "박아무개");
		studentStr = m.get(geniusStudent);
		System.out.println("studentStr2:"+studentStr);
	}

}
