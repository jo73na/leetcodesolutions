class Solution {
    public String reversePrefix(String word, char ch) {
  
        int j = 0;
        char[] arr = word.toCharArray();
        while(j < word.length()) {
            if(arr[j] == ch) {
                reverse(arr, 0, j);
                break;
            }
            j++;
        }
        return String.valueOf(arr);
    }

    public void reverse(char[] arr, int start, int end) {
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}