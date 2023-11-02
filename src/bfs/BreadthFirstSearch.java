package bfs;

import Test.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Deklarasi sebuah kelas dengan nama BreadthFirstSearch
public class BreadthFirstSearch {

// Deklarasi dari sebuah method yang menerima dua parameter yaitu 'Start' dan 'goal', keduanya adalah objek dari kelas 'Node'
    public void search(Node start, Node goal) {
        //Deklarasi dan menginisialisasi sebuah queue yang berisi objek dari kelas 'Solusi'
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        //Membuat objek solusiStart dari kelas 'Solusi'
        Solusi solusiStart = new Solusi();
        //Mengatur node 'start' ke dalam objek 'solusiStart'
        solusiStart.setNode(start);
        //Memasukan 'solusiStart' ke dalam queue
        queue.add(solusiStart);
        //Mencetak pesan yang menunjukan bahwa pencarian sedang dilakukan dari node 'start' ke node 'goal'
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai());

        //Inisialisasi sebuah pengulangan yang akan berjalan selama queue tidak kosong
        while (!queue.isEmpty()) {
            //Mengambil dan menghapus element pertama dari queue untuk dievaluasi dan disimpan dalam objek 'eval'
            Solusi eval = queue.poll();
            //Mencetak nilai node yang dievaluasi saat ini
            System.out.println("Evaluasi: "+eval.getNode().getNilai());

            //Memeriksa apakan node yang dievaluasi saat ini adalah node tujuan 'goal'
            if (eval.getNode().equals(goal)) {
                //Jika node evaluasi adalah node tujuan, mencetak pesan bahwa solusi ditemukan
                System.out.println("Solusi ditemukan: ");
                //Memulai Pengulangan For untuk mencetak path solusi
                for(Node node: eval.getNodes()) {
                    //Mencetak nilai node dalam path solusi
                    System.out.print(node.getNilai()+" -> ");
                }
                //Mencetak nilai node tujuan sebagai bagian dari path solusi
                System.out.println(eval.getNode().getNilai());
                //Mengakhiri pengulangan karena solusi sudah ditemukan
                break;
            //Jika Node yang dievaluasi bukan node tujuan 
            } else {
                //Mencetak pesan menunjukan node yang dievaluasi adalah suksesor
                System.out.println("Suksesor "+eval.getNode().getNilai());
                for (Node successor: eval.getNode().getTetangga()) {
                    //Mencetak nilai Suksessor
                    System.out.print(successor.getNilai()+" ");
                    //Membuat objek 'solusiSusksesor' untuk suksesor yang dievaluasi
                    Solusi solusiSuksesor = new Solusi();
                    //Mengatur suksesor sebagai node dalam 'solusiSuksesor'
                    solusiSuksesor.setNode(successor);
                    //Mengatur path node dari evaluasi sebelumnya ke 'solusiSuksesor'
                    solusiSuksesor.setNodes(eval.getNodes());
                    //Menambahkan Node evaluasi saat ini ke path 'solusiSuksesor'
                    solusiSuksesor.getNodes().add(eval.getNode());
                    //Menambahkan 'solusiSuksesor' ke dalam queue untuk evaluasi lebih lanjut
                    queue.offer(solusiSuksesor);
                }
                //Mencetak baris kosong untuk memisahkan antara evaluasi node yang berbeda dalam tingkat yang sama
                System.out.println();
                // Mencetak baris kosong lagi untuk memisahkan antara tingkat yang berbeda dalam pohon pencarian
                System.out.println();
            }
        }

    }
}
