class Solution {
    public boolean exist(char[][] board, String word) {
		char word_arr[]=word.toCharArray();
        for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				if(board[i][j]!=word_arr[0]&&exists(board,i,j,word_arr,0))return true;
			}
		}
		return false;
      
    }
	public boolean exists(char[][]board,int i,int j,char word[],int idx)
	{
	if(i>=board.length||i<0||j>=board[0].length||j<0||
	board[i][j]=='*'||board[i][j]!=word[idx] )return false;
		if(idx==word.length-1)return true;
		char ch= board[i][j];
		board[i][j]='*';	
		boolean result=exists(board,i+1,j,word,idx+1)||
		               exists(board,i-1,j,word,idx+1)||
		               exists(board,i,j+1,word,idx+1)||
		               exists(board,i,j-1,word,idx+1);
              board[i][j]=ch;	
	return result;
	}
}