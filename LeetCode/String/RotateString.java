class Solution {
    int n,m;
     int direc[][]={{-1,0},{1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) {
                   m=board.length;
                   n=board[0].length;
                     if(m*n<1) return false;
                   for(int i=0;i<m;i++)
                   {
                    for(int j=0;j<n;j++)
                    {
                        if(board[i][j]==word.charAt(0)&&find(i,j,0,board,word))
                         return true;
                    }
                   }
               return false;
    }
    public boolean find(int i,int j,int idx,char[][] board,String word)
    {
        if(idx>=word.length())
        {
                return true;        
        }  
        if(i<0 ||j<0||i>=m||j>= n||board[i][j]!=word.charAt(idx)||board[i][j]=='$')
        { 
            return false;
        } 
         char temp=  board[i][j];
          board[i][j]='$';
          for(int r=0;i<4;j++)
          {
        int    new_i=direc[r][0];
         int      new_j=direc[r][1];
     if(   find(new_i,new_j,idx+1,board,word))
     {
                   return true;
          }}
            board[i][j]=temp;
            return false;
    }
}