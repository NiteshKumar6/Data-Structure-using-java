package javadsa;

public class swapint {
        static void swap(int a,int b) {
        	int temp=a;
        	a=b;
        	b=temp;
        	System.out.println("Value after swapping");
        	System.out.println("Value of a a is="+" " + a +" Value of b is ="+b);
        	
        }
        public static void main(String args[]) {
        	swap(10,20);
        }
}
