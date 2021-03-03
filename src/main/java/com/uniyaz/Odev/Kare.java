package com.uniyaz.Odev;

public class Kare extends Sekil{

    private  double kenar;

    public double getKenar() {
        return kenar;
    }
    public void setKenar(double kenar) {
        this.kenar = kenar;
    }
    @Override
   public double cevreHesapla(double kenar) {
       double cevre1 =kenar * 4;
       return cevre1;
    }
    @Override
    public  double alanHesapla(double kenar) {
       double alan1= kenar * kenar;
       return alan1;
    }

}
