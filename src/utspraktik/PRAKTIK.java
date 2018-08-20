/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspraktik;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class PRAKTIK {
     public static void main(String[] args){
        System.out.println("Toko Nisa");
        Scanner  scanner = new Scanner(System.in);
        
        //Harga barang
        int n = 20000;
        int Pensil = n;
        System.out.println("Harga Pensil = Rp "+n);
        
        int a = 10000;
        int Penghapus = a;
        System.out.println("Harga Penghapus = Rp "+a);
        
        int u = 30000;
        int Buku = u;
        System.out.println("Harga Buku = Rp "+u);
        
        int f = 50000;
        int Tas = f;
        System.out.println("Harga Tas = Rp "+f);
        
        int l = 25000;
        int Bolpoin = l;
        System.out.println("Harga Bolpoin = Rp "+l);
        
        System.out.println("Pensil yang di beli");
        int JumlahPensil = scanner.nextInt();
        System.out.println("Jumlah harga Pensil yang di beli adalah = " + JumlahPensil);
        int JumlahHargaPensil = n*JumlahPensil;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPensil);
        
        System.out.println("Penghapus yang di beli");
        int JumlahPenghapus = scanner.nextInt();
        System.out.println("Jumlah harga Penghapus yang di beli adalah = " + JumlahPenghapus);
        int JumlahHargaPenghapus = a*JumlahPenghapus;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPenghapus);
        
        System.out.println("Buku yang ingin di beli");
        int JumlahBuku = scanner.nextInt();
        System.out.println("Jumlah harga Buku yang di beli adalah = " + JumlahBuku);
        int JumlahHargaBuku = u*JumlahBuku;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBuku);
        
        System.out.println("Tas yang ingin di beli");
        int JumlahTas = scanner.nextInt();
        System.out.println("Jmlah harga Tas yang di beli adalah = " + JumlahTas);
        int JumlahHargaTas = f*JumlahTas;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaTas);
        
        System.out.println("Bolpoin yang di beli");
        int JumlahBolpoin = scanner.nextInt();
        System.out.println("Jmlah harga Bolpoin yang di beli adalah = " + JumlahBolpoin);
        int JumlahHargaBolpoin = l*JumlahBolpoin;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBolpoin); 
        
        int TotalBarang = JumlahHargaPensil + JumlahHargaPenghapus + JumlahHargaBuku +
                             JumlahHargaTas + JumlahHargaBolpoin;
        
        System.out.println("       ");
        System.out.println("====TOTAL HARGA====");
        
        if (TotalBarang >= 500000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 500000 diskon 50%");
               int TotalSetelahDiskon = (TotalBarang / 2);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
        }
        else if (TotalBarang >= 200000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 200000 diskon 20%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *2/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else if (TotalBarang >= 100000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 100000 diskon 10%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *1/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else System.out.println("Total Harga = "+"Rp "+ TotalBarang);
        System.out.println("Kasir : Salsabila Fawnia R.K.");
        System.out.println("Terimakasih");
       

    
}
}

