public class BinarySearch{
	public static void main(String[]args){
		int arr[] = {1,3,4,5,6,7,8,9,15,16,18,19,20,50,60,90,95};
		int n = arr.length;
		int key = 20;

		boolean isFound = binarySearch(arr, key, n);

		if(isFound){
			System.out.println("The number is found");
			}else{
				System.out.println("The number is not found");
				}
		}

	public static boolean binarySearch(int[] arr, int key, int n){

		int left = 0;
		int right = n - 1;

		while(left<=right){
			int mid = (left+right)/2;
			if(arr[mid]==key){
				return true;
				}
			if(arr[mid]<key){
				left = mid+1;
				}else{
					right = mid-1;
					}
			}
			return false;
		}
	}