package br.ufrn.imd;

public class Musician extends Person{
    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    public Musician(String name, String hometown, boolean playClassicalMusic, boolean canCompose, boolean canImprovise) {
        super(name, hometown);
        this.playClassicalMusic = playClassicalMusic;
        this.canCompose = canCompose;
        this.canImprovise = canImprovise;
    }

    public void play(){
    }
}
