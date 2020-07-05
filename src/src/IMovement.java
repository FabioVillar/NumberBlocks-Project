package Arquivos1;
public interface IMovement {
    public boolean goRight(IBoard board, boolean verify);
    public boolean goLeft(IBoard board, boolean verify);
    public boolean goUp(IBoard board, boolean verify);
    public boolean goDown(IBoard board, boolean verify);
}
