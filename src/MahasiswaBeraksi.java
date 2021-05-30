import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        Date tglHariIni = new Date();

        mhs.npm = "17710033";
        mhs.nama = "Wangi";
        mhs.tanggalLahir = formatTanggal.parse("04-07-2001");

        System.out.println("NPM "+mhs.npm);
        System.out.println("NAMA "+mhs.nama);
        System.out.println("TANGGAL LAHIR "+mhs.tanggalLahir);

        System.out.println("=====================================================");
    }
}
