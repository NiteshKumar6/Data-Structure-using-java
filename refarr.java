package javadsa;

public class refarr {
   public static void main(String args[])
   {
	   int []a= {1,2,6,8};
	   int n=a.length;
	   int []b=new int[n];
	   b=a;
	   System.out.println("Original array is :");
	   for(int i=0;i<n;i++) {
		   System.out.println(a[i] +" ");
	   }
	   System.out.println("Reference array is :");
	   for(int i=0;i<n;i++) {
		   System.out.println(b[i]);
	   }
	   
   }
}
