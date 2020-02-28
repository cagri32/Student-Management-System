package sms;
import java.lang.Object;
import sms.StudentInfo;

public class CourseInfo {
	String name;
	String instructor;

	public CourseInfo(String name, String instructor) {
		this.name = name;
		this.instructor = instructor;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getinstructor() {
		return this.instructor;
	}
	
	public void setinstructor(String instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((CourseInfo) obj).getName())
				&& this.getinstructor().equals(((CourseInfo) obj).getinstructor());
	}
}
