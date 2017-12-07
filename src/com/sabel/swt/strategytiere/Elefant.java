package com.sabel.swt.strategytiere;

public class Elefant extends Tier {
    public Elefant() {
        super(new Troet(),new Trampeln());
    }

    public void ruesselBewegen() {
        System.out.println("Rüssel wird bewegt");
    }

}
