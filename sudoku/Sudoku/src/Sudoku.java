import java.util.Random; 

public class Sudoku {
	public static void main(String[] args) {
        int board[][] = new int[9][9];
        int gridCheck[][] = new int[9][2];
        
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][0] = i+1;
        		gridCheck[i][1] = 0;
        	}
        //System.out.print(board[1].length);
        
        
        	for(int i = 0; i < board.length; i++) {
        		for(int o = 0; o < board[i].length; o++) {
        			board[i][o] = (int) ((Math.random()*9)+1);
        		}
        			
        	}
        	
        	for(int i = 0; i < 3; i++) {
        		//System.out.println("");
        		for(int o = 0; o < 3; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 3; i < 6; i++) {
        		//System.out.println("");
        		for(int o = 0; o < 3; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 6; i < 9; i++) {
        		//System.out.println("");
        		for(int o = 0; o < 3; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 3; i < 3; i++) {
        		//System.out.println("");
        		for(int o = 3; o < 6; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 0; i < 3; i++) {
        		//System.out.println("");
        		for(int o = 3; o < 6; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 3; i < 6; i++) {
        		//System.out.println("");
        		for(int o = 3; o < 6; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 6; i < 9; i++) {
        		//System.out.println("");
        		for(int o = 3; o < 6; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 0; i < 3; i++) {
        		//System.out.println("");
        		for(int o = 6; o < 9; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 3; i < 6; i++) {
        		//System.out.println("");
        		for(int o = 6; o < 9; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	for(int i = 6; i < 9; i++) {
        		//System.out.println("");
        		for(int o = 6; o < 9; o++) {
        			
        			int checker = board[i][o]-1;
        			//System.out.print(checker+1);
        			
        			switch (board[i][o]) {
        			  case 1:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 2:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 3:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 4:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 5:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 6:
        			    gridCheck[checker][1]+=1;
        			    break;
        			  case 7:
        				gridCheck[checker][1]+=1;
        			    break;
        			  case 8:
        				gridCheck[checker][1]+=1;
          			    break;
        			  case 9:
        				gridCheck[checker][1]+=1;
          			    break;
        			}
        			
        			if (gridCheck[checker][1] > 1) {
        				board[i][o] = 0;
        			}
        			
        		}
        			
        	}
        	for(int i = 0; i < 9; i++) {
        		gridCheck[i][1] = 0;
        	}
        	
        	
        		
		        	for(int i = 0; i < 9; i++) {
		        		for(int n = 0; n < 9; n++) {
		            		gridCheck[n][1] = 0;
		            	}
		        		for(int o = 0; o < 9; o++) {
		        			
		        			int checker = board[i][o]-1;
		        			if (checker > -1) {
		        				
		        			
		        			//System.out.print(checker+1);
		        			
		        			switch (board[i][o]) {
		        			  case 1:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 2:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 3:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 4:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 5:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 6:
		        			    gridCheck[checker][1]+=1;
		        			    break;
		        			  case 7:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 8:
		        				gridCheck[checker][1]+=1;
		          			    break;
		        			  case 9:
		        				gridCheck[checker][1]+=1;
		          			    break;
		        				}
		        			
		        			
		        			if (gridCheck[checker][1] > 1) {
		        				board[i][o] = 0;
		        			}
		        			}
		        			
		        		}
		        			
		        	}
		        	
		        	for(int i = 0; i < 9; i++) {
		        		for(int n = 0; n < 9; n++) {
		            		gridCheck[n][1] = 0;
		            	}
		        		for(int o = 0; o < 9; o++) {
		        			
		        			int checker = board[o][i]-1;
		        			if (checker > -1) {
		        				
		        			
		        			//System.out.print(checker+1);
		        			
		        			switch (board[o][i]) {
		        			  case 1:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 2:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 3:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 4:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 5:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 6:
		        			    gridCheck[checker][1]+=1;
		        			    break;
		        			  case 7:
		        				gridCheck[checker][1]+=1;
		        			    break;
		        			  case 8:
		        				gridCheck[checker][1]+=1;
		          			    break;
		        			  case 9:
		        				gridCheck[checker][1]+=1;
		          			    break;
		        				}
		        			
		        			
		        			if (gridCheck[checker][1] > 1) {
		        				board[o][i] = 0;
		        			}
		        			}
		        			
		        		}
		        			
		        	}
        	
        	
        	
        	
        	
        	for(int i = 0; i < board.length; i++) {
        		System.out.println("");
        		for(int o = 0; o < board[i].length; o++) {
        			System.out.print("[" + board[i][o] + "]");
        		}
        			
        	}
        	
        	
        	
        	
    }
}
