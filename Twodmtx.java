package javadsa;
import java.util.*;
public class Twodmtx {
        public static void main(String args[]) {
        	int r;
        	int c;
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the number of row =");
        	 r=sc.nextInt();
        	System.out.println("Enter the number of Column =");
        	 c=sc.nextInt();
        	int arr1[][]=new int[r][c];
        	int arr2[][]=new int[r][c];
        	int ans[][]=new int[r][c];
        	int i,j,k;
        	System.out.println("Enter the First matrix elemnt =");
        	for(i=0;i<r;i++) {
        		for(j=0;j<c;j++) {
        			arr1[i][j]=sc.nextInt();
        			
        		}
        	}
        	System.out.println("Enter the Elements of Second Matrix=");
        	for(i=0;i<r;i++) {
        		for(j=0;j<c;j++) {
        			arr2[i][j]=sc.nextInt();
        }
        	}
        	System.out.println("Multiply of  Matrix=");
        	for(i=0;i<r;i++) {
        		for(j=0;j<c;j++) {
        			ans[i][j]=0;
        			for(k=0;k<c;k++) {
        				ans[i][j]+=arr1[i][k]*arr2[k][j];
        				
        			}
        		}
        	}
        	for(i=0;i<r;i++) {
        		for(j=0;j<c;j++) {
        			System.out.print(ans[i][j]+" ");
}   
        		System.out.println("");
}
        }
}
