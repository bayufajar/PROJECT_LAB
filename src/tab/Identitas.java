/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tab;
import java.util.Scanner;
/**
 *
 * @author Berjayaaa
 */
public class Identitas extends Model{
    Scanner in=new Scanner(System.in);
    
    void insertIdentitas(){
        System.out.println("Masukkan nama lab: ");
        setNama(in.nextLine());
        System.out.println("masukkan alamat: ");
        setAlamat(in.nextLine());
        System.out.println("masukkan panjang: ");
        setPanjang(in.nextInt());
        System.out.println("masukkan lebar: ");
        setLebar(in.nextInt());
    }
    
    void insertKondisi(){
        System.out.println("Masukkan jumlah komputer:");
        setJmKomputer(in.nextInt());
        System.out.println("masukkan jumlah meja: ");
        setJmMeja(in.nextInt());
        System.out.println("masukan jumlah kursi: ");
        setJmKursi(in.nextInt());
        System.out.println("masukkan jumlah ruang: ");
        setJmRuang(in.nextInt());
    }
    
    void insertLingkungan(){
        System.out.println("masukkan kondisi lantai:");
        setKonLantai(in.nextLine());
        System.out.println("masukkan kondisi dinding: ");
        setKonDinding(in.nextLine());
        System.out.println("masukkan kondisi langit-langit: ");
        setKonLangit(in.nextLine());
        System.out.println("masukkan kondisi pintu: ");
        setKonPintu(in.nextLine());
    }
    
    void insertKenyamanan(){
        System.out.println("bising/tidak: ");
        setBising(in.nextLine());
        System.out.println("bau/ tidak: ");
        setBau(in.nextLine());
        System.out.println("bocor/ tidak: ");
        setBocor(in.nextLine());
        System.out.println("rusak/ tidak: ");
        setRusak(in.nextLine());
    }
}
