class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){
            return false;
        }
        boolean check=false;
        int a=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]) return false;
            if (a == 0 && arr[i] > arr[i+1]) return false;
            if(check){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
            if(!check && a==1 && arr[i]>arr[i+1]){
                check=true;
            }
            else{
                if(arr[i]<arr[i+1]){
                    a=1;
                }
            }
            
        }
        return check && a==1;
    }
}