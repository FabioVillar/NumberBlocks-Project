package Arquivos1;

public class CBlock implements IBlock{
    public int value;
    
    public CBlock(int value){
        this.value = value;
    }
    
    @Override
    public int getValue(){//veio da interface IBlock
        return value;
    }
    
    @Override
    public boolean blockToRight(CBoard board, int line, int column, boolean verify){
        int auxc = column + 1;
        while(auxc != 5){
            if(board.matrix[line][auxc].value == 0){//o bloco da direita é nulo
                board.matrix[line][auxc] = new CBlock(board.matrix[line][column].value);
                board.matrix[line][column] = new CBlock(0);//troca realizada
                verify = true;
                column = auxc;
            }
            else if(board.matrix[line][auxc].value == board.matrix[line][column].value){//bloco igual na direita
                board.matrix[line][auxc].value ++;
                board.matrix[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.matrix[line][auxc].value != board.matrix[line][column].value){
                break;
            }    
            auxc++;
        }
        return verify;
    }
    
    @Override
    public boolean blockToLeft(CBoard board, int line, int column, boolean verify){
        int auxc = column - 1;
        while(auxc != -1){
            if(board.matrix[line][auxc].value == 0){//o bloco da esquerda é nulo
                board.matrix[line][auxc] = new CBlock(board.matrix[line][column].value);
                board.matrix[line][column] = new CBlock(0);//troca realizada
                verify = true;
                column = auxc;
            }
            else if(board.matrix[line][auxc].value == board.matrix[line][column].value){//bloco igual na esquerda
                board.matrix[line][auxc].value ++;
                board.matrix[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.matrix[line][auxc].value != board.matrix[line][column].value){
                break;
            }    
            auxc--;
        }
        return verify;
    }
    
    @Override
    public boolean blockToUp(CBoard board, int line, int column, boolean verify){
        int auxl = line - 1;
        while(auxl!=-1){
            if(board.matrix[auxl][column].value == 0){//o bloco de cima é nulo
                board.matrix[auxl][column] = new CBlock(board.matrix[line][column].value);
                board.matrix[line][column] = new CBlock(0);//troca realizada
                verify = true;
                line = auxl;
            }
            else if(board.matrix[auxl][column].value == board.matrix[line][column].value){//bloco igual acima
                board.matrix[auxl][column].value ++;
                board.matrix[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.matrix[auxl][column].value != board.matrix[line][column].value){
                break;
            }
            auxl--;
        }
        return verify;
    }
                
    @Override
     public boolean blockToDown(CBoard board, int line, int column, boolean verify){
        int auxl = line + 1;
        while(auxl!=5){
            if(board.matrix[auxl][column].value == 0){//o bloco de baixo é nulo
                board.matrix[auxl][column] = new CBlock(board.matrix[line][column].value);
                board.matrix[line][column] = new CBlock(0);//troca realizada
                verify = true;
                line = auxl;
            }
            else if(board.matrix[auxl][column].value == board.matrix[line][column].value){//bloco igual abaixo
                board.matrix[auxl][column].value ++;
                board.matrix[line][column] = new CBlock(0);//fusão realizada
                verify = true;
                break;
            }
            else if(board.matrix[auxl][column].value != board.matrix[line][column].value){
                break;
            }
            auxl++;
        }
        return verify;
     }   
}