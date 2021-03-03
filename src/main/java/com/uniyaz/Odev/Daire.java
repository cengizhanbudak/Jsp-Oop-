package com.uniyaz.Odev;

public class Daire extends Sekil{

    private double yaricap;

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double cevreHesapla(double yaricap) {
       double cevre1=   (Math.PI * yaricap * 2);
       return cevre1;

    }

    @Override
    double alanHesapla(double yaricap) {
        double alan1=  (Math.PI * yaricap * yaricap);
        return alan1;

    }
}
