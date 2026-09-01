package CollegeSem5;
import java.util.*;

public class Idek {
	
	public static String reverse(String str) {
	    String reversed = "";

	    for (int i = str.length() - 1; i >= 0; i--) {
	        reversed += str.charAt(i);
	    }

	    return reversed;
	}
	
	public static int secondLargest(int[] arr) {
	    int largest = arr[0];
	    int second = arr[0];

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            second = largest;
	            largest = arr[i];
	        } 
	        else if (arr[i] > second && arr[i] != largest) {
	            second = arr[i];
	        }
	    }

	    return second;
	}
	
	public static int[] mergeRemoveDuplicates(int[] a, int[] b) {
	    int[] temp = new int[a.length + b.length];
	    int size = 0;

	    for (int x : a) {
	        boolean found = false;

	        for (int i = 0; i < size; i++) {
	            if (temp[i] == x) {
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            temp[size++] = x;
	        }
	    }

	    for (int x : b) {
	        boolean found = false;

	        for (int i = 0; i < size; i++) {
	            if (temp[i] == x) {
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            temp[size++] = x;
	        }
	    }

	    int[] result = new int[size];

	    for (int i = 0; i < size; i++) {
	        result[i] = temp[i];
	    }

	    return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = reverse("Hello");
	    System.out.println(result);
	    
	    
	    int[] arr = {10, 5, 20, 8, 15};

	    System.out.println(secondLargest(arr));
	    
	    
	    int[] a = {1, 2, 3, 4};
	    int[] b = {3, 4, 5, 6};

	    int[] result1 = mergeRemoveDuplicates(a, b);

	    System.out.println(Arrays.toString(result1));
	    
	    
	    
	    

	}

}
