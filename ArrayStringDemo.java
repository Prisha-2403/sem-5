
public class ArrayStringDemo {
	
	public static String[] fail(int[] arr) {
		String[] s = new String[arr.length];
		for(int i =0;i<s.length;i++) {
			if(arr[i]>=90) {
				s[i] = "Grade A";
			}
			else if(arr[i]>=70) {
				s[i] = "Grade B";
			}
			else if(arr[i]>=55) {
				s[i] = "Grade C";
				
			}
			else if(arr[i]>=40) {
				s[i] = "Grade D";
			}
			else {
				s[i] = "fail";
			}
		}
		return s;
	}

	public static void main(String[] args) {

		int[] marks = {100,40,27,36,10};
		
		int[] scores = {1,2,3,4,5};
		
		int first = scores[3];
		
		scores[2] = 24;
		
		System.out.println(scores.length);
		
		
		String[] s = {"Krishna","Shivansh","Aryan","Jatin"};
		
		String[] s1 = new String[5];
		
		String a = s[2];
		
		s[2] = "Arif";
		
		System.out.println(s.length);
		
		String[] grades = fail(marks);
		
		
		for(int i = 0;i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		
	}

}
