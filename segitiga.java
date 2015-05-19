package com.company;

/**
 * Created by VAIO on 5/19/2015.
 */
public class segitiga{
    int alas;
    int tinggi;
    int sisimiring;

    public void CetakLayar()
    {
        System.out.println("alas = " +alas);
        System.out.println("tinggi = " +tinggi);
        System.out.println("sisimiring = " +sisimiring);
    }
    public void Property (int abaru , int tbaru , int smbaru){
        alas = abaru;
        tinggi = tbaru;
        sisimiring = smbaru;
    }
    public double hitungLuasSegitiga() {
        double hitungluas;
        hitungluas = 0.5 * alas * tinggi;
        return hitungluas;
    }
    public int hitungKelilingSegitiga(){
        int tinggi;
        tinggi = alas + sisimiring + sisimiring;
        return tinggi;
    }

}
