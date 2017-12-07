package com.sabel.swt.strategytiere;

public class StrategyTiere {

    public static void main(String[] args) {

        Tier elefant = new Elefant();
        elefant.laufen();
        elefant.machGerausch();
        ((Elefant)elefant).ruesselBewegen();

        Tier trampelzisch = new Trampelzisch();
        trampelzisch.laufen();
        trampelzisch.machGerausch();

        Tier schlange = new Schlange();
        schlange.laufen();
        schlange.machGerausch();

    }

}
