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

public class NodeUCS {
    //Deklarasi variable instance 'nilai'
    private String nilai;
    //Deklarasi variable instance 'cost'
    private int cost;

    //Deklarasi variable instance 'tetangga', digunakan untuk menyimpan daftar node tetangga dari node ini. Variable ini diinisialisasi sebagai ArrayList kosong
    private List<NodeUCS> tetangga;

    //Konstruktor kelas 'NodeUCS' yang menerima dua argumen objek 'node' dan sebuah nilai cost
    public NodeUCS(Node node, int cost) {
        //nilai dari node 'Node' digunakan untuk menginisialisasi variable 'nilai' dalam objek 'NodeUCS'
        this.nilai = node.getNilai();
        //menginisialisasi variable 'cost' dalam objek 'NodeUCS'
        this.cost = cost;
        //ArrayList kosong yang digunakan untuk menginisialisasi variable 'tetangga'
        tetangga = new ArrayList<>();
    }

    //Metode yang digunakan untuk mendapatkan nilai dari node
    public String getNilai() {
        //mengembalikan nilai node yang tersimpan dalam variabel 'nilai'
        return nilai;
    }

    //Metode yang digunakan untuk mengatur nilai dari node.
    public void setNilai(String nilai) {
        //Metode ini mengatur variabel' nilai' dengan nilai yang diberikan sebagai argumen
        this.nilai = nilai;
    }

    //Metode yang digunakan untuk mengatur biaya (cost) dari node
    public void setCost(int cost) {
        // Metode ini mengatur variabel 'cost' dengan nilai cost yang diberikan sebagai argumen
        this.cost = cost;
    }

    //Metode yang digunakan untuk mendapatkan biaya (cost) dari node
    public int getCost() {
        //Mengembalikan biaya node yang tersimpan dalam variabel 'cost'
        return cost;
    }

    //Metode yang digunakan untuk mengatur daftar tetangga (successor) dari node
    public void setTetangga(List<NodeUCS> tetangga) {
        //Metode ini mengatur variabel 'tetangga' dengan daftar tetangga yang diberikan sebagai argumen
        this.tetangga = tetangga;
    }

    //Metode yang digunakan untuk mendapatkan daftar tetangga (successor) dari node
    public List<NodeUCS> getTetangga() {
        //Metode ini mengembalikan daftar tetangga node yang tersimpan dalam variabel 'tetangga'
        return tetangga;
    }

    //etode yang digunakan untuk menambahkan node sebagai tetangga (successor) dari node ini
    public void addTetangga(NodeUCS node) {
        //Metode ini menambahkan node yang diberikan sebagai argumen ke dalam daftar tetangga node ini
        tetangga.add(node);
    }

    @Override
    //metode override dari metode 'equals' yang ada di kelas Object. Metode ini membandingkan dua objek "NodeUCS" berdasarkan nilai (nilai atribut)
    public boolean equals(Object obj) {
        //memeriksa apakah objek yang dibandingkan adalah instance dari kelas "NodeUCS"
        if (obj instanceof NodeUCS) {
            //Jika objek adalah instance dari "NodeUCS," maka metode ini membandingkan nilai (atribut 'nilai') dari dua objek "NodeUCS" dan mengembalikan 'true' jika nilai tersebut sama
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        //ika objek yang dibandingkan bukan instance dari "NodeUCS" atau nilai-nilai tidak sama, metode ini mengembalikan 'false'
        return false;
    }
}