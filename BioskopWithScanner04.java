import java.util.Scanner;
public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String penonton[][] = new String [4][2];
        boolean betul = true;

        while (betul) {
            System.out.println("Pilihan menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom invalid. Silakan masukkan lagi.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi pada Baris " + baris + " Kolom " + kolom + " sudah terisi oleh penonton, silahkan isi ulang");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil ditambahkan.");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    betul = false;
                    System.out.println("Exit");
                    break;

                default: 
                    System.out.println("Menu invalid");
            }
        }
    }
}
