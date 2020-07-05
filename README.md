# Projeto NumberBlocks

![NB](/Gameplay.png)


# Descrição Resumida do Projeto

  O jogo **NumberBlocks**, inspirado nos jogos "**2048**"(criado pelo italiano Gabriele Cirulli), e "**Threes**"(criado pelo designer de jogos Asher Vollmer), ambos lançados em 
2014, é um jogo do gênero "Puzzle", em que o player interage com blocos numerados em um tabuleiro 5x5, com o **objetivo de conseguir o maior número de movimentos no tabuleiro**. 

  O jogo se inicia com apenas um único bloco no tabuleiro, tendo este bloco o valor **1**. O player **sempre** tem apenas 4 opções para movimentar o tabuleiro: **ou para cima,
ou para baixo, ou para a direita, ou para a esquerda**. Os blocos do tabuleiro irão se mover na direção desejada pelo player, e, cada vez que o player executar um movimento,
dois novos blocos serão criados e surgirão em casas aleatórias (desde que desocupadas) do tabuleiro 5x5. Após o movimento, o primeiro bloco criado terá valor **1**, e o segundo
terá 75% de chance de ser de valor **1**, e 25% de chance de ser de valor **2**. **Dois blocos se "juntam" se possuírem o mesmo valor e estiverem na mesma direção** do movimento
executado pelo player. Por exemplo, se em uma linha do tabuleiro estiverem presentes apenas dois blocos de valor **3**, e o player executar um movimento para a direita ou para a
esquerda (mesma direção da linha, horizontal), os dois blocos irão se "juntar" em um único bloco de valor 1 (uma) unidade superior, ou seja, neste exemplo, seria criado um bloco
de valor **4**. 

  O jogo se encerra quando o **player não tem mais opções de movimentos válidos** (ou não-inúteis, ou seja, movimentos em que pelo menos um bloco se move no tabuleiro), e,
quando isso acontece, a pontuação, que consiste no número de movimentos executados pelo player é comparada ao recorde vigente para ver se este último foi batido ou não. Caso
tenha sido, o jogo exibirá em sua tela o nome do player e a pontuação recorde obtida.

# Equipe

* Fábio Santos Villar - RA 234135

# Vídeos do Projeto

## Vídeo da Prévia

[Vídeo da Prévia](https://drive.google.com/file/d/1nmPM_qpGrN0Ik83xvhiKUMV3qm57hYEn/view?usp=sharing)

## Vídeo do Jogo

# Slides do Projeto

## Slides da Prévia

[Slides da Prévia](https://drive.google.com/file/d/1dwqOKycmCraEuQOiUXkEy_KgdId-YAaG/view?usp=sharing)

## Slides da Apresentação Final

## Relatório de Evolução

Desde o início o projeto era inspirado nos jogos "**2048**" e "**Threes**", porém algumas ideias de características iniciais do jogo foram alteradas com o passar do tempo.
Assim como o "**2048**", o projeto incluiria um tabuleiro 4x4, porém, por uma questão de diferenciação e de uma possível melhor jogabilidade, decidi ampliar o tabuleiro 
para um 5x5, ou seja, com 9 casas a mais que a ideia inicial. Outras mudanças foram implementadas com o desenvolvimento do projeto, como o uso de um bloco de valor inicial
**1** em vez de **5**, como visto no vídeo e nos slides da prévia, e uma substituição na dinâmica da "fusão" entre dois blocos: inicialmente, dois blocos que se "juntassem"
iriam gerar um novo bloco com valor igual à soma dos valores dos blocos originais (ou seja, o dobro do valor dos blocos originais, visto que eles já deviam ser iguais para
se juntarem), e, além disso, 2 dois novos blocos surgem em uma posição aleatória (desde que desocupada) do tabuleiro a cada movimento, ao contrário da "versão inicial", em que
apenas 1 bloco surgia. A ideia seria de que os 2 novos blocos tivessem valor igual a **1**, porém, ao verificar a jogabilidade neste formato, notei uma dificuldade muito baixa
para se alcançar um número alto de movimentos. Desta forma, decidi implementar uma variável responsável por gerar um mecanismo de "sorte": a cada movimento, existirá uma 
possibilidade de 75% de o jogo criar dois blocos iguais e de valor **1**, e 25% dele criar dois blocos, mas um com valor **1** e outro com valor **2**, sendo que esta última
possibilidade torna o jogo mais difícil, vide a dificuldade maior em se "juntar" dois blocos como consequência disto.

A principal dificuldade do projeto foi de "dominar" o uso da interface gráfica (Java GUI), visto que era um conceito totalmente novo para mim e, portanto, gastei bastante tempo
aprendendo a implementá-la da melhor maneira possível. Durante a codificação do projeto, deparei-me com uma série de dificuldades, como por exemplo muitos erros inesperados e
"bugs" no código, que só foram solucionados após muitos testes e análises do projeto. Portanto, uma lição aprendida foi de melhorar a organização do código antes mesmo de 
implementá-lo, e fazer um uso maior de anotações e similares para, desta forma, diminuir o número de "bugs" no código do jogo. 

REFERÊNCIAS DE DIAGRAMAS E RECORTES DE MUDANÇAS


# Destaques de Código

Método da classe CBoard responsável por verificar se o player perdeu ou não o jogo, ou seja, esse método analisa se o player ainda possui algum opção de movimento não-inútil, ou seja,
se algum bloco consegue se mover para um dos quatro sentidos, cima, baixo, esquerda, direita:

```

public boolean analise_derrota(boolean x){
        //analisando para ver se algum bloco consegue se movimentar para a direita
        int line = 0, column = 3;
        while(line != 5){
            while(column != -1){
                if(matrix[line][column].value!=0){//se for um ValuableBlock
                    int auxc = column + 1;
                    while(true){
                        if(matrix[line][auxc].value == 0){//o bloco da direita é nulo
                            return true;}
                        else if(matrix[line][auxc].value == matrix[line][column].value){//bloco igual na direita
                            return true;}
                        else if(matrix[line][auxc].value != matrix[line][column].value){
                            break;
                        }}}
                else if(matrix[line][column].value == 0){
                    return true;}
                column --;}
            line ++;
            column = 3;}
            
```

Método da classe Frame que implementa um esquema de cores para os blocos do tabuleiro: (O código continua para mais possibilidades de valor dos blocos)

```
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
       ...

```

Método da classe frame que recebe um evento realizado na interface gráfica, e realiza uma ação com base nele: (Este código se repete para as demais opções de movimento)

```
private void right_arrowMouseClicked(java.awt.event.MouseEvent evt) {                                         
        RightMovement x = new RightMovement();
        verify = false;// assume que nenhum bloco se movimentou
        verify = x.goRight(game_board, verify);
        Movement_Done();
        check(game_board);
    }

```

# Destaques de Pattern

## Diagrama do Pattern

![DP](/Pattern_Diagram.png)

## Código do Pattern

`<addr>`

# Conclusões e Trabalhos Futuros

INSERIR TEXTO AQUI

# Documentação dos Componentes

# Diagramas

## Diagrama Geral do Projeto

## Diagrama Geral de Componentes

