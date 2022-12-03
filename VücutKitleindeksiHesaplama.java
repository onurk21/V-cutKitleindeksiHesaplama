import java.util.Scanner;
public class VücutKitleindeksiHesaplama {

    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy =inp1.nextDouble();
        
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo =inp1.nextInt();

        double indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+ indeks);


        








}

    private static String extracted(double indeks) {
        return "Vücut Kitle İndeksiniz :"+ indeks;
    }
}