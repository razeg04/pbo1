import koneksi.Database;
import model.Mahasiswa;

public class Main{
public static void main(String[]args){
System.out.println("Ini program utama");

Database.hubungkan();
Mahasiswa.tampilkanInfo();
}
}