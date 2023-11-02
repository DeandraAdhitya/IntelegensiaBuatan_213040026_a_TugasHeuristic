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

public class Solusi {
    //Deklarasi variable instance 'nodes' yang merupakan sebuah List dari objek 'Node'
    private List<NodeUCS> nodes;
    //Deklarasi variable instance 'node'
    private NodeUCS node;
    
    //Konstruktor kelas 'Solusi' yang akan dipanggil ketika objek 'Solusi' baru dibuat
    public Solusi() {
        //Sebuah objek ArrayList yang kosong dibuyat dan di assign ke variable 'nodes'
        nodes = new ArrayList<>();
    }
    
    //Method yang digunakan untuk mengatur node terkini dalam objek 'Solusi'
    public void setNode(NodeUCS node) {
        //Metode yang mengatur variable 'node' objek 'Solusi' dengan node yang diberikan sebagai argumen
        this.node = node;
    }
    
    //Metode yang digunakan untuk mendapatkan node terkini dari objek 'Solusi'
    public NodeUCS getNode() {
        //Mengembalikan node terkini yang disimpan dalam variable 'node'
        return node;
    }
    
    //Metode yang digunakan untuk mengatur daftar node(path) dalam objek 'Solusi'
    public void setNodes(List<NodeUCS> nodes) {
        //Metode ini membuat salinan yang baru dari daftar node yang diberikan sebagai argumen, dan mengaturnya dalam variable 'nodes' objek 'solusi'
        this.nodes = new ArrayList<>(nodes);
    }

    //Metode yang digunakan untuk mendapatkan daftar node yang membentuk path solusi dalam objek 'Solusi'
    public List<NodeUCS> getNodes() {
        //Metode ini mengembalikan daftar node yang tersimpan dalam variable 'nodes'
        return nodes;
    }
}