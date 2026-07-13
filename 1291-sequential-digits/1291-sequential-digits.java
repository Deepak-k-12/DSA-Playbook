class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String nums="123456789";
        ArrayList<Integer> list=new ArrayList<>();
        int len=(low+"").length();
        int i=0;

        while(true){
            if(i+len>nums.length()){
                break;
            }
            int num=Integer.parseInt(nums.substring(i,i+len));
            if (num>=low && num<=high) {
                list.add(num);
            }

            if (num>high) {
                break;
            }
            if(i+len==nums.length()){
                i=0;
                len+=1;
            }
            else{
                i+=1;
            }
        }
        return list;
    }
}