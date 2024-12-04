package day1;

public class Day4 {


    private static int[][] DIRECTIONS = {
            {0, 1},   // right
            {1, 0},   // down
            {1, 1},   // diagonal down-right
            {1, -1},  // diagonal down-left
            {0, -1},  // left
            {-1, 0},  // up
            {-1, 1},  // diagonal up-right
            {-1, -1}  // diagonal up-left
    };


    public static void main(String[] args) {
        char[][] grid = {
                {'M', 'M', 'M', 'S', 'X', 'X', 'M', 'A', 'S', 'M'},
                {'M', 'S', 'A', 'M', 'X', 'M', 'S', 'M', 'S', 'A'},
                {'A', 'M', 'X', 'S', 'X', 'M', 'A', 'A', 'M', 'M'},
                {'M', 'S', 'A', 'M', 'A', 'S', 'M', 'S', 'M', 'X'},
                {'X', 'M', 'A', 'S', 'A', 'M', 'X', 'A', 'M', 'M'},
                {'X', 'X', 'A', 'M', 'M', 'X', 'X', 'A', 'M', 'A'},
                {'S', 'M', 'S', 'M', 'S', 'A', 'S', 'X', 'S', 'S'},
                {'S', 'A', 'X', 'A', 'M', 'A', 'S', 'A', 'A', 'A'},
                {'M', 'A', 'M', 'M', 'M', 'X', 'M', 'M', 'M', 'M'},
                {'M', 'X', 'M', 'X', 'A', 'X', 'M', 'A', 'S', 'X'}
        };

        int count = countXMAS(grid);
        System.out.println(count);


    }


    public static int countXMAS(char[][] grid){
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i=0; i<rows; i++){
            for (int j = 0; j < cols; j++){
                for (int[] direction : DIRECTIONS){
                    if (checkWord(grid, i,j, direction)){
                        count++;
                    }
                }

            }
        }

        return count;
    }


    private static boolean checkWord(char[][] grid, int startX, int startY, int[] direction) {
        String word = "XMAS";
        int rows = grid.length;
        int cols = grid[0].length;

        for (int k = 0; k < word.length(); k++) {
            int x = startX + k * direction[0];
            int y = startY + k * direction[1];

            // Check bounds and matching character
            if (x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] != word.charAt(k)) {
                return false;
            }
        }

        return true;
    }

 }
