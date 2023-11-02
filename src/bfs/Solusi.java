package bfs;

import Test.Node;

import java.util.ArrayList;
import java.util.List;

//Deklarasi sebuah kelas dengan nama 'Solusi'
public class Solusi {
    //Deklarasi variable instance 'nodes' yang merupakan sebuah List dari objek 'Node'
    private List<Node> nodes;
    //Deklarasi variable instance 'node'
    private Node node;

    //Konstruktor kelas 'Solusi' yang akan dipanggil ketika objek 'Solusi' baru dibuat
    public Solusi() {
        //Sebuah objek ArrayList yang kosong dibuyat dan di assign ke variable 'nodes'
        nodes = new ArrayList<>();
    }
    //Method yang digunakan untuk mengatur node terkini dalam objek 'Solusi'
    public void setNode(Node node) {
        //Metode yang mengatur variable 'node' objek 'Solusi' dengan node yang diberikan sebagai argumen
        this.node = node;
    }

    //Metode yang digunakan untuk mendapatkan node terkini dari objek 'Solusi'
    public Node getNode() {
        //Mengembalikan node terkini yang disimpan dalam variable 'node'
        return node;
    }

    //Metode yang digunakan untuk mengatur daftar node(path) dalam objek 'Solusi'
    public void setNodes(List<Node> nodes) {
        //Metode ini membuat salinan yang baru dari daftar node yang diberikan sebagai argumen, dan mengaturnya dalam variable 'nodes' objek 'solusi'
        this.nodes = new ArrayList<>(nodes);
    }
    //Metode yang digunakan untuk mendapatkan daftar node yang membentuk path solusi dalam objek 'Solusi'
    public List<Node> getNodes() {
        //Metode ini mengembalikan daftar node yang tersimpan dalam variable 'nodes'
        return nodes;
    }
}
