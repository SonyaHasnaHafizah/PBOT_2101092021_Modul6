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
public class Latihan3 {
    public static void main (String[] args){
        //BufferedReader
        System.out.println("-->Program Cetak Seratus Kali<--");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
        String nama = "";
        int pangkat=100;
        int i = 1;
        int sum=1;
      
      
        try{
            System.out.print("Masukkan Nama : ");
            nama = dataIn.readLine();
            
            System.out.print("\nWhile-Loop\n");
            i=1;
            while(i<=pangkat){
                System.out.print(sum + "."+ nama + " ");
                sum=sum+1;
            i++;
            }
            
            sum=1;
            System.out.print("\n\nDo-While\n");
            i=1;
            do{
                System.out.print(sum + "."+ nama + " ");
                sum=sum+1;
            i++;
            }while(i<=pangkat);
      
            sum=1;
            System.out.print("\n\nFor-Loop\n");
            for(i=1;i<=pangkat;i++){
		System.out.print(sum + "."+ nama + " ");
                sum=sum+1;
            }  
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}
