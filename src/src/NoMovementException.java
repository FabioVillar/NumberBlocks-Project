package Arquivos1;

public class NoMovementException extends Exception{
    boolean verify;
    
    public NoMovementException(boolean verify){
        this.verify = verify;
    }
    @Override
    public String toString(){
        return "Movimento 'inútil' (boolean verify = "+verify+ ") : nenhum bloco pode se mover para a direção desejada";
    }
}
