package com.company;

/**
 * Created by VAIO on 5/19/2015.
 */
public class teks_lingkaran_segitiga
{
    public static void main(String[] args)
    {
        segitiga bangun_Segitiga = new segitiga();
        lingkaran bangun_Lingkaran = new lingkaran();

        bangun_Segitiga.alas = 10;
        bangun_Segitiga.tinggi = 10;
        bangun_Segitiga.sisimiring = 20;
        bangun_Lingkaran.jari = 10;
        bangun_Lingkaran.Diameter = 20;

        bangun_Lingkaran.CetakLayar();
        System.out.println("Luas Lingkaran: " + bangun_Lingkaran.hitungjarilingkaran());
        System.out.println("Keliling Lingkarang: " + bangun_Lingkaran.HitungLuaslingkaran());

        bangun_Segitiga.CetakLayar();
        System.out.println("Luas Segitiga: " + bangun_Segitiga.hitungLuasSegitiga());
        System.out.println("Keliling Segitiga: " + bangun_Segitiga.hitungKelilingSegitiga());
    }

}