class Solution {
    public int removeDuplicates(int[] arr) {
        int rd=0;
        int mv=0;


        while(mv<arr.length){
            if(arr[rd]!=arr[mv]){
                rd++;
                arr[rd]=arr[mv];
            }
            mv++;
        }
        
return rd+1;
    }
}