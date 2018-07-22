public class SelectionSort2{
	public static void main(String[]args){
		int arr[] = {10,50,40,80,90,5};
		int n = arr.length;
		selectionSort(arr, n);
		System.out.println(n);
		for(int i = 0; i<n; i++){
			System.out.println(arr[i]);
			}
		}

	public static void selectionSort(int[]arr, int n){

		for(int i = 0; i<n-1; i++){
			int min_index = i;
			for(int j = i+1; j<n; j++){
				if(arr[min_index]>arr[j]){
					min_index = j;
					}
				}
				if(min_index!=i){
					int tmp = arr[i];
					arr[i] = arr[min_index];
					arr[min_index] = tmp;
					}
			}

		}
}