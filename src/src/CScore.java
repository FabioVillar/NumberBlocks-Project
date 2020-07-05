package Arquivos1;

public class CScore implements IScore{
    public int movements;
    public int score_record = 0;//Ficarão expostos na GUI
    public String player_record = "";
    
    public CScore(){
        this.movements = 0;
    }
    
    @Override
    public int getMovements(){
        return movements;
    }
    
    @Override
    public void setMovementsZero(){
        movements = 0;
    }
    
    @Override
    public int getScoreRecord(){
        return score_record;
    }
    @Override
    public String getPlayerRecord(){
        return player_record;
    }
    
    
    @Override
    public void addScore(){
        this.movements++;
    }
    
    @Override
    public void check_record(String player, int score){
        if(score > score_record){
            score_record = score;
            player_record = player;
        }
    }
}
