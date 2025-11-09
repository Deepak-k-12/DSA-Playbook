public class Solution {
    public int CountOperations(int num1, int num2) {
        int c=0;
        return Check(num1,num2,c);
        
    }

    public int  Check(int num1,int num2,int c){
        if(num1==0 || num2==0){return c;}
        if(num1<=num2){
            num2-=num1;
        }
        else{
            num1-=num2;
        }
        c+=1;
        return Check(num1,num2,c);
    }
}