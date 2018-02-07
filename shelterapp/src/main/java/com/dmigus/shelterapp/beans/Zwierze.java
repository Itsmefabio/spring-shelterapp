package com.dmigus.shelterapp.beans;

import javax.persistence.*;

@Entity
@Table(name="zwierzeta")
public class Zwierze {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getOpiekun() {
        return opiekun;
    }

    public void setOpiekun(String opiekun) {
        this.opiekun = opiekun;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imie;
    private String plec;
    private int wiek;
    private int waga;
    private String opiekun;

    @Override
    public String toString() {
        return "Zwierze{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek +
                ", waga=" + waga +
                ", opiekun='" + opiekun + '\'' +
                '}';
    }
}
