class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
           int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<n1;i++){
            hs.add(nums1[i][0]);
        }
        for(int i=0;i<n2;i++){
            hs.add(nums2[i][0]);
        }
        int n=hs.size();
        int ans[][]=new int[n][2];
        int i=0,j=0;int a=0;
        while(i<n1 &&j<n2){
            if(nums1[i][0]>nums2[j][0])
            {
                ans[a][0]=nums2[j][0];
                ans[a][1]=nums2[j][1];
                j++;
            }else if(nums1[i][0]<nums2[j][0])
            {
                ans[a][0]=nums1[i][0];
                ans[a][1]=nums1[i][1];
                i++;
            }else 
            {
                ans[a][0]=nums2[j][0];
                ans[a][1]=nums2[j][1]+nums1[i][1];
                j++;
                i++;
            }
            a++;
        }
        if(i==n1){
            while(j<n2){
                ans[a][0]=nums2[j][0];
                ans[a][1]=nums2[j][1];
                j++;
                a++;
            }
        }
        if(j==n2){
            while(i<n1){
                ans[a][0]=nums1[i][0];
                ans[a][1]=nums1[i][1];
                i++;
                a++;
            }
        }
        return ans;
    }
}