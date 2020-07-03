package Arquivos1;

public class RightMovement implements IMovement{
    @Override
    public boolean goRight(CBoard board, boolean verify){
        int line = 0, column = 3;
        while(line != 5){
            while(column != -1){
                if(board.matrix[line][column].value!=0){//se for um ValuableBlock
                    verify = board.matrix[line][column].blockToRight(board, line, column, verify);
                }
                column --;
            }
            line ++;
            column = 3;
        } 
       return verify;
    }
    
    @Override
    public boolean goLeft(CBoard board, boolean verify){return verify;}
    
    @Override
    public boolean goUp(CBoard board, boolean verify){return verify;}
    
    @Override
    public boolean goDown(CBoard board, boolean verify){return verify;}
}
