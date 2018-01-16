import java.util.ArrayList;
import java.util.List;

public class sudoku {

    //Checks whether sudoku is solved completely or not
    public boolean isFull(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }

    //returns all the possible numbers for particular location: board[i][j]
    public ArrayList<Integer> possibilities(int[][] board, int i, int j){
        ArrayList<Integer> possible_values = new ArrayList<>();

        //initialise possible_values with numbers 1 to 9
        for(int x = 1;x<10;x++){
            possible_values.add(x);
        }


        //check in the horizontal row
        for(int x = 0; x<9; x++){
            if(board[i][x]!=0){
                possible_values.remove(new Integer(board[i][x]));
            }
        }

        //check in the vertical row
        for(int y = 0; y<9; y++){
            if(board[y][j]!=0){
                possible_values.remove(new Integer(board[y][j]));
            }
        }

        //check in the 3x3 square
        int k = 0;
        int l = 0;
        //setting the value of k - row index of 3x3 matrix
        if(i>=0 && i<3)
            k = 0;
        if(i>=3 && i<6)
            k = 3;
        if(i>=6 && i<9)
            k = 6;
        //setting the value of l - column index of 3x3 matrix
        if(j>=0 && j<3)
            l = 0;
        if(j>=3 && j<6)
            l = 3;
        if(j>=6 && j<9)
            l = 6;
        for(int x = k; x<k+3;x++){
            for(int y = l; y<l+3;y++){
                if(board[x][y] != 0){
                    possible_values.remove(new Integer(board[x][y]));
                }
            }
        }

        //returning the arraylist of all the possible value
        return possible_values;
    }


    public void SolveSudoku(int[][] board){
        int i = 0;
        int j = 0;

        //base case
        if(isFull(board)){
            System.out.println("Sudoku Solved!");
            printBoard(board);

        }else{

            //finding the position of first empty element
            outerloop:
            for(int x=0; x<9;x++){
                for(int y=0; y<9;y++){
                    if(board[x][y]==0){
                        i = x;
                        j = y;
                        break outerloop;
                    }
                }
            }
            //getting all the possibilities of all the numbers at the empty sudoku location
            ArrayList<Integer> possible_values = possibilities(board, i, j);

            for (int value: possible_values) {
                board[i][j] = value;
                SolveSudoku(board);
            }
            board[i][j] = 0;
        }
    }

    public void printBoard(int[][] board){
        for(int x=0; x<9;x++) {
            for (int y = 0; y < 9; y++) {
                System.out.print(" " + board[x][y]);
            }
            System.out.println();
        }
    }
}
