import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        double tutar, kdvOran , kdvTutar, KdvliTutar;
        Scanner kb = new Scanner(System.in);
        System.out.print("Ücretİ Giriniz : ");
        tutar = kb.nextDouble();

            kdvOran = 0.18;
            kdvTutar = tutar * kdvOran;
            KdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar : " + tutar);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("Toplam Tutar : " + KdvliTutar);




    }
}
