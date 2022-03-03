import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int girilenSayi = girdi.nextInt();
        List<Integer> girilenSayiDizisi=new ArrayList<Integer>();
        int basamak=0;

        int tmpGirilen=girilenSayi;
        while(tmpGirilen>0)
        {
            girilenSayiDizisi.add(tmpGirilen%10);
            tmpGirilen=tmpGirilen/10;
            basamak++;
        }
        
        int narsistKontrol=0;
        for (int i= girilenSayiDizisi.size()-1;i>=0;i--) {
            narsistKontrol+= UstAl(girilenSayiDizisi.get(i), basamak);
        }

        if(narsistKontrol==girilenSayi)
        System.out.println("Girilen sayı narsist sayıdır.");
        else System.out.println("Girilen sayı narsist sayı değildir.");
    }

    private static int UstAl(int x,int y){
        int sonuc=x;
        for(int i=1;i<y;i++)
        {
            sonuc*=x;
        }
        return sonuc;
    }
}
