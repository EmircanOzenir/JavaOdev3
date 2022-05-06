import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kenarBir,kenarIki, hipotenus, cevreUzunlugu, dikUcgenAlan, a, b, c, u, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarın Uzunluğunu Giriniz: ");
        kenarBir = input.nextDouble();
        System.out.print("2. Kenarın Uzunluğunu Giriniz: ");
        kenarIki = input.nextDouble();

        hipotenus = Math.sqrt((kenarBir*kenarBir)+(kenarIki*kenarIki));
        cevreUzunlugu = (kenarBir+kenarIki+hipotenus);
        dikUcgenAlan = (kenarBir*kenarIki)/2;
        System.out.println("Dik Üçgeninizin Hipotenüs Uzunluğu: " + hipotenus);
        System.out.println("Dik Üçgeninizin Çevre Uzunluğu: " + cevreUzunlugu );
        System.out.println("Dik Üçgeninizin Alanı: " + dikUcgenAlan );

        // Aşağıdaki satırlarda ödevin üç kenar uzunluğunu kullanıcdan aldığımız devam kısmını inceledim.

        System.out.print("Üçgenin Birinci Kenarının Uzunluğunu Giriniz: ");
        a = input.nextDouble();
        System.out.print("Üçgenin İkinci Kenarının Uzunluğunu Giriniz: ");
        b = input.nextDouble();
        System.out.print("Üçgenin Üçüncü Kenarının Uzunluğunu Giriniz: ");
        c = input.nextDouble();
        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgeninizin Çevresinin Uzunluğu: " + 2*u);
        System.out.print("Üçgeninizin Alanı: " + alan);

    }
}
