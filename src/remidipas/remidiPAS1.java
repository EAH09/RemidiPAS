/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidipas;

import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class remidiPAS1 {
    public static void main (String[] args){
        System.out.println("----------DAFTAR MAKANAN WARUNG SUMBER REJEKI----------");
        System.out.println("1. Ayam Bakar   =  Rp 19.000 ");
        System.out.println("2. Ayam Goreng  =  Rp 15.000 ");
        System.out.println("3. Lele Penyet  =  Rp 13.000 ");
        System.out.println("4. Gurame Bakar =  Rp 30.000 ");
        System.out.println("5. Nila Goreng  =  Rp 25.000 ");
        System.out.println("6. Cah Kangkung =  Rp 7.000 ");
        System.out.println("7. Soto Ayam    =  Rp 14.000 ");
        System.out.println("8. Rawon daging =  Rp 17.000 ");
        
        int ayamBakar = 19000;
        int ayamGoreng = 15000;
        int lelePenyet = 13000;
        int gurameBakar = 30000;
        int nilaGoreng = 25000;
        int cahKangkung = 7000;
        int sotoAyam = 14000;
        int rawonDaging = 17000;
        
        System.out.println("----------DAFTAR DAN JUMLAH PESANAN MAKANAN----------");
        
        Scanner pesan = new Scanner(System.in);
        
        System.out.print("1. Ayam Bakar   = ");
        int a = pesan.nextInt();
        
        System.out.print("2. Ayam Goreng  = ");
        int b = pesan.nextInt();
        
        System.out.print("3. Lele Penyet  = ");
        int c = pesan.nextInt();
        
        System.out.print("4. Gurame Bakar = ");
        int d = pesan.nextInt();
        
        System.out.print("5. Nila Goreng  = ");
        int e = pesan.nextInt();
        
        System.out.print("6. Cah Kangkung = ");
        int f = pesan.nextInt();
        
        System.out.print("7. Soto Ayam    = ");
        int g = pesan.nextInt();
        
        System.out.print("8. Rawon Daging = ");
        int h = pesan.nextInt();
        
        int totalHargaMakanan = ayamBakar*a + ayamGoreng*b + lelePenyet*c + gurameBakar*d + nilaGoreng*e + cahKangkung*f + sotoAyam*g + rawonDaging*h;
        System.out.println("=====================================================");
        System.out.println("Total Harga : "+totalHargaMakanan);
        System.out.print("Uang yang dibayarkan : Rp ");
        int bayar = pesan.nextInt();
        
        if(totalHargaMakanan == bayar){
            System.out.println("Uang anda Pas.");
        }else if(totalHargaMakanan < bayar){
            int i = bayar - totalHargaMakanan;
            System.out.println("Uang Kembalian Anda : Rp "+i);
            
        }else if(totalHargaMakanan > bayar){
            int j = totalHargaMakanan - bayar;
            System.out.println("Uang Anda Kurang : Rp "+j);
        }
     
        System.out.println("----------------------Semoga Memuaskan-----------------------------");       
        System.out.println("----------TERIMAKASIH TELAH BERKUNJUNG DI WARUNG KAMI----------");
       
    }
    
}
