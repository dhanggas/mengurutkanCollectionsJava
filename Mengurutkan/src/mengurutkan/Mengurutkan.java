/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengurutkan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dhiskar
 */
public class Mengurutkan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int [] daftarUrut = {1,5,6,7,9,3};
//        
//        Arrays.sort(daftarUrut);
//        
//        for (int i : daftarUrut) {
//            System.out.println(""+i);
//        }

//           List nomerUrut = new ArrayList();
//           nomerUrut.add(1);
//           nomerUrut.add(7);
//           nomerUrut.add(4);
//           nomerUrut.add(6);
//           nomerUrut.add(9);
//           nomerUrut.add(4);
//           
//           Collections.sort(nomerUrut, Collections.reverseOrder());
//           
//           for (Object object : nomerUrut) {
//            
//           System.out.println(""+object);
//        }
        List daftarUrut = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("mamsukkan jlm angka :");
        int jmlAngka = sc.nextInt();
        
        for (int i = 0; i < jmlAngka; i++) {
            System.out.print("Angka per " + (i + 1) + " :");
            Object obj = sc.next();
            daftarUrut.add(obj);
        }
        
//            Collections.sort(daftarUrut, Collections.reverseOrder());
        Collections.sort(daftarUrut);
        for (Object object : daftarUrut) {
            System.out.println("" + object);
        }

    }

}
