package javadsa;

public class lastocr {
	static int Lastoccurence(int arr[],int x) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) 
				index=i;
		
		}
		 return index;
	}
	public static void main(String args[])
	{
		int []arr= {1,2,3,4};
		System.out.println(Lastoccurence(arr,2));
		
	}
}
