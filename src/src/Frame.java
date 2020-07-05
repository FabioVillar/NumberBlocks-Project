package Arquivos1;

import java.util.Random;

public class Frame extends javax.swing.JFrame {
    public IBlock block = new CBlock(0);
    public IBoard game_board = new CBoard(block);
    public IScore score = new CScore();
    String player; 
    boolean verify;
    IMovement mov = new CMovement();
    
    public void Game_Lost(){
        //player perdeu o jogo
        score.check_record(player, score.getMovements());
        jTextField32.setText(score.getPlayerRecord());
        jTextField33.setText(Integer.toString(score.getScoreRecord()));
        jTextField34.setText("Você conseguiu "+score.getMovements()+ " movimentos!");
        New_Game();
    }
    
    public void New_Game(){
        game_board = new CBoard(block);
        score.setMovementsZero();
        jTextField30.setEditable(true);
        jTextField30.setBackground(new java.awt.Color(255, 255, 255));
        Random random = new Random();
        int coluna = random.nextInt(5);
        int linha = random.nextInt(5);
        game_board.getMatrix()[linha][coluna] = new CBlock(1);
        jTextField27.setText(Integer.toString(score.getMovements()));
        check(game_board);
    }
    
    public void Movement_Done() {
        try{
            if(verify == false){
                throw new NoMovementException(verify);
            }
                score.addScore();
                jTextField36.setText("");
                jTextField27.setText(Integer.toString(score.getMovements()));
                Random random = new Random();
                int line = random.nextInt(5);
                int column = random.nextInt(5);
                while(true){
                    if(game_board.getMatrix()[line][column].value != 0){
                        line = random.nextInt(5);
                        column = random.nextInt(5);
                    }
                    else if(game_board.getMatrix()[line][column].value == 0){
                        game_board.getMatrix()[line][column] = new CBlock(1);
                        break;
                    }
                }
                line = random.nextInt(5);
                column = random.nextInt(5);
                boolean check = true;
                check = game_board.check_matrix(check);

                if(check == true){
                    while(true){
                        if(game_board.getMatrix()[line][column].value != 0){
                            line = random.nextInt(5);
                            column = random.nextInt(5);
                        }
                        else if(game_board.getMatrix()[line][column].value == 0){
                            int sorte = random.nextInt(4);
                            if(sorte == 0){//Não deu sorte
                                game_board.getMatrix()[line][column] = new CBlock(2);
                            }
                            else{
                                game_board.getMatrix()[line][column] = new CBlock(1);
                            }
                            break;
                        }
                    }
                }
                check = game_board.check_matrix(check);
                if(check == false){
                    check = game_board.analise_derrota(check);
                    if(check == false){
                        Game_Lost();
                    }
                }
        }catch(NoMovementException n){
            jTextField36.setText("Nada aconteceu!");
        }
    }
    
    public Frame() {
        initComponents();
        Random random = new Random();
        int coluna = random.nextInt(5);
        int linha = random.nextInt(5);
        game_board.getMatrix()[linha][coluna] = new CBlock(1);
        jTextField27.setText(Integer.toString(score.getMovements()));
        check(game_board);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        down_arrow = new javax.swing.JLabel();
        right_arrow = new javax.swing.JLabel();
        up_arrow = new javax.swing.JLabel();
        left_arrow = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField34 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NumberBlocks");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 220, 40, 26);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(230, 220, 40, 26);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(290, 220, 40, 26);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(350, 220, 40, 26);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(410, 220, 40, 26);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(170, 280, 40, 26);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(230, 280, 40, 26);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(290, 280, 40, 26);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField9);
        jTextField9.setBounds(350, 280, 40, 26);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField10);
        jTextField10.setBounds(410, 280, 40, 26);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField11);
        jTextField11.setBounds(170, 340, 40, 26);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField12);
        jTextField12.setBounds(230, 340, 40, 26);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField13);
        jTextField13.setBounds(290, 340, 40, 26);

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField14);
        jTextField14.setBounds(350, 340, 40, 26);

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField15);
        jTextField15.setBounds(410, 340, 40, 26);

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField16);
        jTextField16.setBounds(170, 400, 40, 26);

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 255, 255));
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField17);
        jTextField17.setBounds(230, 400, 40, 26);

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 255));
        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField18);
        jTextField18.setBounds(290, 400, 40, 26);

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(255, 255, 255));
        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField19);
        jTextField19.setBounds(350, 400, 40, 26);

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(255, 255, 255));
        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField20);
        jTextField20.setBounds(410, 400, 40, 26);

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField21);
        jTextField21.setBounds(170, 460, 40, 26);

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(255, 255, 255));
        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField22);
        jTextField22.setBounds(230, 460, 40, 26);

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(255, 255, 255));
        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField23);
        jTextField23.setBounds(290, 460, 40, 26);

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(255, 255, 255));
        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField24);
        jTextField24.setBounds(350, 460, 40, 26);

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(255, 255, 255));
        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField25);
        jTextField25.setBounds(410, 460, 40, 26);

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(0, 51, 153));
        jTextField28.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(255, 255, 255));
        jTextField28.setText("NumberBlocks");
        jTextField28.setToolTipText("");
        jTextField28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField28.setDisabledTextColor(new java.awt.Color(102, 102, 255));
        getContentPane().add(jTextField28);
        jTextField28.setBounds(0, 0, 150, 26);

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(0, 51, 153));
        jTextField26.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(255, 255, 255));
        jTextField26.setText("Movimentos:");
        jTextField26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField26);
        jTextField26.setBounds(380, 0, 130, 30);

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(255, 255, 255));
        jTextField27.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(0, 51, 153));
        jTextField27.setText("0");
        jTextField27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField27);
        jTextField27.setBounds(510, 0, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/Board.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 200, 304, 308);

        down_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/down_arrow.png"))); // NOI18N
        down_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                down_arrowMouseClicked(evt);
            }
        });
        getContentPane().add(down_arrow);
        down_arrow.setBounds(270, 520, 82, 80);

        right_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/right_arrow.png"))); // NOI18N
        right_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                right_arrowMouseClicked(evt);
            }
        });
        getContentPane().add(right_arrow);
        right_arrow.setBounds(480, 310, 80, 82);

        up_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/up_arrow.png"))); // NOI18N
        up_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_arrowMouseClicked(evt);
            }
        });
        getContentPane().add(up_arrow);
        up_arrow.setBounds(270, 110, 79, 81);

        left_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/left_arrow.png"))); // NOI18N
        left_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                left_arrowMouseClicked(evt);
            }
        });
        getContentPane().add(left_arrow);
        left_arrow.setBounds(70, 310, 80, 82);

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(0, 51, 153));
        jTextField29.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(255, 255, 255));
        jTextField29.setText("Nome:");
        jTextField29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField29);
        jTextField29.setBounds(680, 90, 80, 26);

        jTextField30.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(0, 51, 153));
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField30);
        jTextField30.setBounds(680, 120, 170, 30);

        jTextField31.setEditable(false);
        jTextField31.setBackground(new java.awt.Color(0, 51, 153));
        jTextField31.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(255, 255, 255));
        jTextField31.setText("Recorde:");
        jTextField31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField31);
        jTextField31.setBounds(680, 230, 110, 26);

        jTextField32.setEditable(false);
        jTextField32.setBackground(new java.awt.Color(255, 255, 255));
        jTextField32.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(0, 51, 153));
        jTextField32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField32);
        jTextField32.setBounds(680, 260, 180, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Serif", 0, 11)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(850, 120, 80, 30);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 255));
        jTextField34.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(0, 51, 153));
        jTextField34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField34);
        jTextField34.setBounds(680, 150, 250, 50);

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(255, 255, 255));
        jTextField33.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(0, 51, 153));
        jTextField33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField33);
        jTextField33.setBounds(870, 260, 80, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 0, 480, 500);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/NumberBlocks.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 430, 500, 410);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 470, 700, 330);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(504, 440, 820, 640);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(950, 490, 580, 230);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 370, 650, 380);

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 255));
        jTextField35.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(0, 51, 153));
        jTextField35.setText("Faça o máximo de movimentos que puder!");
        jTextField35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField35);
        jTextField35.setBounds(0, 40, 310, 40);

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(255, 255, 255));
        jTextField36.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(0, 51, 153));
        jTextField36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField36);
        jTextField36.setBounds(0, 77, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 500);

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(0, 51, 153));
        jTextField37.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 255, 255));
        jTextField37.setText("Reiniciar:");
        jTextField37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField37);
        jTextField37.setBounds(1020, 90, 110, 26);

        jButton2.setFont(new java.awt.Font("DejaVu Serif", 0, 11)); // NOI18N
        jButton2.setText("ENTER");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setMaximumSize(new java.awt.Dimension(45, 19));
        jButton2.setMinimumSize(new java.awt.Dimension(45, 19));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1130, 90, 70, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(820, 0, 510, 490);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos1/White.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1150, -170, 730, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void right_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_right_arrowMouseClicked
        verify = false;// assume que nenhum bloco se movimentou
        verify = mov.goRight(game_board, verify);
        Movement_Done();
        check(game_board);
    }//GEN-LAST:event_right_arrowMouseClicked

    private void up_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_arrowMouseClicked
        verify = false;// assume que nenhum bloco se movimentou
        verify = mov.goUp(game_board, verify);
        Movement_Done();
        check(game_board);
    }//GEN-LAST:event_up_arrowMouseClicked

    private void left_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left_arrowMouseClicked
        verify = false;// assume que nenhum bloco se movimentou
        verify = mov.goLeft(game_board, verify);
        Movement_Done();
        check(game_board);
    }//GEN-LAST:event_left_arrowMouseClicked

    private void down_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_down_arrowMouseClicked
        verify = false;// assume que nenhum bloco se movimentou
        verify = mov.goDown(game_board, verify);
        Movement_Done();
        check(game_board);
    }//GEN-LAST:event_down_arrowMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        player = jTextField30.getText();
        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        New_Game();
    }//GEN-LAST:event_jButton2ActionPerformed

   public void check(IBoard board){
        int line = 0, column = 0, aux = 0;
        String vetor[] = new String[25];
        while(line != 5){
            while(column != 5){
                if(board.getMatrix()[line][column].value == 0){
                    vetor[aux] = "";
                }
                else 
                    vetor[aux] = Integer.toString(board.getMatrix()[line][column].value);
                column ++;
                aux ++;
            }
            column = 0;
            line ++;
        }
        jTextField1.setText(vetor[0]);
        jTextField2.setText(vetor[1]);
        jTextField3.setText(vetor[2]);
        jTextField4.setText(vetor[3]);
        jTextField5.setText(vetor[4]);
        jTextField6.setText(vetor[5]);
        jTextField7.setText(vetor[6]);
        jTextField8.setText(vetor[7]);
        jTextField9.setText(vetor[8]);
        jTextField10.setText(vetor[9]);
        jTextField11.setText(vetor[10]);
        jTextField12.setText(vetor[11]);
        jTextField13.setText(vetor[12]);
        jTextField14.setText(vetor[13]);
        jTextField15.setText(vetor[14]);
        jTextField16.setText(vetor[15]);
        jTextField17.setText(vetor[16]);
        jTextField18.setText(vetor[17]);
        jTextField19.setText(vetor[18]);
        jTextField20.setText(vetor[19]);
        jTextField21.setText(vetor[20]);
        jTextField22.setText(vetor[21]);
        jTextField23.setText(vetor[22]);
        jTextField24.setText(vetor[23]);
        jTextField25.setText(vetor[24]);
        color(jTextField1);
        color(jTextField2);
        color(jTextField3);
        color(jTextField4);
        color(jTextField5);
        color(jTextField6);
        color(jTextField7);
        color(jTextField8);
        color(jTextField9);
        color(jTextField10);
        color(jTextField11);
        color(jTextField12);
        color(jTextField13);
        color(jTextField14);
        color(jTextField15);
        color(jTextField16);
        color(jTextField17);
        color(jTextField18);
        color(jTextField19);
        color(jTextField20);
        color(jTextField21);
        color(jTextField22);
        color(jTextField23);
        color(jTextField24);
        color(jTextField25);
    }
   public void color(javax.swing.JTextField j){
       if("".equals(j.getText())){
           j.setBackground(new java.awt.Color(255,255,255));
           j.setForeground(new java.awt.Color(0,0,0));
       }
       else if("1".equals(j.getText())){
           j.setBackground(new java.awt.Color(255,204,204));
           j.setForeground(new java.awt.Color(0,0,0));
       }
       else if("2".equals(j.getText())){
           j.setBackground(new java.awt.Color(255,102,102));
           j.setForeground(new java.awt.Color(0,0,0));
       }
       else if("3".equals(j.getText())){
           j.setBackground(new java.awt.Color(255,51,51));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("4".equals(j.getText())){
           j.setBackground(new java.awt.Color(255,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("5".equals(j.getText())){
           j.setBackground(new java.awt.Color(204,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("6".equals(j.getText())){
           j.setBackground(new java.awt.Color(204,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("7".equals(j.getText())){
           j.setBackground(new java.awt.Color(153,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("8".equals(j.getText())){
           j.setBackground(new java.awt.Color(153,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("9".equals(j.getText())){
           j.setBackground(new java.awt.Color(153,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("10".equals(j.getText())){
           j.setBackground(new java.awt.Color(102,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("11".equals(j.getText())){
           j.setBackground(new java.awt.Color(102,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("12".equals(j.getText())){
           j.setBackground(new java.awt.Color(102,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("13".equals(j.getText())){
           j.setBackground(new java.awt.Color(102,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("14".equals(j.getText())){
           j.setBackground(new java.awt.Color(102,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("15".equals(j.getText())){
           j.setBackground(new java.awt.Color(51,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("16".equals(j.getText())){
           j.setBackground(new java.awt.Color(51,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("17".equals(j.getText())){
           j.setBackground(new java.awt.Color(51,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("18".equals(j.getText())){
           j.setBackground(new java.awt.Color(51,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("19".equals(j.getText())){
           j.setBackground(new java.awt.Color(51,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else if("20".equals(j.getText())){
           j.setBackground(new java.awt.Color(0,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       else{
           j.setBackground(new java.awt.Color(0,0,0));
           j.setForeground(new java.awt.Color(255,255,255));
       }
       
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel down_arrow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField14;
    public static javax.swing.JTextField jTextField15;
    public static javax.swing.JTextField jTextField16;
    public static javax.swing.JTextField jTextField17;
    public static javax.swing.JTextField jTextField18;
    public static javax.swing.JTextField jTextField19;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField20;
    public static javax.swing.JTextField jTextField21;
    public static javax.swing.JTextField jTextField22;
    public static javax.swing.JTextField jTextField23;
    public static javax.swing.JTextField jTextField24;
    public static javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    public static javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    public static javax.swing.JTextField jTextField32;
    public static javax.swing.JTextField jTextField33;
    public static javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    public static javax.swing.JLabel left_arrow;
    public static javax.swing.JLabel right_arrow;
    public static javax.swing.JLabel up_arrow;
    // End of variables declaration//GEN-END:variables
}
