package com.sabel.swt.strategytiere;

public class KannNichtLaufen implements Bewegung {
    @Override
    public void laufen() {
        System.out.println("Kann nicht laufen");
    }
}
