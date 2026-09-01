
import java.util.*;

class Student{
	String name;
	int marks;
	
	Student(String name,int marks){
		this.name = name;
		this.marks = marks;
	}
	
}

public class ClassDemo {
	
	public static void display(Student[] list) {
		for(Student s:list) {
			System.out.println("Name: "+s.name+", Marks: "+s.marks);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student[] list = new Student[4];
		list[0] = new Student("Shivansh",100);
		list[1] = new Student("Ayran",12);
		list[2] = new Student("Krishna",90);
		list[3] = new Student("Jatin",67);
		
		
		Arrays.sort(list, Comparator.comparingInt((Student s) -> s.marks).reversed());
		
		display(list);
		
	}

}
