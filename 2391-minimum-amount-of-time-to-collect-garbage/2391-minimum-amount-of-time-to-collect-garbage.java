class Solution {
    public int garbageCollection(String[] gar, int[] tra) {
        for(int i=1;i<tra.length;i++){
            tra[i]=tra[i]+tra[i-1];
        }
        return check(gar,tra,'M')+check(gar,tra,'P')+check(gar,tra,'G');
    }

    public int check(String[] gar,int[] tra,char ch){
        int count=0;
        int last=-1;
        for(int i=0;i<gar.length;i++){
            if(gar[i].indexOf(ch)!=-1){
                for(int j=0;j<gar[i].length();j++){
                    if(gar[i].charAt(j)==ch){
                        count+=1;
                        last=i;
                    }
                }
                
            }
        }

        if(last>0){
                    count+=tra[last-1];
                }
        System.out.println(count);
        return count;
    }
}