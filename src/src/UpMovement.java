package Arquivos1;

public class UpMovement implements IMovement{
    @Override
    public boolean goUp(CBoard board, boolean verify){
        
        int line = 1, column = 0;
        while(column != 5){
            while(line != 5){
                if(board.matrix[line][column].value!=0){
                    verify = board.matrix[line][column].blockToUp(board, line, column, verify);
                }
                line ++;
            }
            line = 1;
            column ++;
        }
        return verify;
    }
    
    @Override
    public boolean goLeft(CBoard board, boolean verify){return verify;}
    @Override
    public boolean goRight(CBoard board, boolean verify){return verify;}
    @Override
    public boolean goDown(CBoard board, boolean verify){return verify;}
}
