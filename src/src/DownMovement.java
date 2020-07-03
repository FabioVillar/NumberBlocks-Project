package Arquivos1;

public class DownMovement implements IMovement{
    @Override
    public boolean goDown(CBoard board, boolean verify){
        
        int line = 3, column = 0;
        while(column != 5){
            while(line != -1){
                if(board.matrix[line][column].value!=0){
                    verify = board.matrix[line][column].blockToDown(board, line, column, verify);
                }
                line --;
            }
            line = 3;
            column ++;
        }      
        return verify;
    }
    
    @Override
    public boolean goLeft(CBoard board, boolean verify){return verify;}
    @Override
    public boolean goUp(CBoard board, boolean verify){return verify;}
    @Override
    public boolean goRight(CBoard board, boolean verify){return verify;}
}
