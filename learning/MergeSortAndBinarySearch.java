import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int numberOfElements = 10;
		int[] list = new int[numberOfElements];

		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random() * numberOfElements);
		}
		
		System.out.println("Before sort:\n" + Arrays.toString(list));
		
		list = mergeSort(list);
		
		System.out.println("After sort:\n" + Arrays.toString(list));

		int toFind = (int)(Math.random() * numberOfElements);
		System.out.println("Number to find is " + toFind);

		int index = binarySearch(list, toFind);
		System.out.println(index < 0 ? "No such element" : "Index of " + toFind + " is " + index);
		
	}
	
	
	public static int[] mergeSort(int[] array){
		if(array.length <= 1) { return array; }

		int midPoint = array.length / 2;

		// create sub arrays and define thir length
		int[] leftArray = new int[midPoint];
		int[] rightArray;

		if(array.length % 2 == 0){
			rightArray = new int[midPoint];
		}
		else{
			rightArray = new int[midPoint + 1];	
		}
		// populate sub arrays
		for(int i = 0; i < leftArray.length; i++){
			leftArray[i] = array[i];
		}
		for(int i = 0; i < rightArray.length; i++){
			rightArray[i] = array[midPoint + i];
		}

		int[] resultArray = new int[array.length];
		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);

		resultArray = merge(leftArray, rightArray);

		return resultArray;

	}
	
	public static int[] merge(int[] leftArray, int[] rightArray){

		int[] resultArray = new int[leftArray.length + rightArray.length];

		int leftIndex, rightIndex, resultIndex;
		leftIndex = rightIndex = resultIndex = 0;

		while(leftIndex < leftArray.length || rightIndex < rightArray.length){
			if(leftIndex < leftArray.length && rightIndex < rightArray.length){
				if(leftArray[leftIndex] < rightArray[rightIndex]){
					resultArray[resultIndex++] = leftArray[leftIndex++];
				}
				else{
					resultArray[resultIndex++] = rightArray[rightIndex++];
				}
			}
			else if(leftIndex < leftArray.length){
				resultArray[resultIndex++] = leftArray[leftIndex++];
			}
			else if(rightIndex < rightArray.length){
				resultArray[resultIndex++] = rightArray[rightIndex++];
			}
		}	

		return resultArray;
	}

	public static int binarySearch(int[] array, int toFind){

		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;	

		while(first <= last){
			if(array[middle] == toFind){
				return middle;
			}
			else if(array[middle] < toFind){
				first = middle + 1;
			}
			else{
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}

		return -middle - 1;
	}
}
