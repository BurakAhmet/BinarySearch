public class BinarySearch {
	public static boolean binarySearch(int[] arr ,int x) {
		int low=0,high=arr.length-1;
		while(high>=low)
		{
			int mid=(high-low)/2+low;
			mid=(high-low)/2+low;
			if(arr[mid]==x)
			{
				System.out.printf("\nThe array has %d at index %d",x,mid);
				return true;
			}
			else if(arr[mid]<x)
			{
				low=mid+1;
			}
			else if(arr[mid]>x)
			{
				high=mid-1;
			}
		}
		System.out.printf("The array hasn't %d",x);
		return false;
	}
}
