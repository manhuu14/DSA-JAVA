public class Backtracking {

    // Find subsets
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        findSubsets(str, ans + str.charAt(i), i + 1);
        findSubsets(str, ans, i + 1);
    }

    // Find permutations
    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + curr);
        }
    }

    // Check if a queen can be placed safely
    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Solve N-Queens problem
    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '.'; // backtrack
            }
        }
    }

    // Print the chess board
    public static void printBoard(char[][] board) {
        System.out.println("_________________________ Chess Board _________________________________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //for single solution 
    //  public static boolean nQueens(char[][] board, int row) {
    //     if (row == board.length) {
    //         //printBoard(board);
    //         count++;
    //         return true; 
    //     }

    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row + 1)){
    //                 return true;
    //             }
    //             board[row][j] = '.'; // backtrack
    //         } 
    //     }
    //     return false;
    // } 
    // public static void main(String args[]){
    //     if(nQueens(board, 0)){
    //         printBoard(board);
    //     }else{
    //         System.out.println("solution is not possible");
    //     }
    // } 
    // grid ways 
    public static int gridways(int i, int j, int n, int m){
        //base case 
        if(i==n-1 && j==m-1){
            //call for last cell 
            return 1;
        }else if(i==n || j==n){
            return 0;
        }

        int w1=gridways(i+1, j, n, m);
        int w2=gridways(i, j+1, n, m);
        return w1+w2;
    } 
    //suduko solver 
    public static boolean isSafeforsudukosolver(int suduko[][], int row, int col, int digit){
        //column 
        for(int i=0;i<=8;i++){
            if(suduko[i][col]==digit){
                return false;
            } 
        } 
        // row 
        for(int j=0;j<=8;j++){
            if(suduko[row][j]==digit){
                return false;
            }
        } 
        //grid 
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3X3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(suduko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    } 
    public static boolean sudukosolver(int suduko[][], int row, int col){
        //base case 
        if(row==9 && col==0){
            return true;
        }else if(row==9){
            return false;
        } 
        //recursion
        int nextrow=row;
        int nextcol=col+1; 
        if(col+1==9){
            nextrow=row+1; 
            nextcol=0;
        } 
        if(suduko[row][col]!=0){
            return sudukosolver(suduko, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++)
        {
            if(isSafeforsudukosolver(suduko, row, col, digit)){
                suduko[row][col]=digit;
                if(sudukosolver(suduko, nextrow, nextcol)){
                    return true;
                }
                return false;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Subsets
        // findSubsets("abc", "", 0);

        // Permutations
        // findPermutations("abc", "");

        // N-Queens
        // int n = 4;
        // char[][] board = new char[n][n];

        // Initialize board with '.'
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         board[i][j] = '.';
        //     }  
        // }

        //nQueens(board, 0);  
        System.out.println(gridways(0, 0, 3, 3));

    }
}
