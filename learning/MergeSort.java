import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[] list = {5, 3, 6, 2, 7, 1};

		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("Before sort:\n" + Arrays.toString(list));
		
		sort(list, 0, list.length - 1);
		
		System.out.println("After sort:\n" + Arrays.toString(list));
		
	}
	
	
	public static void sort(int[] list, int left, int right){
	    if(left >= right) { return; }
	    int mid = (left + right) / 2;
	    sort(list,  left, mid);
	    sort(list, mid + 1, right);
	    merge(list, left, mid, right);
	}
	
	public static void merge(int[] list, int left, int mid, int right){
	    //find length of subarrays
	    int leftLength = mid - left + 1;
	    int rightLength = right - mid;
	    
	    // create temp sub arrays
	    int[] leftList = new int[leftLength];
	    int[] rightList = new int[rightLength];
	    
	    // copy list into temp lists
	    // left is not always = 0
	    for(int i = 0; i < leftLength; i++){
	        leftList[i] = list[left + i];
	    }
	    // left + i ends at 49 if mid = 49 -> mid must = 50 (mid + 1)
	    for(int i = 0; i < rightLength; i++){
	        rightList[i] = list[mid + 1 + i];
	    }
	    // index of current sub array
	    int leftIndex = 0;
	    int rightIndex = 0;
	    
	    // copy back into array from left and right arrays
	    for(int i = left; i < right + 1; i++){
	        // if we have Uncopied elemnts in R and L, copy minimum
	        if(leftIndex < leftLength && rightIndex < rightLength){
	            if(leftList[leftIndex] < rightList[rightIndex]){
	                list[i] = leftList[leftIndex];
	                leftIndex++;
	            }
	            else{
	                list[i] = rightList[rightIndex];
	                rightIndex++;
	            }
	        }
	        else if(leftIndex < leftLength){
	            list[i] = leftList[leftIndex];
	            leftIndex++;
	        }
	        else if(rightIndex < rightLength){
	            list[i] = rightList[rightIndex];
	            rightIndex++;
	        }
	    }
	}
}
