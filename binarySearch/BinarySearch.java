package binarySearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[]bs= {23,35,67,78,89,560};
		System.out.println(binary_search(bs,67,0,5));
	}
public static int search(int[] data, int toFind, int count)
	 {
	    //  Start = 0 (beginning index)
	    //  End = count - 1 (top index)
	    return binary_search(data, toFind, 0, count-1);
	 }
	
public static	int binary_search(int[] data, int toFind, int start, int end)
	 {
	    //Get the midpoint.
	    int mid = start + (end - start)/2;   //Integer division

	    //Stop condition.
	    if (start > end)
	       return -1;
	    else if (data[mid] == toFind)        //Found?
	       return mid;
	    else if (data[mid] > toFind)         //Data is greater than toFind, search lower half
	       return binary_search(data, toFind, start, mid-1);
	    else                                 //Data is less than toFind, search upper half
	       return binary_search(data, toFind, mid+1, end);
	 }
}
