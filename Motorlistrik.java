public class Motorlistrik extends Kendaraan {
    public Motorlistrik(String plat, String pemilik, String merk) {
        super(plat, pemilik, merk);
    }

    @Override
    public boolean bolehmelintas(int tanggal) {
        return true;
    }

    @Override
    public void tampilinfo() {
        System.out.println("Motor Listrik dengan Pemilik \t: "+pemilik+" \nMerk\t\t\t\t\t\t\t: "+merk+"\nPlat\t\t\t\t\t\t\t: "+plat);
    }
}
