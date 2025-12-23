class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],'.');
        }

        int []left=new int[n];
        int []lower=new int [2*n-1];
        int []upper=new int [2*n-1];
        solve(0,arr,ans,n,left,lower,upper);
        return ans;
    }

    public void solve(int col,char[][] arr,List<List<String>> ans,int n,int[] left,int[] lower,int[] upper){
        if(n==col){
            List<String> st=new ArrayList<>();
            for(int i=0;i<n;i++){
                st.add(new String(arr[i]));
            }
            ans.add(st);
            return;
        }

        for(int i=0;i<n;i++){
            if(left[i]==0 && lower[i+col]==0 && upper[n-1+col-i]==0){
                left[i]=1;
                lower[i+col]=1;
                upper[n-1+col-i]=1;
                arr[i][col]='Q';
                solve(col+1,arr,ans,n,left,lower,upper);
                arr[i][col]='.';
                left[i]=0;
                lower[i+col]=0;
                upper[n-1+col-i]=0;
            }
        }
    }

    // public boolean safe(int row,int col,char[][]arr,int n){
    //     int a=row;
    //     int b=col;

    //     while(col>=0){
    //         if(arr[row][col]=='Q'){return false;}
    //         col--;
    //     }
    //     row=a;
    //     col=b;
    //     while(row>=0 && col>=0){
    //         if(arr[row][col]=='Q'){return false;}
    //         row--;
    //         col--;
    //     }
        
    //     row=a;
    //     col=b;
    //     while(row<n && col>=0){
    //         if(arr[row][col]=='Q'){return false;}
    //         row+=1;
    //         col--;
    //     }
    //     return true;
    // }
}