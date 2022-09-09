package com.company;

public class Autobaza {
    private String baza;
    private int id;

    public Autobaza(String baza, int id) {
        this.baza = baza;
        this.id = id;
    }

    public String getBaza() {
        return baza;
    }

    public void setBaza(String baza) {
        this.baza = baza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Autobaza{" +
                "baza='" + baza + '\'' +
                ", id=" + id +
                '}';
    }
}
