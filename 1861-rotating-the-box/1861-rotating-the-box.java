class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length, col = box[0].length;
        char[][] res = new char[col][row];
        
        // Step 1: Simulate gravity row by row
        for (int i = 0; i < row; i++) {
            int pos = col - 1; // rightmost free spot
            for (int j = col - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    pos = j - 1; // reset pos left of obstacle
                } else if (box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][pos] = '#';
                    pos--;
                }
            }
        }

        // Step 2: Rotate 90 degrees clockwise
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][row - 1 - i] = box[i][j];
            }
        }

        return res;
    }
}
