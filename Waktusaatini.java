/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 * Nama : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Waktu saat ini
 */
public class Waktusaatini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hari;
        
        Date sKini = new Date();
        SimpleDateFormat day = new SimpleDateFormat ("EEEE");
        
        if(day.equals("Minggu")){
            hari = "Minggu";
        }else if(day.equals("Senin")){
            hari = "Senin";
        }else if(day.equals("Selasa")){
            hari = "Selasa";
        }else if(day.equals("Rabu")){
            hari = "Rabu";
        }else if(day.equals("Kamis")){
            hari = "Kemis";
        }else if(day.equals("Jumat")){
            hari = "Jum'at";
        }else{
            hari = "Sabtu";
        }
        SimpleDateFormat hariini = new SimpleDateFormat(", dd MMM yyy, h:mm:ss");
        System.out.println("Hari ini adalah hari : "+ hari + hariini.format(sKini));
        
    }
    
}
