class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],'.');
        }
        solve(0,arr,ans,n);
        return ans;
    }

    public void solve(int col,char[][] arr,List<List<String>> ans,int n){
        if(n==col){
            List<String> st=new ArrayList<>();
            for(int i=0;i<n;i++){
                st.add(new String(arr[i]));
            }
            ans.add(st);
            return;
        }

        for(int i=0;i<n;i++){
            if(safe(i,col,arr,n)){
                arr[i][col]='Q';
                solve(col+1,arr,ans,n);
                arr[i][col]='.';
            }
        }
    }

    public boolean safe(int row,int col,char[][]arr,int n){
        int a=row;
        int b=col;

        while(col>=0){
            if(arr[row][col]=='Q'){return false;}
            col--;
        }
        row=a;
        col=b;
        while(row>=0 && col>=0){
            if(arr[row][col]=='Q'){return false;}
            row--;
            col--;
        }
        
        row=a;
        col=b;
        while(row<n && col>=0){
            if(arr[row][col]=='Q'){return false;}
            row+=1;
            col--;
        }
        return true;
    }
}