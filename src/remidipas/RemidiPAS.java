
package remidipas;
import java.util.Scanner;

public class RemidiPAS {
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        System.out.print("-> Ayam Bakar = ");
        int a = pesan.nextInt();
        
        System.out.print("-> Ayam Goreng = ");
        int b = pesan.nextInt();
        
        System.out.print("-> Lele Penyet = ");
        int c = pesan.nextInt();
        
        System.out.print("-> Gurame Bakar = ");
        int d = pesan.nextInt();
        
        System.out.print("-> Nila Goreng = ");
        int e = pesan.nextInt();
        
        System.out.print("-> Cah Kangkung = ");
        int f = pesan.nextInt();
        
        System.out.print("-> Soto Ayam = ");
        int g = pesan.nextInt();
        
        System.out.print("-> Rawon Daging = ");
        int h = pesan.nextInt();
        
        boolean sambal;
        int totalHargaSambal = 0;
        
        Scanner smbl = new Scanner(System.in);
        
        System.out.println("***Apakah Anda ingin Extra Sambal (true/false) ");
        System.out.print(" Jawaban Anda : ");
        sambal = smbl.nextBoolean();
        
        if(sambal == true ){
            System.out.println("----------DAFTAR SAMBAL YANG TERSEDIA----------");
            System.out.println("Sambal Bawang      = Rp 3.000 ");
            System.out.println("Sambal Terasi      = Rp 3.000 ");
            System.out.println("Sambal Mangga Muda = Rp 4.000 ");
            System.out.println("Sambal Nanas Muda  = Rp 5.000 ");
            System.out.println("Sambal Belut       = Rp 7.000 ");
            System.out.println("Sambal Jengkol     = Rp 8.000 ");
            
            int sambalBawang = 3000;
            int sambalTerasi = 3000;
            int sambalMangga = 4000;
            int sambalNanas = 5000;
            int sambalBelut = 7000;
            int sambalJengkol = 8000;
            
            System.out.println("----------JUMLAH PESANAN EXTRA SAMBAL----------");
            
            Scanner pesann = new Scanner(System.in);
            
            System.out.print("-> Sambal Bawang = ");
            int i = pesann.nextInt();
            
            System.out.print("-> Sambal Terasi = ");
            int j = pesann.nextInt();
            
            System.out.print("-> Sambal Mangga Muda = ");
            int k = pesann.nextInt();
            
            System.out.print("-> Sambal Nanas Muda = ");
            int l = pesann.nextInt();
            
            System.out.print("-> Sambal Belut = ");
            int m = pesann.nextInt();
            
            System.out.print("-> Sambal Jengkol = ");
            int n = pesann.nextInt();
            
            totalHargaSambal = sambalBawang*i + sambalTerasi*j + sambalMangga*k + sambalNanas*l + sambalBelut*m + sambalJengkol*n ; 
        
         
        }else{
            System.out.println("Siap, Pesanan Anda sudah selesai Tanpa Extra Sambal ");
        }
        
        int totalHargaMakanan = ayamBakar*a + ayamGoreng*b + lelePenyet*c + gurameBakar*d + nilaGoreng*e + cahKangkung*f + sotoAyam*g + rawonDaging*h;
   
        System.out.println("=====================================================");
        int totalHarga = totalHargaMakanan+totalHargaSambal;
        System.out.println("Total Harga : Rp "+totalHarga);
        System.out.print("Uang yang dibayarkan : Rp ");
        int bayar = pesan.nextInt();
        
        if(totalHarga == bayar){
            System.out.println("Uang anda Pas.");
        }else if(totalHarga < bayar){
            int o = bayar - totalHarga;
            System.out.println("Uang Kembalian Anda : Rp "+o);
            
        }else if(totalHarga > bayar){
            int p = totalHarga - bayar;
            System.out.println("Uang Anda Kurang : Rp "+p);
        }
     
        System.out.println("----------------------Semoga Memuaskan-----------------------------");       
        System.out.println("----------TERIMAKASIH TELAH BERKUNJUNG DI WARUNG KAMI----------");
      
  
    }
    
}
