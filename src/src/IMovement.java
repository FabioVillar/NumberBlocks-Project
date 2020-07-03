package Arquivos1;
public interface IMovement {
    public boolean goRight(CBoard board, boolean verify);
    public boolean goLeft(CBoard board, boolean verify);
    public boolean goUp(CBoard board, boolean verify);
    public boolean goDown(CBoard board, boolean verify);
}
