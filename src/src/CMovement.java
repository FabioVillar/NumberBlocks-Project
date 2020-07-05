package Arquivos1;

public class CMovement implements IMovement{

    @Override
    public boolean goRight(IBoard board, boolean verify) {
        int line = 0, column = 3;
        while(line != 5){
            while(column != -1){
                if(board.getMatrix()[line][column].value!=0){//se for um ValuableBlock
                    verify = board.getMatrix()[line][column].blockToRight(board, line, column, verify);
                }
                column --;
            }
            line ++;
            column = 3;
        } 
       return verify;
    }

    @Override
    public boolean goLeft(IBoard board, boolean verify) {
        int line = 0, column = 1;
        while(line != 5){
            while(column != 5){
                if(board.getMatrix()[line][column].value!=0){
                    verify = board.getMatrix()[line][column].blockToLeft(board, line, column, verify);
                }
                column ++;
            }
            line ++;
            column = 1;
        }
        return verify;
    }

    @Override
    public boolean goUp(IBoard board, boolean verify) {
        int line = 1, column = 0;
        while(column != 5){
            while(line != 5){
                if(board.getMatrix()[line][column].value!=0){
                    verify = board.getMatrix()[line][column].blockToUp(board, line, column, verify);
                }
                line ++;
            }
            line = 1;
            column ++;
        }
        return verify;
    }

    @Override
    public boolean goDown(IBoard board, boolean verify) {
        int line = 3, column = 0;
        while(column != 5){
            while(line != -1){
                if(board.getMatrix()[line][column].value!=0){
                    verify = board.getMatrix()[line][column].blockToDown(board, line, column, verify);
                }
                line --;
            }
            line = 3;
            column ++;
        }      
        return verify;
    }
    
}
