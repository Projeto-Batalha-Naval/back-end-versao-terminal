package batalhanaval;

import enity.Jogador;

public class BatalhaNaval {

    public static void main(String[] args) {
    	Jogador jogador1 = new Jogador(1);
    	jogador1.escolherPosicaoDaEmbarcacao(jogador1.getNavioDe1Cano());;
    	Jogador jogador2 = new Jogador(2);
    	jogador2.disparo(jogador1);
    }
    
}
