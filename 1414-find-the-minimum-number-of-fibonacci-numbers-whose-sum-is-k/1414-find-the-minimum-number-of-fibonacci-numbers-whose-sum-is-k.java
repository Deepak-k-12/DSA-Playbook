class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int a=1;
        int b=1;
        int c=0;
        list.add(a);
        list.add(b);
        for(int i=0;i<=k;i++){
            c=a+b;
            if(c>k) break;
            a=b;
            b=c;
            list.add(c);
        }

        int count=0;
        int len=list.size()-1;
        while(k>0){
            if(k>=list.get(len)){
                k-=list.get(len);
                count+=1;
            }
            len-=1;

        }
        return count;
    }
}