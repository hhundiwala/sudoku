public class Main {

    public static void main(String[] args) {

        //board 2d array represents the sudoku board]\
//        int[][] board = new int[9][9];
//        //initialising the board to 0
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//                board[i][j] = 0;
//            }
//        }

        char[][] board = new char[9][9];

        board[0][0] = '.';
        board[0][1] = '.';
        board[0][2] = '9';
        board[0][3] = '7';
        board[0][4] = '4';
        board[0][5] = '8';
        board[0][6] = '.';
        board[0][7] = '.';
        board[0][8] = '.';

        board[1][0] = '7';
        board[1][1] = '.';
        board[1][2] = '.';
        board[1][3] = '.';
        board[1][4] = '.';
        board[1][5] = '.';
        board[1][6] = '.';
        board[1][7] = '.';
        board[1][8] = '.';

        board[2][0] = '.';
        board[2][1] = '2';
        board[2][2] = '.';
        board[2][3] = '1';
        board[2][4] = '.';
        board[2][5] = '9';
        board[2][6] = '.';
        board[2][7] = '.';
        board[2][8] = '.';

        board[3][0] = '.';
        board[3][1] = '.';
        board[3][2] = '7';
        board[3][3] = '.';
        board[3][4] = '.';
        board[3][5] = '.';
        board[3][6] = '2';
        board[3][7] = '4';
        board[3][8] = '.';

        board[4][0] = '.';
        board[4][1] = '6';
        board[4][2] = '4';
        board[4][3] = '.';
        board[4][4] = '1';
        board[4][5] = '.';
        board[4][6] = '5';
        board[4][7] = '9';
        board[4][8] = '.';

        board[5][0] = '.';
        board[5][1] = '9';
        board[5][2] = '8';
        board[5][3] = '.';
        board[5][4] = '.';
        board[5][5] = '.';
        board[5][6] = '3';
        board[5][7] = '.';
        board[5][8] = '.';

        board[6][0] = '.';
        board[6][1] = '.';
        board[6][2] = '.';
        board[6][3] = '8';
        board[6][4] = '.';
        board[6][5] = '3';
        board[6][6] = '.';
        board[6][7] = '2';
        board[6][8] = '.';

        board[7][0] = '.';
        board[7][1] = '.';
        board[7][2] = '.';
        board[7][3] = '.';
        board[7][4] = '.';
        board[7][5] = '.';
        board[7][6] = '.';
        board[7][7] = '.';
        board[7][8] = '6';

        board[8][0] = '.';
        board[8][1] = '.';
        board[8][2] = '.';
        board[8][3] = '2';
        board[8][4] = '7';
        board[8][5] = '5';
        board[8][6] = '9';
        board[8][7] = '.';
        board[8][8] = '.';


        int[][] my_board = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    my_board[i][j] = 0;
                else
                    my_board[i][j] = Character.getNumericValue(board[i][j]);
            }
        }

        sudoku s = new sudoku();
        s.printBoard(my_board);
        s.SolveSudoku(my_board);
    }
}
