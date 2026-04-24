class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for(int i=0; i<numbers.length; i++){
            int sum = numbers[i];
            for(int j=0; j<numbers.length; j++){
                if(i == j){
                    continue;
                }
                if(sum+numbers[j] == target){

                    arr[1] =i+1;
                    arr[0] =j+1;
                    
                }
            }
        }
        return arr;
    }
}
