package Arquivos1;

public class CScore implements IScore{
    int movements;
    int score_record = 0;//Ficarão expostos na GUI
    String player_record = "";
    
    public CScore(){
        this.movements = 0;
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
