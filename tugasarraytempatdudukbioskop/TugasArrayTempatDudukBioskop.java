package com.mycompany.tugasarraytempatdudukbioskop;
import java.util.*;
/**
 *
 * @author IllaFitria
 */
public class TugasArrayTempatDudukBioskop {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----SELAMAT DATANG DI PROGRAM PEMESANAN TIKET TEMPAT DUDUK BIOSKOP-----");
        System.out.print("Masukkan Jumlah Tiket yang Dipesan: ");
        int orang = input.nextInt();input.nextLine();
        if(orang<=0||orang>25){
            return;
            
        }
        System.out.println("Masukkan Posisi Tempat Duduk Sesuai Tiket:");
        String pesan = input.nextLine();
        String kursi [];
        kursi = pesan.split(" ");
        
        String ox [][] = new String [5][5];
        System.out.println("--------SILAHKAN MENEMPATI POSISI DUDUK SESUAI DENAH BERIKUT--------");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                ox[i][j]= "o";
            }
        }
        for(int i = 0; i < orang; i++){
            char baris = kursi [i].charAt(0);
            String kolom = kursi [i].substring(1,2);
            int Kolom = Integer.valueOf(kolom);
            switch (baris) {
                case 'A':
                    ox [0][Kolom-1]="x";
                    break;
                case 'B':
                    ox [1][Kolom-1]="x";
                    break;
                case 'C':
                    ox [2][Kolom-1]="x";
                    break;
                case 'D':
                    ox [3][Kolom-1]="x";
                    break;
                case 'E':
                    ox [4][Kolom-1]="x";
                    break;
            
                
            }
        }

        System.out.printf("  1 2 3 4 5\nA %s %s %s %s %s\nB %s %s %s %s %s\nC %s %s %s %s %s\nD %s %s %s %s %s\nE %s %s %s %s %s\n  L-A-Y-A-R", ox[0][0], ox[0][1], ox[0][2], ox[0][3], ox[0][4], ox[1][0], ox[1][1], ox[1][2], ox[1][3], ox[1][4], ox[2][0], ox[2][1], ox[2][2], ox[2][3], ox[2][4], ox[3][0], ox[3][1], ox[3][2], ox[3][3], ox[3][4], ox[4][0], ox[4][1], ox[4][2], ox[4][3], ox[4][4]);
         
        
        System.out.println("\nKeterangan");
         System.out.println("(o) : Kursi yang masih tersedia/ kosong");
         System.out.println("(x) : Kursi yang sudah ditempati/ telah dipesan");
     }
}
    
