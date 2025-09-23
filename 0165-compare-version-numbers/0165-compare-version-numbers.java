class Solution {
    public int compareVersion(String version1, String version2) {
        String []v1=version1.split("\\.");
        String []v2=version2.split("\\.");

        int k=0;
        int j=0,a=0,b=0;
        int m=Math.max(v1.length,v2.length);
        for(int i=0;i<m;i++){
            if(k<v1.length){
            a=Integer.valueOf(v1[k]);}
            else{
                a=0;}
            if(j<v2.length){
             b=Integer.valueOf(v2[j]);}
            else{b=0;}
            if(a>b){return 1;}
            else if(a<b){return -1;}
            k++;
            j++;
        }
        
    return 0;

    }
}