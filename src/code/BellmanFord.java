
package code;
import java.util.Scanner;

public class BellmanFord
{
    private int mesafedizisi[];
    private int uzunluk;
    public static final int sonsuz = 999;
 
    public BellmanFord(int uzunluk)
    {
        this.uzunluk = uzunluk;
        mesafedizisi = new int[uzunluk + 1];
    }
 
    public void hesapla(int baslangıcdügüm, int degermatris[][])
    {
        for (int node = 1; node <= uzunluk; node++)
        {
            mesafedizisi[node] = sonsuz;
        }
 
        mesafedizisi[baslangıcdügüm] = 0;
        for (int node = 1; node <= uzunluk - 1; node++)
        {
            for (int anadügüm = 1; anadügüm <= uzunluk; anadügüm++)
            {
                for (int hedefdügüm = 1; hedefdügüm <= uzunluk; hedefdügüm++)
                {
                    if (degermatris[anadügüm][hedefdügüm] != sonsuz)
                    {
                        if (mesafedizisi[hedefdügüm] > mesafedizisi[anadügüm] 
                                + degermatris[anadügüm][hedefdügüm])
                            mesafedizisi[hedefdügüm] = mesafedizisi[anadügüm]
                                + degermatris[anadügüm][hedefdügüm];
                    }
                }
            }
        }
 
        for (int anadügüm = 1; anadügüm <= uzunluk; anadügüm++)
        {
            for (int hedefdügüm = 1; hedefdügüm <= uzunluk; hedefdügüm++)
            {
                if (degermatris[anadügüm][hedefdügüm] != sonsuz)
                {
                    if (mesafedizisi[hedefdügüm] > mesafedizisi[anadügüm]
                           + degermatris[anadügüm][hedefdügüm])
                        System.out.println("The Graph contains negative egde cycle");
                }
            }
        }
 
        for (int vertex = 1; vertex <= uzunluk; vertex++)
        {
            System.out.println("baslangıc düğümünken komşulara uzaklıkları  " + baslangıcdügüm + " - "
                      + vertex + " <-> " + mesafedizisi[vertex]);
        }
    }
 
    public static void main(String... arg)
    {
        int uzunluk = 0;
        int baslangıcdügüm;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("matrisin boyunu giriniz.");
        uzunluk = scanner.nextInt();
 
        int degermatris[][] = new int[uzunluk + 1][uzunluk + 1];
        System.out.println("matris değerlerini teker teker giriniz.");
        for (int anadügüm = 1; anadügüm <= uzunluk; anadügüm++)
        {
            for (int hedefdügüm = 1; hedefdügüm <= uzunluk; hedefdügüm++)
            {
                degermatris[anadügüm][hedefdügüm] = scanner.nextInt();
 	        if (anadügüm == hedefdügüm)
                {
                    degermatris[anadügüm][hedefdügüm] = 0;
                    continue;
                }
                if (degermatris[anadügüm][hedefdügüm] == 0)
                {
                    degermatris[anadügüm][hedefdügüm] = sonsuz;
                }
            }
        }
 
        System.out.println("başlangıç düğümünü giriniz.");
        baslangıcdügüm = scanner.nextInt();
 
        BellmanFord bellmanford = new BellmanFord(uzunluk);
        bellmanford.hesapla(baslangıcdügüm, degermatris);
       	
    }
}