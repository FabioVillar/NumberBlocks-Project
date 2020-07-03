package Arquivos1;

public class LeftMovement implements IMovement{
    @Override
    public boolean goLeft(CBoard board, boolean verify){
        int line = 0, column = 1;
        while(line != 5){
            while(column != 5){
                if(board.matrix[line][column].value!=0){
                    verify = board.matrix[line][column].blockToLeft(board, line, column, verify);
                }
                column ++;
            }
            line ++;
            column = 1;
        }
        return verify;
    }
    
    @Override
    public boolean goRight(CBoard board, boolean verify){return verify;}
    
    @Override
    public boolean goUp(CBoard board, boolean verify){return verify;}
    
    @Override
    public boolean goDown(CBoard board, boolean verify){return verify;}
}
