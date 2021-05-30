import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksiMethod {


    public static void main(String[] args) throws ParseException {

            Mahasiswa mhs2 = new Mahasiswa();
            SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");
            mhs2.npm = "16757890";
            mhs2.nama = "Mitha";
            mhs2.tanggalLahir = formatTanggal.parse("04-07-2001");

            mhs2.tampilkanIdentitasDiri();

            System.out.println("Usia "+mhs2.nama+" adalah "+mhs2.hitungUsia()+" tahun");

            System.out.println(mhs2.hitungKali(7, 9));

            mhs2.SapaNama("Linda");

    }
}
