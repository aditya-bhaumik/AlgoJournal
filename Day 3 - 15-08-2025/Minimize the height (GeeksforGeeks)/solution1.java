class Solution {
    public int getMinDiff(int[] arr, int k) {
        // Step 1 : Sort the array (Smallest and Largset Play the main role for this problem)
        Arrays.sort(arr);
        // Step 2 : Inital difference
        int diff = arr[arr.length-1] - arr[0];
        // Smallest and Largest after the first naive change
        int small = arr[0] + k;
        int large = arr[arr.length-1] - k;
        // step 4  check the cut points
        for(int i = 0; i<arr.length-1; i++){
            int min = Math.min(small, arr[i+1] - k);
            int max = Math.max(large, arr[i] + k);
            // if minimum is negative than continue 
            if(min<0){
                continue;
            }
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}
