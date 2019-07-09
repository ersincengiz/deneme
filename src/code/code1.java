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
public class code1 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        String kelime = oku.nextLine();
        String[] dizi=kelime.split(" ");
        String [] harflerim={"A","B","C","D","E","F","I","J","K","L","M","O","P","S","T","U","Y","Z"};
        String [] SIFRE={"78945613","78412","7894123","7845612","78945123","7894561","852","94623","794513","74123","7945613","8462","7894561","789456123","78952","7946123","7952","7895123"};
        int sayac=0;
        for (int i = 0; i < SIFRE.length; i++) {
            for (int j = 0; j < SIFRE.length; j++) {
              try{
              if (dizi[i].equals(SIFRE[j])) {
                System.out.print(harflerim[j]);
              }
                
            }
              catch(Exception e){
              
              }
            }
            
        }
    
    }
}
