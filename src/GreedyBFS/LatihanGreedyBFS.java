/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyBFS;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author HP
 */

public class LatihanGreedyBFS {
    // Deklarasi dari sebuah method yang menerima dua parameter yaitu 'Start' dan 'goal', keduanya adalah objek dari kelas  'Node'
    public void search(NodeUCS start, NodeUCS goal) {
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
                //Memulai Pengulangan For  untuk mencetak path solusi
                for(NodeUCS node: eval.getNodes()) {
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
                
                Solusi solusiSuksesor = new Solusi();
                
                NodeUCS best = null;
                
                int min = Integer.MAX_VALUE;
                
                int depth = 0;
                
                //Memulai Pengulangan untuk mengiterasi melalui suksesor dari node yang dievaluasi
                for (NodeUCS node : eval.getNode().getTetangga()) {
                        
                        if (depth < 5) {
                            System.out.println(node.getNilai() + " (" + node.getCost() + "), ");
                            
                            
                            if (min > node.getCost()) {
                                
                                min = node.getCost();
                                
                                best = node;
                            }
                        } else {
                            
                            return;
                        }
                        
                        depth++;
                }
                
                NodeUCS suksesor = best;
                
                solusiSuksesor.setNode(suksesor);
                
                solusiSuksesor.setNodes(eval.getNodes());
                
                System.out.println();
                
                System.out.println("Node terpilih: " + best.getNilai() + " (" + min + ")");
                
                queue.offer(solusiSuksesor);
                System.out.println();
            }
        }

    }
}
