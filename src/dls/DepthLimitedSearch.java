package dls;

import Test.Node;

//Deklarasi sebuah kelas dengan nama DepthLimitedSearch
public class DepthLimitedSearch {
    //Deklarasi variable instance 'limit'
    private int limit;

    //Method yang digunakan untuk mengatur nilai batasan kedalaman 'limit'
    public void setLimit(int limit) {
        //Metode yang mengatur variable 'limit' dengan nilai yang diberikan sebagai argumen
        this.limit = limit;
    }

    // Metode yang digunakan untuk mendapatkan nilai batasan kedalaman 'limit'
    public int getLimit() {
        //Metode yang mengembalikan nilai variable 'limit'
        return limit;
    }

    //Method yang digunakan untuk melakukan pencarian DLS dari node 'start' ke node 'goal'
    public void search(Node start, Node goal) {
        //Mencetak pesan yang menunjukan bahwa pencarian sedang dilakukan dari node 'start' ke node 'goal
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai());
        //Menginisialisasi node 'eval' dengan node awal 'start'
        Node eval = start;
        //Inisialisasi pengulangan for yang akan berjalan sebanyak 'limit' kali
        for (int i = 0; i < limit; i++) {
            //Mencetak pesan yang menunjukan tingkat(level) evaluasi saat ini dan nilai node yang dievaluasi
            System.out.println("Level "+i+" evaluasi: "+eval.getNilai());
            //Memeriksa apakah node yang dievaluasi saat ini sama dengan node tujuan 'goal'
            if (eval.equals(goal)) {
                //Jika node evaluasi adalah node tujuan, mencetak pesan bahwa solusi ditemukan
                System.out.println("Solusi ditemukan ");
                //Mengakhiri pengulangan karena solusi sudah ditemukan
                break;
            }
            //Memeriksa pakah node evaluasi memiliki tetangga(suksesor)
            if (!eval.getTetangga().isEmpty()) {
                //Jika memiliki tetangga, maka node evaluasi diubah menjadi tetangga pertama (kedalaman tingkatnya)
                eval = eval.getTetangga().get(0);
            //Jika node evaluasi tidak memiliki tetangga(suksesor)
            } else {
                //Mengakhiri pengulangan karena tidak ada tetangga yang dapat dievaluasi pada kedalaman saat ini
                break;
            }
        }
    }
}
