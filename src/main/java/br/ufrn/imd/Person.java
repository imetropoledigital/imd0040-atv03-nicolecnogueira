package br.ufrn.imd;

public class Person {
    public String name;
    public String hometown;

    public Person(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public String getHometown(){
        return hometown;
    }
    public String getName(){
        return name;
    }
}
