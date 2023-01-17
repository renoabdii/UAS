import java.util.ArrayList;

public class Arraylist {
        public static void main(String[] args) {
            //deklarasi array
            ArrayList<String> Judul = new ArrayList<>();
            //memasukan
            Judul.add(0, "HarryPotter");
            Judul.add(1, "Wakanda Forever");
            Judul.add(2, "Black Adam");
            //mengetahui total
            System.out.println(Judul.size());
            //perusahaan mobil TOYOTA
            mobil veloz = new mobil(4, 1500, "biru", 6);
            //perusahaan mobil HONDA
            mobil civic = new mobil(5, 1510, "kuning", 7);
            //perusahaan membuat 100
            mobil[] ertigahybrid = new mobil[100];

            //mengambil value dari Arraylist ertigahybrid
                for ( int index=0;index < ertigahybrid.length;index++){
                    mobil s = new mobil (7,1700,"kuning",10);
                    ertigahybrid[index]=s;
                System.out.println("Mobil Ertiga Hybrid ke -"+index);
                System.out.println("Roda : "+ertigahybrid[index].JumlahRoda+"Mesin: "+ertigahybrid[index].KapasitasMesin+
                        "Warna: "+ertigahybrid[index].warna+"Kursi: "+ertigahybrid[index].JumlahJok+"\n");

            }
        }
        }

