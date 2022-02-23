/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;
import java.util.Scanner;
public class KTP {

    public static void main(String[] args) {
        
        String pr,ko,Ttl,kl,al,D,k,Ag,pk,pkr,pkn,N;
        Double R;
        
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukkan provinsi ");
        pr = Input.nextLine();
        System.out.print("Masukkan kota/kabupaten ");
        ko = Input.nextLine(); 
        System.out.print("Masukkan tempat/Tgl.Lahir ");
        Ttl = Input.nextLine();
        System.out.print("Masukkan jenis kelamin ");
        kl = Input.nextLine();
        System.out.print("Masukkan alamat ");
        al = Input.nextLine();   
        System.out.print("Masukkan desa ");
        D = Input.nextLine();
        System.out.print("Masukkan kecamatan ");
        k = Input.nextLine();
        System.out.print("Masukkan agama ");
        Ag = Input.nextLine();
        System.out.print("Masukkan Status perkawinan ");
        pk = Input.nextLine();
        System.out.print("Masukkan pekerjaan ");
        pkr = Input.nextLine();
        System.out.print("Masukkan kewarganegaraan ");
        pkn = Input.nextLine();
        System.out.print("Masukkan NIK ");
        N = Input.next();
        System.out.print("Masukkan Rt,Rw ");
        R = Input.nextDouble();
        {
        System.out.println("--------------------------------");    
        System.out.println("        PROVINSI "+pr);
        System.out.println("           "+ko);
        System.out.println("NIK              : "+N);
        System.out.println("Tempat/Tgl lahir : "+Ttl);
        System.out.println("Jenis Kelamin    : "+kl);
        System.out.println("Alamat           : "+al);
        System.out.println("    Rt/Rw        : "+R);
        System.out.println("    Desa         : "+D);
        System.out.println("    Kecamatan    : "+k);
        System.out.println("Agama            : "+Ag);
        System.out.println("Status perkawinan: "+pk);
        System.out.println("Pekerjaan        : "+pkr);
        System.out.println("Kewarganegaraan  : "+pkn);
        }  
    }
   
}
