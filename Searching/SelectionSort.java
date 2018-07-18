public class SelectionSort{
	public static void main(String[]args){
		int arr[] = {9,8,7,5,4,6,2,1,5,64};
		int n = arr.length;
		sort(arr, n);

		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
			}
		}

	public static void sort(int[]arr, int n){

		for(int i = 0; i<n-1; i++){
			int min_index = i;
			for(int j = i+1; j<n; j++){
				if(arr[min_index]>arr[j]){
					min_index = j;
					}
				}
				if(min_index!=i){
					int temp = arr[i];
					arr[i] = arr[min_index];
					arr[min_index] = temp;
					}
			}
		}
	}