class Solution {
    public int hIndex(int[] citations) {
     Arrays.sort(citations);
     for(int i=citations.length;i>0;i--){
        if(check(i,citations)){
            return i;
        }
     }
     return 0;   
    }
    
    public boolean check(int h,int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>=h){
                if(arr.length-mid>=h){return true;}
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
    }
}