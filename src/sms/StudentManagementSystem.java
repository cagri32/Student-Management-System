package sms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import sms.StudentInfo;
import sms.CourseInfo;

public class StudentManagementSystem {
		
	HashMap<Integer, CourseInfo> courses;
	HashMap<String, StudentInfo > students;
	
		public StudentManagementSystem() {
			courses = new HashMap<>();
		    students = new HashMap<>();
			
		}
		
		
		
		public void addStudent(String id, StudentInfo info) 
                throws IdAlreadyExistsExceptoin
		{
			if(students.containsKey(id)) {
				throw new IdAlreadyExistsExceptoin("Id Already Exists");
			}else {
			this.students.put(id, info);
			}
			
			
		}
		public void removeStudent(String id)  throws IdNotFoundException{
			if(!students.containsKey(id)) {
				throw new IdNotFoundException("");
			}
			this.students.remove(id);
		}
		
		public void addCourse(int id, CourseInfo info)  
				throws IdAlreadyExistsExceptoin
		{
			if(courses.containsKey(id)) {
				throw new IdAlreadyExistsExceptoin("");
			}
			
			this.courses.put(id, info);
			
		}
		
		public void removeCourse(int id) throws IdNotFoundException {
			if(!courses.containsKey(id)) {
			throw new IdNotFoundException("");
			}
			this.courses.remove(id);
		}
		
		public void changeCourse(String eid, int did)   
				throws IdNotFoundException
		{
			if(!students.containsKey(eid)|| !this.courses.containsKey(did)) {
				throw new IdNotFoundException("");
			}
			this.students.get(eid).setId(did);			
		}
		
		public String getStudentName(String id)  
				throws IdNotFoundException
		{
			if(!students.containsKey(id)) {
				throw new IdNotFoundException("");
			}
			return this.students.get(id).getName();
		}
		
		public  ArrayList<String>  getStudentNames(int id){
			ArrayList<String> alist = new ArrayList<String>();
			for(StudentInfo s : this.students.values()) {
				if(s.getId() == id) {
					alist.add(s.getName());
				}
			}
			return alist;
		}
		
		public CourseInfo getCourseInfo(String id) 
				throws IdNotFoundException 
		{
			if(!students.containsKey(id)) {
				throw new IdNotFoundException("");
			}
			
			return this.courses.get(this.students.get(id).getId());
		}
		
		public StudentInfo[] getSortedStudentInfo() {
			StudentInfo[] a = new StudentInfo[students.size()];
			for(StudentInfo s : this.students.values()) {
				
			}
			a = (StudentInfo[]) this.students.values().toArray();
			Arrays.sort(a);
			return a;
			/*
			ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
			
			
			for (String str : this.students.keySet())
		    {
				
		    	StudentInfo st = students.get(str);
		    	list.add(st);
		    	
		    }
			
			StudentInfo[] sortedList = new StudentInfo[list.size()];
			
			for (int i = 0; i < sortedList.length; i++)
			{
				sortedList[i] = list.get(i);
			}
			
			Arrays.sort(sortedList);
			
			return sortedList; 
			*/
		}
		
		public double getAveragePercentage(int id)    
				throws IdNotFoundException{
			if(!courses.containsKey(id)) {
				throw new IdNotFoundException("");
			}
			double result = 0;
			int count = 0;
			for(StudentInfo s : this.students.values()) {
				if(s.getId() == id) {
					result += s.getPercentage();
					count++;
				}
			}
			result /= count;
			return result;
		}
		
}
