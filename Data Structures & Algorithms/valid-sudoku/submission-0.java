

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Character> availr = new ArrayList<>();
        List<Character> availc = new ArrayList<>();
        List<Character> sb1 = new ArrayList<>();
        List<Character> sb2 = new ArrayList<>();
        List<Character> sb3 = new ArrayList<>();
        List<Character> sb4 = new ArrayList<>();
        List<Character> sb5 = new ArrayList<>();
        List<Character> sb6 = new ArrayList<>();
        List<Character> sb7 = new ArrayList<>();
        List<Character> sb8 = new ArrayList<>();
        List<Character> sb9 = new ArrayList<>();
        boolean sudoku = true;

        //
        for(int i=0; i<9; i++){
            availr.clear();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(availr.contains(board[i][j])){
                    sudoku = false;
                    break;
                }
                else{
                    availr.add( board[i][j]);
                }
            }
            if(sudoku == false){
                break;
            }
            availc.clear();
            for(int j=0; j<9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(availc.contains(board[j][i])){
                    sudoku = false;
                    break;
                }
                else{
                    availc.add( board[j][i]);
                }
            }
            if(sudoku == false){
                break;
            }

        }

        //

            for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb1.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb1.add( board[i][j]);
                }
            }
        }
            for(int i=0; i<3; i++){
            for(int j=3; j<6; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb2.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb2.add( board[i][j]);
                }
            }
        }
        for(int i=0; i<3; i++){
            for(int j=6; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb3.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb3.add( board[i][j]);
                }
            }
        }

        for(int i=3; i<6; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb4.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb4.add(board[i][j]);
                }
            }
        }
            for(int i=3; i<6; i++){
            for(int j=3; j<6; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb5.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb5.add( board[i][j]);
                }
            }
        }
        for(int i=3; i<6; i++){
            for(int j=6; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb6.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb6.add( board[i][j]);
                }
            }
        }

        for(int i=6; i<9; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb7.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb7.add( board[i][j]);
                }
            }
        }
            for(int i=6; i<9; i++){
            for(int j=3; j<6; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb8.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb8.add( board[i][j]);
                }
            }
        }
        for(int i=6; i<9; i++){
            for(int j=6; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(sb9.contains(board[i][j])){
                    sudoku = false;
                }
                else{
                    sb9.add( board[i][j]);
                }
            }
        }
        
        
        

        return sudoku;
    }
}
