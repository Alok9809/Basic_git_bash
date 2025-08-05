

public class linear_Search {
	public static int linearSearch(int arr[],int n) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
	public static int BinarySearch(int arr[],int key) {
		int start = 0;int end = arr.length-1;
		while(start<end) {
			int mid = (start+end)/2;
			if(arr[mid]==key) {
				return mid;
	
			}if(arr[mid]<key) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int idx = BinarySearch(arr,4);
		System.out.println(idx);

	}

}
