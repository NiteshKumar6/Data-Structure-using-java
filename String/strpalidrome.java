package javadsa.String;
import java.util.*;
public class strpalidrome {
	
	   public static int countPalindromes(String s) {
	       int n = s.length();
	       int count = 0;
	       for (int i = 0; i < n; i++) {
	           // counting odd palindrome with index i as center
	           int left = i, right = i;
	           while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
	               count++;
	               left--;
	               right++;
	           }


	           // counting even length palindrome with index i as center
	           left = i;
	           right = i + 1;
	           while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
	               count++;
	               left--;
	               right++;
	           }
	       }
	       return count;
	   }




	   public static void main(String[] args) {
		   System.out.println("Enter your choice : ");
	       Scanner sc = new Scanner(System.in);
	       String s = sc.next();
	       System.out.println(countPalindromes(s));
	   }
	}


