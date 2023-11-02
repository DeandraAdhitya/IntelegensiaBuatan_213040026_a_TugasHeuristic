/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyBFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */

public class Node {
    //Deklarasi variable instance 'nilai' yang bertipe String, digunakan untuk menyimpan nilai dari node
    private String nilai;
    //Deklarasi variable instance 'tetangga', yang merupakan daftar(list) dari objek
    //digunakan untuk menyimpan daftar node suksesor. yang diinisialisasi sebagai ArrayList kosong
    private List<Node> tetangga;

    //Membuat Konstruktor kelas 'Node' yang menerima satu argumen yaitu "nilai" atau identifikasi node
    public Node(String nilai) {
        //Sebuah ArrayList kosong yang digunakan untuk menginisialisasi variable 'tetangga' yang akan digunakan untuk menyimpan daftar tetangga node ini
        tetangga = new ArrayList<>();
        //Menginisalisasi variable 'nilai' dalam objek 'node'
        this.nilai = nilai;
    }

    //metode yang digunakan untuk mengatur nilai dari node.
    public void setNilai(String nilai) {
        //Metode ini mengatur variabel 'nilai' dengan nilai yang diberikan sebagai argumen
        this.nilai = nilai;
    }

    //metode yang digunakan untuk mendapatkan nilai dari node.
    public String getNilai() {
        //engembalikan nilai node yang tersimpan dalam variabel 'nilai'.
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
            //ika objek adalah instance dari "Node," maka metode ini membandingkan nilai (atribut 'nilai') dari dua objek "Node" dan mengembalikan 'true' jika nilai tersebut sama
            return ((Node) obj).nilai.equals(this.nilai);
        }
        //Jika objek yang dibandingkan bukan instance dari "Node" atau nilai-nilai tidak sama, metode ini mengembalikan 'false'.
        return false;
    }
}