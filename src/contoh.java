public class contoh {
    private String nama;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setUmur(int umur) {
        if (umur < 0) {
            throw new IllegalArgumentException("Masukan dengan benar.");
        }
        this.umur = umur;
    }

    public int getUmur() {
        return this.umur;
    }
}

}
