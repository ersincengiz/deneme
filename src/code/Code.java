
package code;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner oku = new Scanner(System.in);
      String kelıme=oku.nextLine();
  String[] dizi=kelıme.split(" ");
  int boy= dizi[0].length();
  int dikey=boy/Integer.parseInt(dizi[1]);
  int en=dizi[1].length();
  int sayac=-en;
  int [] dizim= new int[boy];
  int [][] anadizi=new int[dikey][en];
  try{      
  for (int i = 0; i < dizi[0].length(); i++) {
            dizim[i]=Integer.parseInt(dizi[0].substring(i,i+1));
            System.out.print(" -"+ dizim[i]);
        }
        for (int i = 0; i < dikey; i++) {
            sayac=sayac+en;
            for (int j = 0; j < en; j++) {
               
                    anadizi[i][j]=dizim[sayac];
                    sayac++;
                
            }
        }
        
        
        for (int i = 0; i < dikey; i++) {
           
            for (int j = 0; j < en; j++) {
               
                  System.out.print(anadizi[i][j]);
                
            }
            System.out.println("");
        }
  }
  catch(Exception e){}
    }
        }
    
    

