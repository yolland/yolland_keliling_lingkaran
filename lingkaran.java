package com.company;

/**
 * Created by Yolland on 5/19/2015.
 */
public class lingkaran {

    int jari;
    int Diameter;

    public void CetakLayar()
    {
        System.out.println("jari : " + jari);
        System.out.println("Diameter : " +Diameter);
    }
    public void property (int jaribaru, int Diameter){
    }
    {
        jari = jari;
        Diameter = Diameter;
    }
    public double hitungjarilingkaran()
    {
        double jari;
        jari = 3.14*Diameter;
        return jari;
    }
    public double HitungLuaslingkaran()
    {
        double Luas;
        Luas = 3.14 * jari * jari;
        return Luas;
    }
}

