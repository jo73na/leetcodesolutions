class Solution {
    public int[] sortArrayByParityII(int[] A) {
       int n = A.length;
	      int i = 0, j = n-1;
	        while (i < n) {
	            if (i%2==0 && A[i] % 2 == 0) {
	                i+=2;
	            }else
	            if (j % 2 == 1 && A[j] % 2 == 1) {
	                j -=2;
	            }else
	            {
	            	 int temp = A[i];
	     	        A[i] = A[j];
	     	        A[j] = temp;
	          
	            }
	        }
	        return A;
    }
   
}