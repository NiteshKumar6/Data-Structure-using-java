package javadsa;
import java.io.*;
import java.util.*;
public class countocr {
          static int countofelement(int a[],int x)
          {
        	  int count=0;
        	  for(int i=0;i<a.length;i++) {
        		  if(a[i]==x) 
        			 count++;
        		  
        	  }
        	  return count;
          }
          public static void main(String args[]) {
        	  int []a= {1,2,3,4,1};
        	  System.out.println(countofelement(a,1));
        	  
          }
}
