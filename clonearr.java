package javadsa;

public class clonearr {
	public static void main(String args[]) {
		int []a= {1,2,3};
		int n =a.length;
		int b[]=a.clone();
		b[0]=5;
		System.out.println("Original array is :");
		for(int i=0;i<n;i++) {
			System.out.println(a[i] +" ");
		}
		System.out.println("Cloned array is :");
		for(int i=0;i<n;i++) {
			System.out.println(b[i] +" ");
		}
		
	}
}
