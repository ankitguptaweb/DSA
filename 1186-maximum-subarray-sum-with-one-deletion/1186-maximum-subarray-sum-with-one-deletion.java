class Solution{
    public int maximumSum(int[] arr){
        int noDelete= arr[0];
        int oneDelete= arr[0];
        int ans =arr[0];
        for(int i =1; i<arr.length; i++){
            //either extend the previous subarray or to start a new Subarray
            int newNoDelete=Math.max(arr[i],noDelete+arr[i]);
            //either
            //keep current element // delete current element
            int newOneDelete=Math.max(oneDelete+arr[i],noDelete);


            noDelete=newNoDelete;
            oneDelete= newOneDelete;
        
            ans=Math.max(ans,Math.max(noDelete,oneDelete));

        }
        return ans;
    } 
}