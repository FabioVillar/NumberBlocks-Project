package Arquivos1;

public interface IBlock {
    
    public int getValue();
    public boolean blockToRight(CBoard board, int line, int column, boolean verify);
    public boolean blockToLeft(CBoard board, int line, int column, boolean verify);
    public boolean blockToUp(CBoard board, int line, int column, boolean verify);
    public boolean blockToDown(CBoard board, int line, int column, boolean verify);
}
