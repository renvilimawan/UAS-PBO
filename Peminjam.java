// Nama   : Renvil Imawan
// NIM    : G.111.20.0032
// Matkul : Pemrograman Berorientasi Objek

public abstract class Peminjam implements UserLogin {
  private boolean isLogin;
  private boolean isAntiDenda;

  @Override
  public void doLogin() {
    this.isLogin = true;
  }

  @Override
  public void doLogout() {
    this.isLogin = false;
  }

  @Override
  public boolean isLogin() {
    return this.isLogin;
  }

  public void addAntiDenda() {
    this.isAntiDenda = false;
  }

  public void removeAntiDenda() {
    this.isAntiDenda = true;
  }

  public boolean getAntiDenda(){
    return this.isAntiDenda;
  }
  
  public abstract void setKodePeminjam(String kodePeminjam);
  public abstract String getKodePeminjam();
  public abstract void setNamaPeminjam(String namaPeminjam);
  public abstract String getNamaPeminjam();
}
