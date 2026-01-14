import java.util.Scanner;
import java.util.ArrayList;
public void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Kendaraan> daftar = new ArrayList<>();
    int pilih;
    do {
        System.out.println("\n====Cek Ganjil-Genap Plat====");
        System.out.println("1.Tambah Kendaraan");
        System.out.println("2.Cek izin melintas");
        System.out.println("3.Tampilkan Semua Kendaraan");
        System.out.println("4.Keluar");
        System.out.print("pilih menu : ");
        pilih = input.nextInt();
        input.nextLine();

        switch (pilih){
            case 1:
                System.out.print("Nama Pemilik Kendaraan    : ");
                String nama = input.nextLine();
                System.out.print("Plat Nomor Kendaraan      : ");
                String plat = input.nextLine();
                System.out.print("Merk Kendaraan            : ");
                String merk = input.nextLine();
                System.out.print("Jenis Kendaraan : \n 1.Mobil \n 2.Motor \n 3.Mobil Listrik \n 4.Motor Listrik \n Pilih jenis :");
                int jenis = input.nextInt();


                if (jenis == 1){
                    daftar.add(new Mobil(plat,nama,merk));
                    System.out.println("Mobil ditambahkan");
                } else if (jenis == 2) {
                    daftar.add(new Motor(plat,nama,merk));
                    System.out.println("Motor ditambahkan");
                } else if (jenis == 3) {
                    daftar.add(new Mobillistrik(plat,nama,merk));
                    System.out.println("Mobil listrik ditambahkan(Bebas Melintas)");
                }else {
                    daftar.add(new Motorlistrik(plat,nama,merk));
                    System.out.println("Motor listrik ditambahkan(Bebas Melintas)");
                }
                break;
            case 2:
                System.out.print("Pilih Tanggal(1-31) : ");
                int tanggal = input.nextInt();
                if (tanggal < 1 || tanggal > 31){
                    System.out.println("Tanggal tidak valid");
                    continue;
                }
                System.out.println("\n========Hasil Cek========");
                for (Kendaraan k : daftar){
                    k.tampilinfo();
                    if (k.bolehmelintas(tanggal)){
                        System.out.println("Diizinkan Melintas");
                    }else {
                        System.out.println("Tidak Diizinkan Melintas");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("\n+++Daftar Kendaraan+++");
                if (daftar.isEmpty()){
                    System.out.println("Tidak Ada Kendaraan");
                }else {
                    for (int i = 0;i<daftar.size();i++){
                        System.out.println("\n========Kendaraan ke-"+(i+1)+"========");
                        daftar.get(i).tampilinfo();
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }while (pilih != 4);
    System.out.println("Keluar dari program");
    input.close();
}
