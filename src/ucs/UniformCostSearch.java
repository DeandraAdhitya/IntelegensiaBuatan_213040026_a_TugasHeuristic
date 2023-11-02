package ucs;

import java.util.ArrayList;
import java.util.List;

//Deklarasi sebuah kelas dengan nama UniformCostSearch
public class UniformCostSearch {

    //Metode 'search' yang digunakan untuk menjalankan algoritma UCS untuk mencari solusi dari node 'start' ke node 'goal'
    public void search(NodeUCS start, NodeUCS goal) {
        //Mencetak pesan yang menunjukan bahwa pencarian solusi sedang dilakukan dari node 'start' ke node 'goal'
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai());
        //Menginisialisasi node 'eval' dengan node awal 'start' untuk memulai evaluasi
        NodeUCS eval = start;
        //Menginisialisasi variable 'done' sebagai 'false'
        boolean done = false;
        //Membuat sebuah ArrayList kosong yang digunakan untuk menyimpan ppath atau urutan node yang membentuk solusi
        List<NodeUCS> solusi = new ArrayList<>();
        
        //Loop 'while; yang akan berjalan selama variable 'done' masih 'false'
        while (!done) {
            //Mencetak pesan yang menunjukan evaluasi saat ini, mencakup nilai node 'getNilai()' dan biaya 'getCost()'
            System.out.println("Evaluasi: "+eval.getNilai()+" dengan cost "+eval.getCost());
            //Node yang dievaluasi ditambahkan ke daftar solusi
            solusi.add(eval);
            
            //Memeriksa apakah node yang dievaluasi saat ini adalah node tujuan 'goal'
            if (eval.equals(goal)) {
                //Jika node evaluasi adalah node tujuan, mencetak pesan bahwa solusi ditemukan
                System.out.println("Solusi ditemukan ");
                //Mengatur 'done' menjadi 'true' untuk menandai bahwa pencarian sudah selesai
                done = true;
            }
            
            //Memeriksa apakah node evaluasi memiliki suksesor
            if (!eval.getTetangga().isEmpty()) {
                // inisialisai node terbaik 'best' sebagai 'null'
                NodeUCS best = null;
                //Inisialisasi variable 'min' dengan nilai maksumum bilangan bulat yang mungkin
                int min = Integer.MAX_VALUE;
                //Mencetak baris kosong untuk memisahkan output
                System.out.println();
                
                //Loop for untuk mengintegrasi melalui suksesor-suksesor node evaluasi
                for (NodeUCS node: eval.getTetangga()) {
                    //Mencetak nilai dan biaya dari masing-masing suksesor
                    System.out.print(node.getNilai() + " ("+ node.getCost() + "), ");
                    
                    //Memeriksa apakah biaya suksesor saat ini lebih kecil dari nilai minimum 'min'
                    if (min > node.getCost()) {
                        //Jika ya, maka nilai minimum 'min' diperbarui dengan biaya suksesor saat ini
                        min = node.getCost();
                        //Node terbaik 'best' diperbarui menjadi node suksesor dengan biaya terendah
                        best = node;
                    }
                }
                //Mencetak baris untuk memisahkan output
                System.out.println();
                //mencetak pesan yang menunjukan node terpilih (suksesor terbaik) beserta biayanya
                System.out.println("Node terpilih: "+best.getNilai()+" ("+min+")");
                //Node evaluasi saat ini diubah menjadi node terbaik yang dipilih
                eval = best;
            //Jika node evaluasi tidak memiliki suksesor
            } else {
                //Mengatur 'done' menjadi 'true' untuk menandai bahwa pencarian sudah selesai
                done = true;
            }
        }

        //Mencetak baris kosong untuk memisahkan output
        System.out.println();
        //Mencetak pesan yang menunjukan bahwa solusi ditemukan dan mencetak semua node dalam path solusi
        System.out.println("Solusi ditemukan: ");
        
        //Loop for untuk mengiterasi melalui semua node dalam daftar solusi
        for (NodeUCS node: solusi) {
            //Mencetak nilai dan biaya setiap node dalam path solusi
            System.out.println(node.getNilai()+" ("+node.getCost()+")");
        }
    }
}