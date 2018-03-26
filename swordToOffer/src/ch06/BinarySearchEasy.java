package ch06;

public class BinarySearchEasy {

	/*
	 * while(low<high)达到循环查找
	 */
	public static int BinarySearch(int data[],int key){
		int low = 0;
		int high = data.length - 1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(data[mid] == key){
				return mid;
			}
			else if(data[mid] > key){
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		return -1;
	}
	
	
	public static int binarySearchRecursive(int data[],int key,int low,int high){
		
		int mid = low + (high - low)/2;
		
		if(key<data[low] || key > data[high] || low > high){
			return -1;
		}
		
		System.out.println("====");
		
		if(key == data[mid]){
			return mid;
		}
		else if(key > data[mid]){
			return binarySearchRecursive(data, key, mid+1, high);
		}else{
			return binarySearchRecursive(data, key, low, mid-1);
		}
		
		
	}
	
	public static void main(String[] args){
		
		int data[] = {1,3,5,7,9,11};
		int key = 3;
		int result1 = BinarySearch(data, key);
		int result2 = binarySearchRecursive(data, key, 0, data.length - 1);
		System.out.println(result1);
		System.out.println(result2);
	}
	
}
