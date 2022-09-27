public class Biodata {
    public static void main(String[] args) {
        //Head
        String Biodata = "BIODATA";
        System.out.println(Biodata);

        //Nama Lengkap
        String NamaDepan = "Uyunun";
        String NamaBelakang = "Lusiana";
        String NamaLengkap = NamaDepan + " " + NamaBelakang;
        System.out.println("Nama Lengkap : " + NamaLengkap);

        //Tempat Tanggal Lahir
        String tempat = "Banteng Keselet";
        int tgl = 11;
        int bln = 07;
        int thn = 2000;
        System.out.println("TTL : " + tempat + "/" + tgl + "/" + bln + "/" + thn);

        //Umur
        int tahuna = 2000;
        int tahunb = 2022;
        int umur = 2022 - 2000;
        System.out.println("Umur : " + umur + " Tahun");

        //Jenis Kelamin
        char JenisKelamin = 'P';
        System.out.println("Jenis Kelamin : " + JenisKelamin);

        //Alamat
        String Alamat = "Banteng Keselet";
        System.out.println("Alamat : " + Alamat);

        //Pendidikan
        String SD = "Sekolah Dasar Negri Banteng Keselet";
        String SMP = "SMPN 1 Pringgarata";
        String SMK = "SMK Bangun Bangsa";
        String Kuliah = "STMIK Lombok";
        System.out.println("Riwayat Pendidikan");
        System.out.println("Sekolah Dasar : " + SD);
        System.out.println("Sekolah Menengah Pertama : " + SMP);
        System.out.println("Sekolah Menengah Kejuruan : " + SMK);
        System.out.println("Sekolah Tinggi : " + Kuliah);
    }
}

