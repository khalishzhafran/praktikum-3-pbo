public class App {
    public static void main(String[] args) {
        int tmp;
        boolean status;

        Nasabah khalish = new Nasabah("Muhammad Khalish", "Zhafran");
        System.out.println("Nasabah atas nama : " + khalish.getNamaAwal() + " " + khalish.getNamaAkhir());

        khalish.setTabungan(new Tabungan(5000));
        tmp = khalish.getTabungan().getSaldo();

        System.out.println("Saldo awal : " + tmp);

        khalish.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");

        status = khalish.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }

        khalish.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");

        status = khalish.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }

        status = khalish.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }

        khalish.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");

        tmp = khalish.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);

        Nasabah aqil = new Nasabah("Muhammad Aqil", "Hisyam");
        aqil.setTabungan(new Tabungan(10000));
        System.out.println(aqil.toString());

        System.out.println(khalish.toString());

        aqil.getTabungan().transfer(khalish.getTabungan(), 5000);
        System.out.println(aqil.toString());

        System.out.println(khalish.toString());
    }
}