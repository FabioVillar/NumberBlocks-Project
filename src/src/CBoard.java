package Arquivos1;

public class CBoard implements IBoard{
    public CBlock matrix[][] = new CBlock[5][5];
    public CBoard(){
        int line = 0, column = 0;
        while(line != 5){
            while(column != 5){
                matrix[line][column] = new CBlock(0);
                column ++;
            }
            column = 0;
            line ++;
        }
    }
    
    public boolean analise_derrota(boolean x){
        //analisando para ver se algum bloco consegue se movimentar para a direita
        int line = 0, column = 3;
        while(line != 5){
            while(column != -1){
                if(matrix[line][column].value!=0){//se for um ValuableBlock
                    int auxc = column + 1;
                    while(true){
                        if(matrix[line][auxc].value == 0){//o bloco da direita é nulo
                            return true;
                        }
                        else if(matrix[line][auxc].value == matrix[line][column].value){//bloco igual na direita
                            return true;
                        }
                        else if(matrix[line][auxc].value != matrix[line][column].value){
                            break;
                        }    
                        
                    }
                }
                else if(matrix[line][column].value == 0){
                    return true;
                }
                column --;
            }
            line ++;
            column = 3;
        }
        
        //analisando para ver se algum bloco consegue se movimentar para a esquerda
        line = 0;
        column = 1;
        while(line != 5){
            while(column != 5){
                if(matrix[line][column].value!=0){//se for um ValuableBlock
                    int auxc = column - 1;
                    while(true){
                        if(matrix[line][auxc].value == 0){//o bloco da esquerda é nulo
                            return true;
                        }
                        else if(matrix[line][auxc].value == matrix[line][column].value){//bloco igual na esquerda
                            return true;
                        }
                        else if(matrix[line][auxc].value != matrix[line][column].value){
                            break;
                        }    
                        
                    }
                }
                else
                    return true;
                column ++;
            }
            line ++;
            column = 1;
        }
        
        //analisando para ver se algum bloco consegue se movimentar para cima
        line = 1; column = 0;
        while(column != 5){
            while(line != 5){
                if(matrix[line][column].value!=0){
                    int auxl = line - 1;
                    while(true){
                        if(matrix[auxl][column].value == 0){//o bloco de cima é nulo
                            return true;
                        }
                        else if(matrix[auxl][column].value == matrix[line][column].value){//bloco igual acima
                            return true;
                        }
                        else if(matrix[auxl][column].value != matrix[line][column].value){
                            break;
                        }
                        
                    }
                }
                else
                    return true;
                line ++;
            }
            line = 1;
            column ++;
        }
        
        //analisando para ver se algum bloco consegue se movimentar para baixo
        line = 3; column = 0;
        while(column != 5){
            while(line != -1){
                if(matrix[line][column].value!=0){
                    int auxl = line + 1;
                    while(true){
                        if(matrix[auxl][column].value == 0){//o bloco de baixo é nulo
                            return true;
                        }
                        else if(matrix[auxl][column].value == matrix[line][column].value){//bloco igual abaixo
                                return true;
                        }
                        else if(matrix[auxl][column].value != matrix[line][column].value){
                            break;
                        }
                        
                    }
                }
                else
                    return true;
                line --;
            }
            line = 3;
            column ++;
        }
        return false;
    }
    
    public boolean check_matrix(boolean x){
        int line = 0, column = 0;
        while(line!=5){
            while(column!=5){
                if(matrix[line][column].value == 0){
                    return true;
                }
                column++;
            }
            line++;
            column=0;
        }
        return false;
    }
}
