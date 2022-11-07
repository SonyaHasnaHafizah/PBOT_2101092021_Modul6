/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot_2101092021_modul6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Latihan4 {
    public static void main (String[] args){
        //BufferedReader
        System.out.println("-->Program Perpangkatan<--");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
        int bil =0;
        int pangkat=0;
        int i = 1;
        int hasil=1;
      
        try{
            System.out.print("Masukkan Bilangan : ");
            bil = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Pangkat  : ");
            pangkat = Integer.parseInt(dataIn.readLine());
            
            System.out.print("While-Loop\n");
            i=1;
            while(i<=pangkat){
                System.out.print(bil);
                if(i<pangkat){
                    System.out.print(" X ");
                }
		hasil=hasil*bil;
            i++;
            }
            System.out.println("\nHasil = " +hasil);
            
            hasil=1;
            System.out.print("\nDo-While\n");
            i=1;
            do{
                System.out.print(bil);
                if(i<pangkat){
                    System.out.print(" X ");
                }
		hasil=hasil*bil;
            i++;
            }while(i<=pangkat);
            System.out.println("\nHasil = " +hasil);
            
            hasil=1;
            System.out.print("\nFor-Loop\n");
            for(i=1;i<=pangkat;i++){
		System.out.print(bil);
                if(i<pangkat){
                    System.out.print(" X ");
                }
		hasil=hasil*bil;
            }
            System.out.println("\nHasil = " +hasil);
            
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}
