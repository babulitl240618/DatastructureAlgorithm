public class BubbleSort{
	public static void main(String[]args){
		int arr[] = {10,50,40,80,90,5};
		int n = arr.length;
		bubbleSort(arr, n);

		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
			}
		}

	public static void bubbleSort(int[]arr, int n){
		int i, j, tmp;

		for(i = 0; i<n; i++){
			for(j = 0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					}
				}
			}
	}
}