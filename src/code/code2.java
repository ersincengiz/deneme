/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class code2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String Kelime = oku.nextLine();
        String []k1= Kelime.split(" ");
        int boy=k1[1].length();
        String []k2= new String[boy];
        
        String [][]k3= new String[k1[1].length()][k1[1].length()];
       try {
        for (int i = 0; i < k1[1].length(); i++) {
            k2[i]=""+k1[1].charAt(i);
        }
        int sayac=0;
        for (int i = 0; i < k1[1].length(); i++) {
            for (int j = 0; j < k1[1].length(); j++) {
                k3[i][j]=k2[sayac];
                sayac++;
                
            }
        }
         for (int i = 0; i < k1[1].length(); i++) {
            for (int j = 0; j < k1[1].length(); j++) {
                System.out.println("-"+k3[i][j]);
                
            }
        }
    }
    catch(Exception e){}
    }
    
}
