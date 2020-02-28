package sms;
import java.lang.Object;
import java.util.Comparator;

public class StudentInfo {
	
	String name;
	double percentage;
	int Id;
	
	public StudentInfo(String name, double percentage, int Id){
		this.Id = Id;
		this.name = name;
		this.percentage = percentage;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPercentage() {
		return this.percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public int getId() {
		return this.Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	

	public int compareTo(StudentInfo other) {
		if(this.percentage>other.percentage)
		{ 
			return -1;
		}
		else if(this.percentage==other.percentage)
		{   
			if(this.Id>other.Id)
	      	{
				return -1;
		    }
			else 
		    {
		    	return 1;
		    }
		}
		else if(this.percentage<other.percentage)
		{
			return 1;
		}
		else 
		{
			return 1;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getId() != ((StudentInfo) obj).getId()) {
			return false;
		}
		if(!this.getName().equals(((StudentInfo) obj).getName())) {
			return false;
		}
		if(this.getPercentage() != ((StudentInfo) obj).getPercentage()) {
			return false;
		}
		if(this.getPercentage() == ((StudentInfo) obj).getPercentage() 
				&& this.getName().equals(((StudentInfo) obj).getName())
				&& this.getId() == ((StudentInfo) obj).getId()) {
			return true;
		}
		return true;
	}
	

}
