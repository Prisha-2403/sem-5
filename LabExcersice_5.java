package CollegeSem5;
import java.util.*;

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
	    return "Name: " + name + ", Marks: " + marks +"\n";
	}
}

public class LabExcersice_5 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> st = new ArrayList<>();
		
		Student a = new Student("Krishna",92);
		Student b = new Student("Shivansh",100);
		Student c = new Student("Jatin",67);
		Student d = new Student("Aryan",0);
		
		st.add(d);
		st.add(a);
		st.add(c);
		st.add(b);
		
		
		
		System.out.println("Before:\n" + st);
		
		
		st.sort(Comparator.comparingInt(Student::getMarks).reversed());
		
		System.out.println("After:\n" + st);
		

	}

}
