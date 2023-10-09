package javadsa;
import java.util.*;
class pair{
	public int min;
	public int max;
}
class maxmin {
	static pair getMinMax(int arr[],int n) {
		pair minmax=new pair();
		Arrays.sort(arr);
		minmax.min=arr[0];
		minmax.max=arr[n-1];
		return minmax;
	}
public static void main (String args[]) {
	int arr[]= {1000,11,5,200,300};
	int arr_size=arr.length;
	pair minmax = getMinMax(arr,arr_size);
	System.out.println("Minimum Element is ="+minmax.min);
	System.out.println("Maximum Element is ="+minmax.max);
	
}
}
