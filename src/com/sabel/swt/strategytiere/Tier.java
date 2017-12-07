package com.sabel.swt.strategytiere;

public abstract class Tier {

    private Gerausch gerausch;
    private Bewegung bewegung;


    public Tier(Gerausch gerausch, Bewegung bewegung) {
        this.gerausch = gerausch;
        this.bewegung = bewegung;
    }

    public void machGerausch() {
        gerausch.machGerausch();
    }

    public void laufen() {
        bewegung.laufen();
    }

    public void setGerausch(Gerausch gerausch) {
        this.gerausch = gerausch;
    }

    public void setBewegung(Bewegung bewegung) {
        this.bewegung = bewegung;
    }

}
