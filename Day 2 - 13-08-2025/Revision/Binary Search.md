# Introduction

It is an searching algorithm that operates on a sorted or monotonic search space, repeatedly dividing it into halbes to find a target value or optimal answer in logarithmic time. 

# Conditions to apply  binary search 

- The data strucutre should be sorted
- access to any element of the data structure should take constant time

# Steps to do binary search 

- Divide the search space into 2 halves by finding the middle index - mid
- Compare the middle element of the search space with the key
- If the key is found at middle element , the process is terminated
- If the key is not found at middle element choose which half will be used as the next search space
  - If the key is smaller than the middle element , then the left side is used for the next search
  - if the key is larger than the middle element, then the right side is used for the next search
- This process is continued until the key is found or the total search space is exhausted

  # Implementation

  ### Iterative Binary Search O(logn) Time and O(1) Space

  Here we use a while loop to continue the process of comparing the key and splitting the search space into 2 halves.

```Java

class GFG {
  
    static int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
}
```

# Recursion Binary Search

Create a recursive function and compare the mid of the search space with the key. 
And based on the result either return the index where the key is found or call the recursive function for the next search space 

```Java

class GFG {
    
    // A recursive binary search function. It returns
    // location of x in given array arr[low..high] is present,
    // otherwise -1    
    static int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println(
                "Element is present at index " + result);
    }
}

```


  
