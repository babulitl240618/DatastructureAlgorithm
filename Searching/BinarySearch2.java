public class BinarySearch2{
	public static void main(String[]args){
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,30};
		int n = arr.length;
		int key = 70;

		if(binarySearch(arr, n, key)){
			System.out.println("The number is found");
			}else{
				System.out.println("The number is not found");
				}
		}

	public static boolean binarySearch(int[]arr, int n, int key){
		int left = 0;
		int right = n-1;


		while(left<=right){
			int mid = (left+right)/2;
			if(arr[mid]==key){
				return true;
				}else if(arr[mid]<key){
					left = mid+1;
				}else{
					right = mid-1;
					}
			}
			return false;
		}
}