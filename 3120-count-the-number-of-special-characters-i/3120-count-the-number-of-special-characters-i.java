class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr1 = word.toCharArray();
        Arrays.sort(arr1);
        int arr[]=new int[26];
        int c=0;

        for(char ch:arr1){
            if(Character.isUpperCase(ch)){
                arr[ch-'A']+=1;
            }
            else{
                if(arr[ch-'a']!=-1 && arr[ch-'a']!=0){
                    c+=1;
                    arr[ch-'a']=-1;
                }
            }
        }

        return c;
    }
}