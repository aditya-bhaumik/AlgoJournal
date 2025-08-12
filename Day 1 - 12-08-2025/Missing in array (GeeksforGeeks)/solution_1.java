class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int last = arr[arr.length-1];
        int r = 1;
        for(int i = 0; i<arr.length; i++){
            if(r == arr[i]){
                r++;
            }else{
                return r;
            }
        }
        return r;
    }
}
