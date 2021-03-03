package com.uniyaz.Odev;

public class Dikdörtgen {

    private double kenar1;
    private double kenar2;

    public Dikdörtgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }


   public double alanHesapla() {
       double alan1= (kenar1 * kenar2);
       return alan1;
    }



    public double cevreHesapla() {
        double cevre1= 2*(kenar1 + kenar2);
        return cevre1;
    }



}
