class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        solve(board,n,0);
        return count;
    }
    public void solve(char[][] board,int n,int col)
    {
        if(col==n)
        {
            count+=1;
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(safe(board,row,col,n))
            {
                board[row][col]='Q';
                solve(board,n,col+1);
                board[row][col]='.';
            }
        }
    }
     public boolean safe(char[][] board,int row,int col,int n)
    {
        int a=row,b=col;
        while(row>=0&&col>=0)
        {
            if(board[row][col]=='Q')
            return false;
            row--;
            col--;
        }
        row=a;
        col=b;
        while(col>=0)
        {
            if(board[row][col]=='Q')
            return false;
            col--;
        }
        row=a;
        col=b;
        while(row<n&&col>=0)
        {
            if(board[row][col]=='Q')
            return false;
            row++;
            col--;
        }
        return true;
    }
}
