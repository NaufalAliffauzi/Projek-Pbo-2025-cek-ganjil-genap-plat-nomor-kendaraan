public class Kendaraan {
    String plat;
    String pemilik;
    String merk;

    public Kendaraan(String plat, String pemilik, String merk) {
        this.plat = plat;
        this.pemilik = pemilik;
        this.merk = merk;
    }

    private int cekdigit(){
        StringBuilder angka = new StringBuilder();
        for (char c : plat.toCharArray()){
            if (Character.isDigit(c)){
                angka.append(c);
            }
        }
        if (angka.length() == 0){
            return -1;
        }
        String angkastr = angka.toString();
        char lastchar = angkastr.charAt(angkastr.length()-1);
        return Character.getNumericValue(lastchar);
    }

    public boolean bolehmelintas(int tanggal){
        int digit = cekdigit();
        if (digit == -1)
            return false;
            return (digit % 2) == (tanggal % 2);
    }
    public void tampilinfo(){
        System.out.println(" Pemilik "+pemilik+" Merk "+merk+" Plat "+plat);
    }
}
