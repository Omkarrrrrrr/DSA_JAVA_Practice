package in;

public class BinarySearchRec {

	public static int binarySearch(int [] arr, int target , int s ,int  e) {
		
		int mid = s + (e-s) / 2;
		
		if(arr[mid]  == target) {
		
			return mid;
		}
		else if(target > arr[mid]) {
			
			return binarySearch(arr,target, mid + 1,e);
			
		}
		else {
			return binarySearch(arr,target, s,mid);
		}
		
		
	}
	public static void main(String[] args) {
		
		int [] arr = {2,4,5,6,7,8,9};
	    System.out.print(binarySearch(arr, 9, 0, arr.length-1));
	}

}
