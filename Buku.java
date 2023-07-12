// Nama   : Renvil Imawan
// NIM    : G.111.20.0032
// Matkul : Pemrograman Berorientasi Objek

public class Buku {
  private String idBuku;
  private String namaBuku;

  public Buku(String idBuku, String namaBuku) {
    this.idBuku = idBuku;
    this.namaBuku = namaBuku;
  }

  protected String getIdBuku() {
    return this.idBuku;
  }

  protected String getNamaBuku() {
    return this.namaBuku;
  }
}
