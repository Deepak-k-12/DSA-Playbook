
class Solution {
    public int findMin(int[] arr) {
        int l=0;
        int h=arr.length-1;
        int mini=Integer.MAX_VALUE;;
        while(l<=h){
            int mid=(l+h)/2;
             if (arr[l] == arr[mid] && arr[mid] == arr[h]) {
                mini = Math.min(mini, arr[mid]);
                l++;
                h--;
                continue;
            }
            if(arr[l]<=arr[mid]){
                mini=Math.min(mini,arr[l]);
                l=mid+1;
            }
            else{
                mini=Math.min(mini,arr[mid]);
                h=mid-1;
            }

        }
        return mini;
    }
}