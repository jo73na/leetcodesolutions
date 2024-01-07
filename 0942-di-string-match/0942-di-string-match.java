class Solution {
    public int[] diStringMatch(String s) {
     		int max = s.length();
		int min = 0;
		int[] arr = new int[max + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				arr[i] = min++;
			} else if (s.charAt(i) == 'D') {
				arr[i] = max--;
			} else {
				return null;
			}
		}
		
			arr[s.length()] = min;
		

		return arr;   
    }
}