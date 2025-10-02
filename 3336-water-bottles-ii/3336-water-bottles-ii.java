class Solution {
    public int maxBottlesDrunk(int Bot, int Ex) {
     int c=Bot;
     int m=0;
     while(c>=Ex){
        m++;
        c-=Ex;
        Ex+=1;
        if(c<Ex){
            c+=m;
            Bot+=m;
            m=0;
            }
     }
     return Bot;
    }
}