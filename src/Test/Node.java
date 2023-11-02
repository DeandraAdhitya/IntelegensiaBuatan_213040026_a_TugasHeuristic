package Test;

import java.util.ArrayList;
import java.util.List;

//Deklaraso sebuah kelas dengan nama 'Node'
public class Node {
    //Deklarasi variable instance 'nilai'
    private String nilai;
    //Deklarasi variable instance 'tetangga', digunakan untuk menyimpan daftar node suksesor. diinisialisasi sebagai ArrayList kosong
    private List<Node> tetangga;

    //Konstruktor kelas 'Node' yang menerima satu argumen yaitu nilai atau identifikasi node
    public Node(String nilai) {
        //Sebuah ArrayList kosong yang digunakan untuk menginisialisasi variable 'tetangga' yang akan digunakan untuk menyimpan daftar tetangga node ini
        tetangga = new ArrayList<>();
        //Nilai yang diberikan sebagai argumen digunakan untuk menginisalisasi variable 'nilai' dalam objek 'node'
        this.nilai = nilai;
    }

    //metode yang digunakan untuk mengatur nilai dari node.
    public void setNilai(String nilai) {
        //Metode ini mengatur variabel 'nilai' dengan nilai yang diberikan sebagai argumen
        this.nilai = nilai;
    }

    //metode yang digunakan untuk mendapatkan nilai dari node.
    public String getNilai() {
        //mengembalikan nilai node yang tersimpan dalam variabel 'nilai'.
        return nilai;
    }

    //metode yang digunakan untuk mengatur daftar tetangga (successor) dari node.
    public void setTetangga(List<Node> tetangga) {
        //Metode ini mengatur variabel 'tetangga' dengan daftar tetangga yang diberikan sebagai argumen
        this.tetangga = tetangga;
    }

    //metode yang digunakan untuk mendapatkan daftar tetangga (successor) dari node.
    public List<Node> getTetangga() {
        //Metode ini mengembalikan daftar tetangga node yang tersimpan dalam variabel 'tetangga'
        return tetangga;
    }

    //metode yang digunakan untuk menambahkan node sebagai tetangga (successor) dari node ini.
    public void addTetangga(Node node) {
        //Metode ini menambahkan node yang diberikan sebagai argumen ke dalam daftar tetangga node ini.
        tetangga.add(node);
    }

    @Override
    //metode override dari metode 'equals' yang ada di kelas Object. Metode ini membandingkan dua objek "Node" berdasarkan nilai (nilai atribut).
    public boolean equals(Object obj) {
        //memeriksa apakah objek yang dibandingkan adalah instance dari kelas "Node."
        if (obj instanceof Node) {
            //jika objek adalah instance dari "Node," maka metode ini membandingkan nilai (atribut 'nilai') dari dua objek "Node" dan mengembalikan 'true' jika nilai tersebut sama
            return ((Node) obj).nilai.equals(this.nilai);
        }
        //Jika objek yang dibandingkan bukan instance dari "Node" atau nilainilai tidak sama, metode ini mengembalikan 'false'.
        return false;
    }
}
