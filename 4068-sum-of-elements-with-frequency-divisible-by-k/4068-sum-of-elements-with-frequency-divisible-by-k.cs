using System;
public class Solution {
    public int SumDivisibleByK(int[] nums, int k) {

     Dictionary<int,int> demo=new Dictionary<int,int>();
     
     foreach(int i in nums){
        if(demo.ContainsKey(i)){
            demo[i]+=1;
        }
        else{
            demo[i]=1;
        }
     }

     int sum=0;

     foreach(int i in demo.Keys){
        int count=demo[i];
        if(count%k==0){
            sum+=i*count;
        }
     }
     return sum;

    }
}