/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author SBC4
 */
public class pembagian {
    
        public static long rekursif (int a, int b){
        if (b==0){
           return 0;
        } else
         { return    a+rekursif(a,b-1);
        }
        }



    public static void main(String[] args) {
            int a,b; //deklarasi variabel a dan b
        Scanner input = new Scanner(System.in);//proses input data dengan scanner

        System.out.print("Masukkan angka: ");
        a=input.nextInt();//pengambilan data a
        System.out.print("Masukkan angka: ");
        b=input.nextInt();//pengambilan data b
            System.out.println(a+"/"+b+"="+ rekursif  (a,b)); //tampilan output
    }


}

