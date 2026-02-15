class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str=new StringBuilder();
        int c=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 && j>=0){
            int ch1=a.charAt(i)-'0';
            int ch2=b.charAt(j)-'0';

            if(c+ch1+ch2==3){
                str.insert(0,"1");
                c=1;
            }

            else if(c+ch1+ch2==2){
                str.insert(0,"0");
                c=1;
            }
            else if(c+ch1+ch2 == 1){
                str.insert(0,"1");
                c = 0;
            }
            else{
                 str.insert(0,"0");
                 c = 0;
            }

            i-=1;
            j-=1;
        }
        while(i>=0){
            int ch1=a.charAt(i)-'0';
            if(ch1+c==2){
                str.insert(0,"0");
                c=1;
            }
            else if(ch1+c==1){
                str.insert(0,"1");
                c=0;
            }
            else{
                str.insert(0, String.valueOf(a.charAt(i)));
            }
            i--;
        }

        while(j>=0){
            int ch1=b.charAt(j)-'0';
            if(ch1+c==2){
                str.insert(0,"0");
                c=1;
            }
            else if(ch1+c==1){
                str.insert(0,"1");
                c=0;
            }
            else{
                str.insert(0, String.valueOf(b.charAt(j)));

            }
            j--;
        }
        if (c == 1){
            str.insert(0,"1");
        }
        return str.toString();
    }
}