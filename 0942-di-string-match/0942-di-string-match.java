class Solution {
    public int[] diStringMatch(String s) {
     		int max = s.length();
		int min = 0;
		int[] arr = new int[max + 1];
		for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) == 'I' ? min++ : max--;
			
		}
		
			arr[s.length()] = min;
		

		return arr;   
    }
}