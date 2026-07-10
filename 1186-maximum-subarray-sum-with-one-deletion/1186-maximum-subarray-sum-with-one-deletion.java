class Solution {
    public int maximumSum(int[] arr) {
        int nodel[]=new int [arr.length];
        int onedel[]=new int [arr.length];

        nodel[0]=arr[0];
        onedel[0]=0;

        int sum=arr[0];

        for(int i=1;i<arr.length;i++){
            nodel[i]=Math.max(arr[i],nodel[i-1]+arr[i]);
            onedel[i]=Math.max(nodel[i-1],onedel[i-1]+arr[i]);

            sum=Math.max(sum,Math.max(nodel[i],onedel[i]));
        }
        return sum;
    }
}