package com.dmigus.shelterapp.beans;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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

    public double getWiek() {
        return wiek;
    }

    public void setWiek(double wiek) {
        this.wiek = wiek;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
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
    @NotNull
    @Size(min=2, max=50)
    private String imie;
    @NotNull
    private String plec;
    @NotNull
    private double wiek;
    @NotNull
    private float waga;
    @NotNull
    @Size(min=2, max=50)
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
