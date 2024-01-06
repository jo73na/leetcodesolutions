class Solution {
    public String reverseWords(String str) {
	char[] charArray = str.toCharArray();
	int start=0;
	int end=0;
	for (int i = 0; i < charArray.length; i++) {
		if(charArray[i]==' ') {
			reverse(charArray, start,end-1);
			
			start=end+1;
		}
		end++;
	}
	reverse(charArray, start,end-1);
	return new String(charArray);
	 }

	private static void reverse(char[] charArray, int left, int right) {
		while(left<right) {
			char temp=charArray[left];
			charArray[left++]=charArray[right];
			charArray[right--]=temp;
		}
		}

}