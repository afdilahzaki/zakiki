import java.util.Scanner;

public class ATM {
    private static double saldo = 0;
    private static String username = "Afdilah Zaki Annas Suswanto";
    private static int pin = 180505;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();


        System.out.print("Masukkan PIN: ");
        int inputPin = scanner.nextInt();

        // Proses autentikasi
        if (authenticate(inputUsername, inputPin)) {
            System.out.println("Login berhasil!");


            boolean isRunning = true;
            while (isRunning) {
                System.out.println("BANK SEIKHlASNYA");
                System.out.println("---------Menu---------");
                System.out.println("  1. Cek Saldo");
                System.out.println("  2. Deposit");
                System.out.println("  3. Tarik Tunai");
                System.out.println("  4. Keluar");
                System.out.println("----------------------");
                System.out.print("Pilih menu : ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        cekSaldo();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        tarikTunai();
                        break;
                    case 4:
                        isRunning = false;
                        System.out.println("Terima kasih Telah Menggunakan");
                        System.out.println("----BANK SEIKHLASNYA-----");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            }
        } else {
            System.out.println("Login gagal. Username atau PIN salah.");
        }


        scanner.close();
    }

    private static boolean authenticate(String inputUsername, int inputPin) {
        return inputUsername.equals(username) && inputPin == pin;
    }

    private static void cekSaldo() {
        System.out.println("Saldo Anda: RP." + saldo);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deposit: ");
        double amount = scanner.nextDouble();
        saldo += amount;
        System.out.println("Deposit berhasil. Saldo Anda sekarang: RP." + saldo);
    }

    private static void tarikTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah tarik tunai: ");
        double amount = scanner.nextDouble();

        if (amount > saldo) {
            System.out.println("Saldo tidak mencukupi. Transaksi dibatalkan.");
        } else {
            saldo -= amount;
            System.out.println("Tarik tunai berhasil. Saldo Anda sekarang: RP." + saldo);
        }
    }
}
