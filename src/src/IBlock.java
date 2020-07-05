package Arquivos1;
public interface IBlock {
    public int getValue();
    public boolean blockToRight(IBoard board, int line, int column, boolean verify);
    public boolean blockToLeft(IBoard board, int line, int column, boolean verify);
    public boolean blockToUp(IBoard board, int line, int column, boolean verify);
    public boolean blockToDown(IBoard board, int line, int column, boolean verify);
    public CBlock[][] gerarMatriz();
}
