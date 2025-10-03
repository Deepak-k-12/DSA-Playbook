class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> demo=new ArrayList<>();
        String in=String.valueOf(n);
        int len=in.length();
        for(int i=0;i<in.length();i++){
            int a=in.charAt(i)-'0';
            len--;
            if(a==0){continue;}
            if(len>0){
                demo.add((int)(a * Math.pow(10, len)));
            }
            else{
                demo.add(a);}
                
        }
        
        len=0;
        int arr[]=new int[demo.size()];
        for(int i:demo){
            arr[len++]=i;
        }
        return arr;
    }
}