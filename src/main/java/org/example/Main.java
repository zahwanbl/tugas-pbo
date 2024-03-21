package org.example;
import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Welcome to system library====");
        System.out.println("Silahkan pilih: ");
        System.out.println("1.Login as student");
        System.out.println("2.Login as admin");
        System.out.println("3.Exit");
        System.out.print("Chose option (1-3): ");
        userInput = scanner.nextInt();


        switch (userInput) {
            case 1:
                loginMahasiswa(scanner);
                break;
            case 2:
                loginAdmin(scanner);
                break;
            case 3:
                Exit(scanner);
                break;
        }


    }


    private static void loginMahasiswa(Scanner scanner) {
        System.out.println("loginMahasiswa");
        String loginMahasiswa = scanner.nextLine();
        System.out.println("Masukan NIM anda: ");
        String NIMAnda = scanner.nextLine();
        if (NIMAnda.length() == 15) {
            System.out.println("Successfull login as student");
        } else {
            System.out.println("User not found");
        }
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.println("loginAdmin");
        String loginAdmin = scanner.nextLine();
        System.out.println("Masukan username: ");
        String Username = scanner.nextLine();
        if (Username.equals("admin")) {
            System.out.println("username admin berhasil");
        } else {
            System.out.println("username admin salah");
        }
        System.out.println("Masukan password: ");
        String password = scanner.nextLine();
        if (password.equals("admin123")) {
            System.out.println("Password admin berhasil");
        } else {
            System.out.println("Password admin salah");
        }
    }

    private static void Exit(Scanner scanner) {
        System.out.println("selesai");
    }
}

