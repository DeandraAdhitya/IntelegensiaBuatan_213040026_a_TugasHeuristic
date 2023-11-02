package Test;

import bfs.BreadthFirstSearch;
import dls.DepthLimitedSearch;
import ucs.NodeUCS;
import ucs.UniformCostSearch;

//Deklarasi sebuah kelas dengan nama MainTest
public class MainTest {
    //Main Method
    public static void main(String[] args) {
        //Membuat objek-objek node yang mewakili kota-kota dalam peta. setiap kota memiliki nama dan beberapa diantaranya memiliki tetangga (kota yang terhubung)
        Node bandung = new Node("Bandung");
        Node sumedang = new Node("Sumedang");
        Node cirebon = new Node("Cirebon");
        Node tegal = new Node("Tegal");
        Node pemalang = new Node("Pemalang");
        Node pekalongan = new Node("Pekalongan");
        Node semarang = new Node("Semarang");
        Node ungaran = new Node("Ungaran");
        Node bawen = new Node("Bawen");
        Node salatiga = new Node("Salatiga");
        Node boyolali = new Node("Boyolali");
        Node ngawi = new Node("Ngawi");
        Node sidoarjo = new Node("Sidoarjo");
        Node denpasar = new Node("Denpasar");

        bandung.addTetangga(sumedang);
        bandung.addTetangga(ungaran);

        sumedang.addTetangga(bandung);
        sumedang.addTetangga(cirebon);
        sumedang.addTetangga(ungaran);

        cirebon.addTetangga(sumedang);
        cirebon.addTetangga(tegal);

        tegal.addTetangga(cirebon);
        tegal.addTetangga(pemalang);

        pemalang.addTetangga(tegal);
        pemalang.addTetangga(salatiga);
        pemalang.addTetangga(boyolali);
        pemalang.addTetangga(pekalongan);

        pekalongan.addTetangga(pemalang);
        pekalongan.addTetangga(semarang);

        semarang.addTetangga(pekalongan);
        semarang.addTetangga(ngawi);

        ungaran.addTetangga(bandung);
        ungaran.addTetangga(bawen);

        bawen.addTetangga(ungaran);
        bawen.addTetangga(cirebon);
        bawen.addTetangga(tegal);

        salatiga.addTetangga(bawen);
        salatiga.addTetangga(boyolali);

        boyolali.addTetangga(salatiga);
        boyolali.addTetangga(pemalang);
        boyolali.addTetangga(pekalongan);

        ngawi.addTetangga(boyolali);
        ngawi.addTetangga(sidoarjo);

        sidoarjo.addTetangga(ngawi);
        sidoarjo.addTetangga(denpasar);

        denpasar.addTetangga(ngawi);
        denpasar.addTetangga(sidoarjo);

        //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'BFS' akan dimulai
        System.out.println("BFS");
        //Membuat objek 'bfs' dari kelas 'BreadthFirstSearch'
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        //Memanggil method 'search' dari objek 'bfs' untuk mencari jalur dari kota 'Bandung' ke 'Denpasar' menggunakan BFS
        bfs.search(bandung, denpasar);
        System.out.println();

        //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'DLS' akan dimulai
        System.out.println("DLS");
        //Membuat objek 'dls' dari kelas 'DepthLimitedSearch'
        DepthLimitedSearch dls = new DepthLimitedSearch();
        //Mengatur batasan kedalaman pencarian dengan nilai 10
        dls.setLimit(10);
        //Memanggil method 'search' dari objek 'dls' untuk mencari jalur dari kota 'Bandung' ke 'Denpasar' menggunakan DLS dengan batasan kedalaman 10
        dls.search(bandung, denpasar);
        System.out.println();

        //Membuat objek-objek 'NodeUCS' yang mewakili kota-kota dengan biaya terkait
        NodeUCS bandungUCS = new NodeUCS(bandung, 366);
        NodeUCS sumedangUCS = new NodeUCS(sumedang, 0);
        NodeUCS cirebonUCS = new NodeUCS(cirebon, 160);
        NodeUCS tegalUCS = new NodeUCS(tegal, 242);
        NodeUCS pemalangUCS = new NodeUCS(pemalang, 161);
        NodeUCS pekalonganUCS = new NodeUCS(pekalongan, 176);
        NodeUCS semarangUCS = new NodeUCS(semarang, 77);
        NodeUCS ungaranUCS = new NodeUCS(ungaran, 151);
        NodeUCS bawenUCS = new NodeUCS(bawen, 226);
        NodeUCS salatigaUCS = new NodeUCS(salatiga, 244);
        NodeUCS boyolaliUCS = new NodeUCS(boyolali, 241);
        NodeUCS ngawiUCS = new NodeUCS(ngawi, 234);
        NodeUCS sidoarjoUCS = new NodeUCS(sidoarjo, 380);
        NodeUCS denpasarUCS = new NodeUCS(denpasar, 10);

        bandung.addTetangga(sumedang);
        bandung.addTetangga(ungaran);

        sumedang.addTetangga(bandung);
        sumedang.addTetangga(cirebon);
        sumedang.addTetangga(ungaran);

        cirebon.addTetangga(sumedang);
        cirebon.addTetangga(tegal);

        tegal.addTetangga(cirebon);
        tegal.addTetangga(pemalang);

        pemalang.addTetangga(tegal);
        pemalang.addTetangga(salatiga);
        pemalang.addTetangga(boyolali);
        pemalang.addTetangga(pekalongan);

        pekalongan.addTetangga(pemalang);
        pekalongan.addTetangga(semarang);

        semarang.addTetangga(pekalongan);
        semarang.addTetangga(ngawi);

        ungaran.addTetangga(bandung);
        ungaran.addTetangga(bawen);

        bawen.addTetangga(ungaran);
        bawen.addTetangga(cirebon);
        bawen.addTetangga(tegal);

        salatiga.addTetangga(bawen);
        salatiga.addTetangga(boyolali);

        boyolali.addTetangga(salatiga);
        boyolali.addTetangga(pemalang);
        boyolali.addTetangga(pekalongan);

        ngawi.addTetangga(boyolali);
        ngawi.addTetangga(sidoarjo);

        sidoarjo.addTetangga(ngawi);
        sidoarjo.addTetangga(denpasar);

        denpasar.addTetangga(ngawi);

        //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'UCS' akan dimulai
        System.out.println("UCS");
        //Membuat objek 'ucs' dari kelas 'UniformCostSearch'
        UniformCostSearch ucs = new UniformCostSearch();
        //Memanggil method 'search' dari objek 'ucs' untuk mencari jalur dari kota 'Bandung' dengan biaya 366 ke kota 'Denpasar' dengan biaya 10 menggunakan UCS
        ucs.search(bandungUCS, denpasarUCS);
        System.out.println();
    }
}
