import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variabel
        String nama, nim, kelas;
        float ipk;
        /*nama = "Ariq Naufal Fadhlurrahman";
        nim = "6706213016";
        kelas = "D3RPLA 45-05";
        float ipk = 4;*/
        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("NIM: ");
        nim = input.nextLine();

        System.out.print("Kelas: ");
        kelas = input.nextLine();

        System.out.print("IPK: ");
        ipk = input.nextFloat();


        System.out.println("Nama: "+ nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}