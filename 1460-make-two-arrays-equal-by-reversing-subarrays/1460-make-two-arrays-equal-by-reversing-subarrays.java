class Solution {
    public boolean canBeEqual(int[] target, int[] array) {
        int arr[]=new int[1001];
        for(int i:target){
            arr[i]+=1;
        }
        for(int i:array){
            arr[i]-=1;
        }

        for(int i:arr){
            if(i!=0){return false;}
        }
        return true;
    }
}