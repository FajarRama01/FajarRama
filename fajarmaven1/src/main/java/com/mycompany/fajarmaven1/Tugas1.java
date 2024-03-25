/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fajarmaven1;

import java.util.Scanner;

/**
 *
 * @author A-11
 */
public class Tugas1 {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;

        double variabel1 = 5;
        double variabel2 = 8;

        boolean isPlus = true;
        
        String nama = "";
        
        Scanner input = new Scanner(System.in);
        
//        HHSystem.out.println("Nama = "+nama);
          
        System.out.println("nilaiA = "+nilaiA);
        
        System.out.println("nilaiB = "+nilaiB);
        
        System.out.println("variabel1 = "+variabel1);
        
        System.out.println("variabel1 = "+variabel2);
        
        System.out.println("isPlus = "+isPlus);
        
     
        
        System.out.println("Silahkan Masukkan nilaiA Baru :");
        nilaiA = input.nextInt();
        
        System.out.println("Silahkan Masukkan nilaiB Baru :");
        nilaiB = input.nextInt();
        
        System.out.println("Silahkan Masukkan variavel1 Baru :");
        variabel1 = input.nextDouble();
        
        System.out.println("Silahkan Masukkan variavel2 Baru :");
        variabel2 = input.nextDouble();
        
        System.out.println("Silahkan Masukkan isPlus Baru :");
        isPlus = input.nextBoolean();
        
        System.out.println("Silahkan Masukkan Nama Anda : ");
        nama = input.nextLine();
        nama = input.nextLine();

        
        
        System.out.println("Nilai Nilai A Baru = " + nilaiA);
        System.out.println("Nilai Nilai BBaru = " + nilaiB);
        System.out.println("Nilai Variabel 1 Baru = " + variabel1);
        System.out.println("Nilai Variabel 2 Baru = " + variabel2);
        System.out.println("Nilai IsPlus Baru = " + isPlus);
        System.out.println("Nilai Nama Baru = " + nama);
        
        
        
        
        
//        var nama = "";
//        String nama = "Haloo";
//        System.out.println("Masukkan Nama = "+nama);
////        Scanner input = new Scanner(System.in)
//        nama = input.nextLine();
//        System.out.println("Nama = "+ nama);
        
//        System.out.println("Masukkan Nama = ");
//        String str = input.nextLine();
//        System.out.println("Nama = "+ str);
    }
    
}
