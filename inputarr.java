package javadsa;
import java.util.*;
public class inputarr {
        public static void main(String args[])
        {
        	System.out.println("Enter the elements :");
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	int []arr=new int[n];
//        	arr[i]=sc.nextInt();
        	for(int i=0;i<n;i++) {
        		arr[i]=sc.nextInt();
        	}
        	System.out.println("Array Elements are");
        	for(int i=0;i<n;i++) {
        	System.out.println(arr[i]);
        }
        
}
}
