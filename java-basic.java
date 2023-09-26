// 1. Write a Java program to read and print elements of array.

public class PrintArray {
    public static void main(String[] args) {
        // Declare and initialize an array with elements
        int[] arr = { 1, 2, 3, 4, 5 };

        // Print the elements of the array
        System.out.println("Elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
/*
 Output is:
  Elements in the array are:1
  2
  3
  4
  5
*/

// 2. Write a Java program to print all negative elements in an array.
public class NegativeArrayItems {
	
	public static void main(String[] args) {
		int j = 0;
		int[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		
		
		System.out.print("\nList of Negative Numbers in NEG Array : ");
		while(j < Neg_arr.length) 
		{
			if(Neg_arr[j] < 0) {
				System.out.format("%d ", Neg_arr[j]);
			}
			j++;
		}
	}
}
/*
  Output is:
  List of Negative Numbers in NEG Array : -40 -4 -8 -13 -11 -99 -60 
*/

// 3.Write a Java program to find sum of all array elements. 

public class SumOfArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
} 
/*
  Output is:
  Sum of all the elements of an array: 15
*/

// 4. Write a Java program to find maximum and minimum element in an array. 

public class MaxMin {
  public static void main(String[] args) {
    // Declare and initialize array with elements
    int[] arr = {3, 4, 5, 9, 1, 4, 6, 7, 2};

    // Initialize variable to hold the maximum and minimum values
    int max = arr[0];
    int min = arr[0];

    // Loop the array
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("Maximum element: " + max);
    System.out.println("Minimum element: " + min);
  }
}

/*
  Output is: 
  Maximum element: 9
  Minimum element: 1
*/

//  5. Write a Java program to find second largest element in an array.

public class SecondLargest {
    public static void main(String[] args) {
        // Declare and initialize an array with elements
        int[] arr = { 3, 9, 1, 7, 5, 2, 8, 4, 6 };

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest != largest) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
/*
  Output is:
  Second largest element: 8 
*/

// 6. Write a Java program to count total number of even and odd elements in an array.

public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}

/*
Total even numbers: 5
Total odd numbers: 5
*/


// 7. Write a Java program to count total number of negative elements in an array.

public class NegativeElementCounter {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        
        int negativeCount = 0;
        
        for (int number : numbers) {
            if (number < 0) {
                negativeCount++;
            }
        }
        
        System.out.println("Total negative numbers: " + negativeCount);
    }
}

// 8. Write a Java program to copy all elements from an array to another array.

public class ArrayCopy {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        
        // Copy elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        // Print the contents of destinationArray
        System.out.print("Contents of destinationArray: ");
        for (int value : destinationArray) {
            System.out.print(value + " ");
        }
    }
}

/*
Contents of destinationArray: 1 2 3 4 5 
*/

// 9. Write a Java program to insert an element in an array.

public class ArrayInsertionExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 10;  // The element to insert
        int insertPosition = 2;     // The position at which to insert the element

        int[] newArray = new int[originalArray.length + 1];  // Create a new array with one more element

        // Copy elements from the original array to the new array, inserting the new element
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == insertPosition) {
                newArray[i] = elementToInsert;  // Insert the new element
            } else {
                newArray[i] = originalArray[j++];
            }
        }

        // Print the contents of the new array
        System.out.print("Contents of newArray: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}

/*
Contents of newArray: 1 2 10 3 4 5 
*/

// 10.Write a Java program to delete an element from an array at specified position.

public class ArrayDeletionExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int deletePosition = 2;  // The position from which to delete the element

        if (deletePosition < 0 || deletePosition >= originalArray.length) {
            System.out.println("Invalid delete position");
            return;
        }

        int newSize = originalArray.length - 1;
        int[] newArray = new int[newSize];  // Create a new array with one less element

        int newIndex = 0;  // Index for the new array

        for (int i = 0; i < originalArray.length; i++) {
            if (i != deletePosition) {
                newArray[newIndex] = originalArray[i];
                newIndex++;
            }
        }

        // Print the contents of the new array
        System.out.print("Contents of newArray: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}

/*
  Contents of newArray: 1 2 4 5 
*/

// 11.Write a Java program to count frequency of each element in an array.

public class Frequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}
/* OutPut is:
-----------------------
| Element | Frequency |
-----------------------
    1    |    2
    2    |    4
    8    |    1
    3    |    1
    5    |    1
-----------------------
*/

// 12.Write a Java program to print all unique elements in the array.
import java.util.HashMap;

class UniqueElementsExample1 {
    public static void main(String args[]) {
        int arrayWithDuplicates[] = {10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for (int j = 0; j < arrayWithDuplicates.length; j++) {
            hashmap.put(arrayWithDuplicates[j], j);
        }

        System.out.println(hashmap.keySet());
    }
}

/* OutPut is: 
[1, 3, 4, 5, 22, 6, 9, 10]
*/


// 13.Write a Java program to count total number of duplicate elements in an array.

#include <stdio.h>
#include <stdbool.h>

int main() {
    int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
    int length = sizeof(arr) / sizeof(arr[0]);

    printf("Duplicate elements in given array: \n");

    bool* visited = (bool*)malloc(length * sizeof(bool));

    for (int i = 0; i < length; i++) {
        visited[i] = false;
    }

    for (int i = 0; i < length; i++) {
        if (!visited[i]) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    printf("%d\n", arr[i]);
                    visited[j] = true;
                }
            }
        }
    }

    free(visited);
    return 0;
}

/* OutPut is: 
Duplicate elements in given array: 
2
3
8
*/

// 14.Write a Java program to delete all duplicate elements from an array.


import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 2, 5, 6, 1, 7};
        
        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();
        
        // Iterate through the original array and add elements to the HashSet
        for (int num : originalArray) {
            uniqueSet.add(num);
        }
        
        // Create a new array to store the unique elements
        int[] uniqueArray = new int[uniqueSet.size()];
        
        // Convert the HashSet back to an array
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }
        
        // Print the array with duplicates removed
        System.out.println("Array with duplicates removed:");
        System.out.println(Arrays.toString(uniqueArray));
    }
}

/* OutPut Is 
Array with duplicates removed:
[1, 2, 3, 4, 5, 6, 7]
*/