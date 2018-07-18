import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TwoSum{
	public static void main(String[]args){

		int target, len;
		int nums[];

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your target value");
		target = in.nextInt();

		System.out.println("Enter length of array");
		len = in.nextInt();

		nums = new int[len];

		System.out.println("Enter value of array");
		for(int i = 0; i<len; i++){
			nums[i] = in.nextInt();
			}

		int[] arr = twoSum(target, nums);

		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
			}
		}

		public static int[] twoSum(int target, int[] nums){
			int[] arr = new int[2];
			Map<Integer, Integer> map = new HashMap<>();
			for(int i = 0; i<nums.length; i++){

					Integer value = map.get(target-nums[i]);
					if(value==null){
						map.put(nums[i],i);
						}else{
							arr[0] = value;
							arr[1] = i;
							break;
							}
				}

			return arr;
			}
	}