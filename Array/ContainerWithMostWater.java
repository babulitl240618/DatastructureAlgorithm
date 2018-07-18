public class ContainerWithMostWater{
	public static void main(String[]args){
		int arr[] = {1,8,6,2,5,4,8,3,7};
		int maxarea = containerWithMostWater(arr);
		System.out.println(maxarea);
		}

	public static int containerWithMostWater(int arr[]){
		int left, right, maxarea;

		left = 0;
		right = arr.length - 1;
		maxarea = 0;

		while(left<right){
			maxarea = Math.max(maxarea, Math.min(arr[left], arr[right])*(right-left));
			if(arr[left]<arr[right]){
				left++;
				}else{
					right--;
					}
			}
			return maxarea;

		}
}

public class babul{
	public static void main(String[]args){
		
	}
}