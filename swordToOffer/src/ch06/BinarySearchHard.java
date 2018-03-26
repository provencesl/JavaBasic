package ch06;

public class BinarySearchHard {
	
	
	/*
	 * 查找第一个大于等于某个数的下标
	 */
	public static int firstGreatOrEqual(int data[],int key){
		
		int low = 0;
		int high = data.length - 1;
		int mid = low + (high - low)/2;
		
		while(low <= high){
			if(key <= data[mid]){
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		return low <= data.length ? low : -1;
	}

	
	public static int firstGreat(int data[],int key){
		
		int low  = 0;
		int high = data.length - 1;
		int mid = low + (high - low)/2;
		
		while(low <= high){
			if(key < data[mid]){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
			
		return low <= data.length ? low : -1;
	}
	
	public static void main(String[] args){
		
		int data[] = {1,2,2,2,4,8,10};
		int key = 2;
		int result1 = firstGreat(data, key);
		int result2 = firstGreatOrEqual(data, key);
		System.out.println(result1);
		System.out.println(result2);
	}
	
}
