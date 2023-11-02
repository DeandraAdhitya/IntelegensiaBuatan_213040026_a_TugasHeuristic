/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyBFS;

import GreedyBFS.Node;
import GreedyBFS.LatihanGreedyBFS;
import GreedyBFS.NodeUCS;

/**
 *
 * @author HP
 */

// Main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
        // inisialisasi node-node yang ada
        Node cibeber = new Node("Cibeber");
        Node cibeureum = new Node("Cibeureum");
        Node pojok = new Node("Pojok");
        Node keboncau = new Node("Keboncau");
        Node gangkaum = new Node("Gangkaum");
        Node kolmas = new Node("Kolmas");
        Node tutwuri = new Node("Tutwuri");
        Node permana = new Node("Permana");
        Node sukarasa = new Node("Sukarasa");
        Node cisarua = new Node("Cisarua");
        Node pemkot = new Node("Pemkot");
        Node cihanjuang = new Node("Cihanjuang");
        Node cibabat = new Node("Cibabat");
        Node cimahi = new Node("Cimahi");
        Node padasuka = new Node("Padasuka");
        Node sangkuriang = new Node("Sangkuriang");
        Node cipageran = new Node("Cipageran");
        Node citeureup = new Node("Citeureup");
        Node lembang = new Node("Lembang");
        Node padaasih = new Node("Padaasih");

        // inisialisasi node-node yang ada dengan costnya
       NodeUCS cibabatUCS = new NodeUCS(cibabat, 390);
        NodeUCS citeureupUCS = new NodeUCS(citeureup, 0);
        NodeUCS pojokUCS = new NodeUCS(pojok, 150);
        NodeUCS keboncauUCS = new NodeUCS(keboncau, 244);
        NodeUCS gangkaumUCS = new NodeUCS(gangkaum, 165);
        NodeUCS kolmasUCS = new NodeUCS(kolmas, 175);
        NodeUCS tutwuriUCS = new NodeUCS(tutwuri, 75);
        NodeUCS permanaUCS = new NodeUCS(permana, 150);
        NodeUCS sukarasaUCS = new NodeUCS(sukarasa, 229);
        NodeUCS cisaruaUCS = new NodeUCS(cisarua, 249);
        NodeUCS pemkotUCS = new NodeUCS(pemkot, 245);
        NodeUCS cihanjuangUCS = new NodeUCS(cihanjuang, 235);
        NodeUCS cibeberUCS = new NodeUCS(cibeber, 365);
        NodeUCS cimahiUCS = new NodeUCS(cimahi, 20);
        NodeUCS padasukaUCS = new NodeUCS(padasuka, 195);
        NodeUCS sangkuriangUCS = new NodeUCS(sangkuriang, 255);
        NodeUCS cipageranUCS = new NodeUCS(cipageran, 330);
        NodeUCS cibeureumUCS = new NodeUCS(cibeureum, 90);
        NodeUCS lembangUCS = new NodeUCS(lembang, 193);
        NodeUCS padaasihUCS = new NodeUCS(padaasih, 385);

        // menambahkan tetangga dari masing-masing node
        cibeberUCS.addTetangga(padaasihUCS);
        cibeberUCS.addTetangga(sangkuriangUCS);
        cibeberUCS.addTetangga(cipageranUCS);

        cibeureumUCS.addTetangga(kolmasUCS);
        cibeureumUCS.addTetangga(cimahiUCS);
        cibeureumUCS.addTetangga(tutwuriUCS);
        cibeureumUCS.addTetangga(citeureupUCS);

        pojokUCS.addTetangga(keboncauUCS);
        pojokUCS.addTetangga(padasukaUCS);
        pojokUCS.addTetangga(cimahiUCS);

        keboncauUCS.addTetangga(pemkotUCS);
        keboncauUCS.addTetangga(pojokUCS);

        gangkaumUCS.addTetangga(permanaUCS);

        kolmasUCS.addTetangga(sangkuriangUCS);
        kolmasUCS.addTetangga(cibeureumUCS);

        tutwuriUCS.addTetangga(cibeureumUCS);

        permanaUCS.addTetangga(citeureupUCS);
        permanaUCS.addTetangga(gangkaumUCS);

        sukarasaUCS.addTetangga(cihanjuangUCS);
        sukarasaUCS.addTetangga(lembangUCS);

        cisaruaUCS.addTetangga(cipageranUCS);
        cisaruaUCS.addTetangga(pemkotUCS);

        pemkotUCS.addTetangga(cisaruaUCS);
        pemkotUCS.addTetangga(keboncauUCS);

        cihanjuangUCS.addTetangga(sukarasaUCS);

        cibabatUCS.addTetangga(padaasihUCS);
        cibabatUCS.addTetangga(sangkuriangUCS);

        cimahiUCS.addTetangga(padasukaUCS);
        cimahiUCS.addTetangga(pojokUCS);
        cimahiUCS.addTetangga(cibeureumUCS);

        padasukaUCS.addTetangga(sangkuriangUCS);
        padasukaUCS.addTetangga(pojokUCS);
        padasukaUCS.addTetangga(cimahiUCS);

        sangkuriangUCS.addTetangga(cibeberUCS);
        sangkuriangUCS.addTetangga(cibabatUCS);
        sangkuriangUCS.addTetangga(kolmasUCS);
        sangkuriangUCS.addTetangga(padasukaUCS);

        cipageranUCS.addTetangga(cibeberUCS);
        cipageranUCS.addTetangga(cisaruaUCS);

        citeureupUCS.addTetangga(cibeureumUCS);
        citeureupUCS.addTetangga(lembangUCS);
        citeureupUCS.addTetangga(permanaUCS);

        lembangUCS.addTetangga(sukarasaUCS);
        lembangUCS.addTetangga(citeureupUCS);

        padaasihUCS.addTetangga(cibeberUCS);
        padaasihUCS.addTetangga(cibabatUCS);

        // menampilkan hasil dari algoritma Greedy Best First Search
        System.out.println("Greedy BFS");
        // inisialisasi objek GreedyBestFirstSearch
        LatihanGreedyBFS bfs = new LatihanGreedyBFS();
        // memanggil fungsi search dari objek GreedyBestFirstSearch dari node CibeberUCS ke
        // CibeureumUCS
        bfs.search(cibabatUCS, citeureupUCS);
        System.out.println();
    }
}