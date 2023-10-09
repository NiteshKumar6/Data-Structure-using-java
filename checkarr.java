package javadsa;

public class checkarr {
        static boolean check(int a[]) {
        	boolean ans=true;
        	for(int i=1;i<a.length;i++) {
        		if(a[i]<a[i-1])
        			ans=false;
        	}
        	return ans;
        }
        public static void main(String args[]) {
        	int[]a= {1,2,3,4,5};
        	System.out.println(check(a));
        }
}
