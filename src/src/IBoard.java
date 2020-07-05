package Arquivos1;

public interface IBoard {
    public boolean analise_derrota(boolean x);
    public boolean check_matrix(boolean x);
    public CBlock[][] getMatrix();
}