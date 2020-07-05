package Arquivos1;

public class CBlock implements IBlock{
    public int value;
    
    public CBlock(int value){
        this.value = value;
    }
    @Override
    public CBlock[][] gerarMatriz(){
        CBlock matriz[][] = new CBlock[5][5];
        int line = 0, column = 0;
        while(line != 5){
            while(column != 5){
                matriz[line][column] = new CBlock(0);
                column ++;
            }
            column = 0;
            line ++;
        }
        return matriz;
    }
    @Override
    public int getValue(){//veio da interface IBlock
        return value;
    }
    
    @Override
    public boolean blockToRight(IBoard board, int line, int column, boolean verify){
        int auxc = column + 1;
        while(auxc != 5){
            if(board.getMatrix()[line][auxc].value == 0){//o bloco da direita é nulo
                board.getMatrix()[line][auxc] = new CBlock(board.getMatrix()[line][column].value);
                board.getMatrix()[line][column] = new CBlock(0);//troca realizada
                verify = true;
                column = auxc;
            }
            else if(board.getMatrix()[line][auxc].value == board.getMatrix()[line][column].value){//bloco igual na direita
                board.getMatrix()[line][auxc].value ++;
                board.getMatrix()[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.getMatrix()[line][auxc].value != board.getMatrix()[line][column].value){
                break;
            }    
            auxc++;
        }
        return verify;
    }
    
    @Override
    public boolean blockToLeft(IBoard board, int line, int column, boolean verify){
        int auxc = column - 1;
        while(auxc != -1){
            if(board.getMatrix()[line][auxc].value == 0){//o bloco da esquerda é nulo
                board.getMatrix()[line][auxc] = new CBlock(board.getMatrix()[line][column].value);
                board.getMatrix()[line][column] = new CBlock(0);//troca realizada
                verify = true;
                column = auxc;
            }
            else if(board.getMatrix()[line][auxc].value == board.getMatrix()[line][column].value){//bloco igual na esquerda
                board.getMatrix()[line][auxc].value ++;
                board.getMatrix()[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.getMatrix()[line][auxc].value != board.getMatrix()[line][column].value){
                break;
            }    
            auxc--;
        }
        return verify;
    }
    
    @Override
    public boolean blockToUp(IBoard board, int line, int column, boolean verify){
        int auxl = line - 1;
        while(auxl!=-1){
            if(board.getMatrix()[auxl][column].value == 0){//o bloco de cima é nulo
                board.getMatrix()[auxl][column] = new CBlock(board.getMatrix()[line][column].value);
                board.getMatrix()[line][column] = new CBlock(0);//troca realizada
                verify = true;
                line = auxl;
            }
            else if(board.getMatrix()[auxl][column].value == board.getMatrix()[line][column].value){//bloco igual acima
                board.getMatrix()[auxl][column].value ++;
                board.getMatrix()[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.getMatrix()[auxl][column].value != board.getMatrix()[line][column].value){
                break;
            }
            auxl--;
        }
        return verify;
    }
                
    @Override
     public boolean blockToDown(IBoard board, int line, int column, boolean verify){
        int auxl = line + 1;
        while(auxl!=5){
            if(board.getMatrix()[auxl][column].value == 0){//o bloco de baixo é nulo
                board.getMatrix()[auxl][column] = new CBlock(board.getMatrix()[line][column].value);
                board.getMatrix()[line][column] = new CBlock(0);//troca realizada
                verify = true;
                line = auxl;
            }
            else if(board.getMatrix()[auxl][column].value == board.getMatrix()[line][column].value){//bloco igual abaixo
                board.getMatrix()[auxl][column].value ++;
                board.getMatrix()[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.getMatrix()[auxl][column].value != board.getMatrix()[line][column].value){
                break;
            }
            auxl++;
        }
        return verify;
     }   
}