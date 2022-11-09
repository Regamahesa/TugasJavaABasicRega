import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TugasJavaBasic {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Menu = 0;
        int Menu1 = 0;
        int Menu2 = 0;
        int Menu3 = 0;
        int panjang = 0;
        int meter;
        int gram;
        String nama;
        String password;
        int pin = 123456789;
        int p;
        int l;
        int s;
        int t;
        int r;
        int a;
        int π = 22 / 7;
        int Celcius;
        int Reamur;
        int Fahrenheit;
        String lorem;
        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("Password : ");
        password = input.next();

        System.out.print("Pin : ");
        pin = input.nextInt();

        if (nama.equals("Administrator") && password.length() >= 5 && pin == 123456789) {
            System.out.println("Akses Diterima, Selamat Datang!!!");

            do {
                System.out.println(
                        "Pilih Menu dibawah ini : \n 1.Bangun Ruang/Datar \n 2.Konversi  \n 3.Secret Menu \n 4.Exit");
                // Input data
                System.out.print("Masukkan nomor : ");
                Menu = input.nextInt();
                switch (Menu) {
                    case 1:
                        do {
                            System.out.println("<==Bangun Ruang Datar==>");
                            System.out.println(
                                    "Silahkan Pilih Rumus : \n 1.Luas(Meter Kuadrat) \n 2.Volume(Liter) \n 3.Exit");
                            // Input Data
                            System.out.print("Massukkan Nomor: ");
                            Menu1 = input.nextInt();

                            switch (Menu1) {
                                case 1:
                                    do {
                                        System.out.println("<==Luas (Meter Kuadrat)");
                                        System.out.println(
                                                "Silahkan pilih Bangun Datar : \n 1.Persegi Panjang \n 2.Persegi \n 3.Segitiga \n 4.Lingkaran \n 5.Exit");
                                        // Input Data
                                        System.out.print("Masukkan Nomor: ");
                                        Menu2 = input.nextInt();

                                        switch (Menu2) {
                                            case 1:
                                                System.out.println("==Persegi Panjang==");
                                                System.out.println("Rumus Persegi Panjang => luas = panjang * lebar ");
                                                System.out.println("Diketahui Persegi panjang memiliki");
                                                System.out.print("Panjang: ");
                                                p = input.nextInt();
                                                System.out.print("Lebar: ");
                                                l = input.nextInt();
                                                System.out.println("Hasil Dari Luas Persegi Adalah : " + (p * l)
                                                        + " Meter Kuadrat");
                                                break;
                                            case 2:
                                                System.out.println("==Persegi==");
                                                System.out.println("Rumus Persegi => luas = sisi * sisi.");
                                                System.out.print("Diketahui Sisi Persegi Adalah: ");
                                                s = input.nextInt();
                                                System.out.println(
                                                        "Hasil Dari Luas Persegi Adalah : " + (s * s)
                                                                + " Meter Kuadrat");
                                                break;
                                            case 3:
                                                System.out.println("==Segitiga==");
                                                System.out.println("Rumus Segitiga =>  L = 1/2 * a * t");
                                                System.out.println("Diketahui Segitiga Memimiliki");
                                                System.out.print("Alas =");
                                                a = input.nextInt();
                                                System.out.print("Tinggi = ");
                                                t = input.nextInt();
                                                System.out.println(
                                                        "Hasil dari luas segitiga adalah: " + (1 * a * t / 2)
                                                                + " Meter Kuadrat");
                                                break;
                                            case 4:
                                                System.out.println("==Lingkaran==");
                                                System.out.println("Rumus Lingkaran => phi*r*r");
                                                System.out.print("r = ");
                                                r = input.nextInt();
                                                System.out.println("Hasil Rumus Yang Anda Input : " + (22 * r * r / 7)
                                                        + " Meter Kuadrat");
                                                break;
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (Menu2 < 5);
                                    break;

                                case 2:
                                    do {
                                        System.out.println("<==Volume (Liter)==>");
                                        System.out.println(
                                                "Silahkan Pilih Bangun Ruang : \n 1.Balok \n 2.Kubus \n 3.Bola \n 4.Exit");
                                        // Input Data
                                        System.out.print("Masukkan Nomor: ");
                                        Menu2 = input.nextInt();
                                        switch (Menu2) {
                                            case 1:
                                                System.out.println("<==Balok==>");
                                                System.out.println("Rumus Balok = V balok = p * l * t");
                                                System.out.print("Masukan Panjang Balok dengan satuan Meter: ");
                                                p = input.nextInt();
                                                System.out.print("Masukan Lebar Balok dengan satuan Meter: ");
                                                l = input.nextInt();
                                                System.out.print("Masukan Tinggi Balok dengan satuan Meter: ");
                                                t = input.nextInt();
                                                System.out.println("Jadi Hasil Volume Balok adalah "
                                                        + (p * l * t * 1000) + " Liter");
                                                break;
                                            case 2:
                                                System.out.println("<==Kubus==>");
                                                System.out.println("Rumus Kubus = V = s * s * s atau V = s3");
                                                System.out.println("Masukkan Sisi Kubus dengan satuan Meter: ");
                                                s = input.nextInt();
                                                System.out.println("Jadi hasil volume Kubus adalah: "
                                                        + (s * s * s * 1000) + "Liter");
                                                break;
                                            case 3:
                                                System.out.println("<==Bola==>");
                                                System.out.println("Rumus Bola = V=4/3*phi*r3");
                                                System.out.println("Masukkan jari-jari bola dengan satuan Meter: ");
                                                r = input.nextInt();
                                                System.out.println("Jadi hasil dari Volume Bola adalah: "
                                                        + (4 * 22 * r * r * r / 3 / 7) + "Liter");
                                                break;
                                            default:
                                            System.out.println("Exit");
                                                break;
                                        }
                                    } while (Menu2 < 3);

                                default:
                                System.out.println("Exit");
                                    break;
                            }
                        } while (Menu1 < 3);
                        break;

                    case 2:
                        do {
                            System.out.println("<==Konversi==>");
                            System.out.println("\n 1.Derajat \n 2.Panjang(Meter) \n 3.Berat(gram) \n 4.Exit");
                            System.out.print("Masukkan nomor: ");
                            Menu1 = input.nextInt();

                            switch (Menu1) {
                                case 1:
                                    do {
                                        System.out.println("==Derajat==");
                                        System.out.println("1.Celcius \n 2.Reamur \n 3.Fahrenheit \n 4.Exit");
                                        System.out.println("Silahkan pilih Suhu : ");
                                        Menu2 = input.nextInt();

                                        switch (Menu2) {
                                            case 1:
                                                do {
                                                    System.out.println("==Celcius==");
                                                    System.out.println(
                                                            "1.Celsius ke Reamur \n 2.Celsius ke Fahrenheit \n 3.Exit");
                                                    System.out.println("SIlahkan pilih: ");
                                                    Menu3 = input.nextInt();

                                                    switch (Menu3) {
                                                        case 1:
                                                            System.out.println("Celsius => Reamur");
                                                            System.out.println(
                                                                    "Masukkan Suhu celcius yang akan dikonverensi: ");
                                                            Celcius = input.nextInt();
                                                            System.out.println("Hsil Suhu yang dikonverensi: "
                                                                    + (4 * Celcius / 5));
                                                            break;

                                                        case 2:
                                                            System.out.println("Celcius => Fahrenheit");
                                                            System.out.println(
                                                                    "Masukkan Suhu celcius yang akan dikonverensi: ");
                                                            Celcius = input.nextInt();
                                                            System.out.println("Hasil suhu yang dokonverensi: "
                                                                    + ((9 * Celcius / 5)) + 32);
                                                            break;

                                                        default:
                                                            System.out.println("Exit");
                                                            break;
                                                    }

                                                } while (Menu3 < 2);

                                            case 2:
                                                do {
                                                    System.out.println("==Reamur==");
                                                    System.out.println(
                                                            "1.Reamur ke Celcius \n 2.Reamur ke Fahrenheit \n 3.Exit");
                                                    System.out.println("Silahkan pilih: ");
                                                    Menu = input.nextInt();

                                                    switch (Menu3) {
                                                        case 1:
                                                            System.out.println("Reamur => Celcius");
                                                            System.out.println(
                                                                    "Masukkan suhu Reamur yang akan dikonverensi: ");
                                                            Reamur = input.nextInt();
                                                            System.out.println(
                                                                    "Hasil suhu yang dikonverensi " + (5 * Reamur / 4));
                                                            break;

                                                        case 2:
                                                            System.out.println("Reamur => Fahrenheit");
                                                            System.out.println(
                                                                    "Masukkan suhu Reamur yang akan dikonverensi: ");
                                                            Reamur = input.nextInt();
                                                            System.out.println("Hasil suhu yang dikonverensi "
                                                                    + (9 * Reamur / 4) + 32);
                                                            break;

                                                        default:
                                                            System.out.println("Exit");
                                                            break;
                                                    }

                                                } while (Menu3 < 3);

                                            case 3:
                                                do {
                                                    System.out.println("==Fahrenheit==");
                                                    System.out.println(
                                                            "1.Fahrenheit ke celcius \n 2.Fahrenheit ke Reamur \n 3.Exit");
                                                    System.out.println("Silahkan pilih: ");
                                                    Menu3 = input.nextInt();

                                                    switch (Menu3) {
                                                        case 1:
                                                            System.out.println("Fahrenheit => Celcius");
                                                            System.out.println(
                                                                    "Masukkan suhu Fahrenheit yang akan dikonverensi: ");
                                                            Fahrenheit = input.nextInt();
                                                            System.out.println("Hasil suhu yang dikonverensi: "
                                                                    + (5 * (Fahrenheit - 32) / 9));
                                                            break;

                                                        case 2:
                                                            System.out.println("Fahrenheit => Reamur");
                                                            System.out.println(
                                                                    "Masukkan suhu Fahrenheit yang akan dikonverensi: ");
                                                            Fahrenheit = input.nextInt();
                                                            System.out.println("Hasil suhu yang dikonverensi: "
                                                                    + (4 * (Fahrenheit - 32) / 9));
                                                            break;

                                                        default:
                                                            System.out.println("Exit");
                                                            break;
                                                    }

                                                } while (Menu3 < 2);

                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (Menu2 < 3);
                                    break;

                                    case 2:
                                    // Menu Tangga Ukuran Panjang
                                    do {
                                        System.out.println("Mengonversi Satuan Meter Ke yg di bawah ;");
                                        System.out.println(" 1.Km \n 2.hm \n 3.dam \n 4.dm \n 5.cm \n 6.mm \n 7.Exit");
                                        System.out.print("Pilih Untuk Mengonversi Meter :");
                                        panjang = input.nextInt();
                                        // Switch Untuk Membungkus Semua Menu Tangga Ukuran Panjang
                                        switch (panjang) {
                                            case 1:
                                                System.out.println("Konversi Meter => Kilometer ");
                                                meter = input.nextInt();
                                                System.out.println("Hasil " + (meter / 1000) + "Km");
                                                    break;
                                            case 2:
                                                System.out.println("Konversi Meter => HektaMeter ");
                                                meter = input.nextInt();
                                                System.out.println("Hasil " + (meter / 100) + "Hm");
                                                break;
                                            case 3:
                                                System.out.println("Konversi Meter => Dam ");
                                                meter = input.nextInt();
                                                System.out.println("Hasil " + (meter / 10) + "Dam");
                                                break;
                                            case 4:
                                                System.out.println("Konversi Meter => DesiMeter ");
                                                meter = input.nextInt();
                                                System.out.println("Hasil " + (meter * 10) + "Dm");
                                                break;
                                            case 5:
                                                System.out.println("Konversi Meter => CentiMeter ");
                                                meter = input.nextInt();
                                                System.out.println("Hasil " + (meter * 100) + "Cm");
                                                break;
                                            case 6:
                                                System.out.println("Konversi Meter => MiliMeter ");
                                                meter = input.nextInt();
                                                System.out.println("Hasil " + (meter * 1000) + "Mm");
                                                break;
                                        }
                                    } while (panjang < 7);
                                    break;
                                    // Tangga Ukuran Berat (Gram)
                                  case 3:
                                  do {
                                    System.out.println("Mengonversi Satuan Gram Ke yg di bawah ;");
                                    System.out.println(" 1.Kg \n 2.Hg \n 3.Dag \n 4.Dg \n 5.Cg \n 6.Mg \n 7.Exit");
                                    System.out.print("Pilih Untuk Mengonversi Meter :");
                                    panjang = input.nextInt();
                                    // Switch Untuk Membungkus Semua Menu Tangga Ukuran Panjang
                                    switch (panjang) {
                                        case 1:
                                            System.out.println("Konversi Gram => Kilogram ");
                                            gram = input.nextInt();
                                            System.out.println("Hasil " + (gram / 1000) + "Kg");
                                                break;
                                        case 2:
                                            System.out.println("Konversi Gram => Hektagram ");
                                            gram = input.nextInt();
                                            System.out.println("Hasil " + (gram / 100) + "Hg");
                                            break;
                                        case 3:
                                            System.out.println("Konversi Gram => Dekagram ");
                                            gram = input.nextInt();
                                            System.out.println("Hasil " + (gram / 10) + "Dag");
                                            break;
                                        case 4:
                                            System.out.println("Konversi Gram => Desigram ");
                                            gram = input.nextInt();
                                            System.out.println("Hasil " + (gram * 10) + "Dg");
                                            break;
                                        case 5:
                                            System.out.println("Konversi Gram => Centigram ");
                                            gram = input.nextInt();
                                            System.out.println("Hasil " + (gram * 100) + "Cg");
                                            break;
                                        case 6:
                                            System.out.println("Konversi Gram => Miligram ");
                                            gram = input.nextInt();
                                            System.out.println("Hasil " + (gram * 1000) + "Mg");
                                            break;
                                    }
                                } while (panjang < 7);
                                break;

                            }
                              

                        } while (Menu1 < 4);
                        break;
                        

                    case 3:
                    System.out.println("Secret Menu: ");
                    System.out.println("Untuk mengakses secret menu harus mengiput nilai unik: ");
                    Menu = input.nextInt();
                    if (password.length() > 7 &&  password.length() < 10) {
                        do {
                                int A;
                                System.out.println("Silahkan pilih menu rahasia:");
                                System.out.println("1.Uppercase \n 2.Lowercase \n 3.Reverse \n 4.Exit");
                                System.out.print("Masukkan nomor: ");
                                A = input.nextInt();

                                switch (A) {
                                    case 1:
                                        input.nextLine();
                                        lorem = input.nextLine().toUpperCase();
                                        System.out.println(lorem);
                                        break;

                                    case 2:
                                        input.nextLine();
                                        lorem = input.nextLine().toLowerCase();
                                        System.out.println(lorem);
                                        break;

                                    case 3:
                                    input.nextLine();
                                    lorem=input.nextLine();
                                    List<String> list = Arrays.asList(lorem.split(" "));
                                    Collections.reverse(list);
                                    System.out.println(
                                    String.join(" ", list)
                                    );
                                    break;

                                    default:
                                        System.out.println("Exit");
                                        break;
                                }
                                
                            } while (Menu < 3);
                        } else {
                            System.out.println("Aksess ditolak");
                        }
                            
                        }
                        
            } while (Menu < 4);
            System.out.println("Exit");
            input.close();
        } else {
            System.out.println("Akses Ditolak");
        }
    }
}
