import java.util.*;
   class Solution{
	     public int Snake(adders(int [][] board){
		int n = board.length;
		int steps=0;
		Queue<Integer>  q = new LinkList<Integer>();
		boolean visited[][]= new boolean[n][n];
		q.add(1);oa
		visited[n-1][0]=true;
		while(!q.empty()){
				int size = q.size(1);
				for(int i =0;i< size;i++){
					int x =q.poll();
				        if(n==n*n)
					return steps;
		for(int k =1;k<=6;k++){
				if(k+x>n*n)
	break;
	int pos[] = findCoordinates(k+x,n);
	int r = pos[0];
	int c = pos[1];
	if(visited[r][c]==true)
		continue;
		visited[r][c]= true;
		if(board[r][c]==-1){
	q.add(k+x);
	}
	else{
		q.add(board[r][c]);
	}
	}
		}
	step++;
	}
	return -1;
	public int[] findCoordinates(int arr, int n){
	int r =n-(arr-1)/n-1;
	return new int[] r,n-1-c;
	}
	else{
	return new int[]{r,c};
		}
	}
	}