class Solution {
    public void duplicateZeros(int[] arr) {
        int l = arr.length;
        for(int i = 0;i< l-1 ;i++){
            if(arr[i] == 0){
                for(int j = l-2; j >= i ; j--){
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
        
    }
}