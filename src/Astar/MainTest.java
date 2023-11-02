/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Astar;
import Astar.Node;
import Astar.LatihanAstar;
import Astar.NodeUCS;
/**
 *
 * @author HP
 */


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

        // menambahkan tetangga dari masing-masing node dengan costnya
        cibeberUCS.addTetangga(padaasihUCS, 80);
        cibeberUCS.addTetangga(sangkuriangUCS, 140);
        cibeberUCS.addTetangga(cipageranUCS, 120);

        cibeureumUCS.addTetangga(kolmasUCS, 210);
        cibeureumUCS.addTetangga(cimahiUCS, 101);
        cibeureumUCS.addTetangga(tutwuriUCS, 90);
        cibeureumUCS.addTetangga(citeureupUCS, 86);

        pojokUCS.addTetangga(keboncauUCS, 125);
        pojokUCS.addTetangga(padasukaUCS, 145);
        pojokUCS.addTetangga(cimahiUCS, 140);

        keboncauUCS.addTetangga(pemkotUCS, 76);
        keboncauUCS.addTetangga(pojokUCS, 125);

        gangkaumUCS.addTetangga(permanaUCS, 85);

        kolmasUCS.addTetangga(sangkuriangUCS, 99);
        kolmasUCS.addTetangga(cibeureumUCS, 210);

        tutwuriUCS.addTetangga(cibeureumUCS, 80);

        permanaUCS.addTetangga(citeureupUCS, 99);
        permanaUCS.addTetangga(gangkaumUCS, 85);

        sukarasaUCS.addTetangga(cihanjuangUCS, 86);
        sukarasaUCS.addTetangga(lembangUCS, 95);

        cisaruaUCS.addTetangga(cipageranUCS, 110);
        cisaruaUCS.addTetangga(pemkotUCS, 75);

        pemkotUCS.addTetangga(cisaruaUCS, 75);
        pemkotUCS.addTetangga(keboncauUCS, 80);

        cihanjuangUCS.addTetangga(sukarasaUCS, 89);

        cibabatUCS.addTetangga(padaasihUCS, 72);
        cibabatUCS.addTetangga(sangkuriangUCS, 150);

        cimahiUCS.addTetangga(padasukaUCS, 99);
        cimahiUCS.addTetangga(pojokUCS, 135);
        cimahiUCS.addTetangga(cibeureumUCS, 111);

        padasukaUCS.addTetangga(sangkuriangUCS, 81);
        padasukaUCS.addTetangga(pojokUCS, 145);
        padasukaUCS.addTetangga(cimahiUCS, 98);

        sangkuriangUCS.addTetangga(cibeberUCS, 141);
        sangkuriangUCS.addTetangga(cibabatUCS, 150);
        sangkuriangUCS.addTetangga(kolmasUCS, 100);
        sangkuriangUCS.addTetangga(padasukaUCS, 82);

        cipageranUCS.addTetangga(cibeberUCS, 119);
        cipageranUCS.addTetangga(cisaruaUCS, 112);

        citeureupUCS.addTetangga(cibeureumUCS, 86);
        citeureupUCS.addTetangga(lembangUCS, 143);
        citeureupUCS.addTetangga(permanaUCS, 99);

        lembangUCS.addTetangga(sukarasaUCS, 94);
        lembangUCS.addTetangga(citeureupUCS, 144);

        padaasihUCS.addTetangga(cibeberUCS, 76);
        padaasihUCS.addTetangga(cibabatUCS, 72);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        LatihanAstar AStar = new LatihanAstar();
        // memanggil fungsi search dari objek AStar dari node cibeberUCS ke cibeureumUCS
        AStar.search(cibabatUCS, citeureupUCS);
        System.out.println();
    }
}