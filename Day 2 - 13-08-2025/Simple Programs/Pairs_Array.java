/*
 * Problem Statement:
 * Given an array of integers, print all possible unique pairs 
 * of elements in the array. For each element, print all pairs 
 * formed with the elements that come after it in the array.
 * 
 * Example:
 * Input:
 * 4
 * 1 2 3 4
 * 
 * Output:
 * (1,2)(1,3)(1,4)
 * (2,3)(2,4)
 * (3,4)
 * 
 * Constraints:
 * 1 <= n <= 1000
 * -10^5 <= arr[i] <= 10^5
 */

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }
        printPairs(arr);
    }
    public static void printPairs(int nums[]){
        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            for(int j = i+1; j<nums.length; j++){
                System.out.print("(" + curr + "," + nums[j] + ")");
            }
            System.out.println();
        }
    }
}
