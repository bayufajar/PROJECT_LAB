/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tab;

/**
 *
 * @author Soveatin
 */
public class analisa extends Identitas {
    public analisa(){
        insertIdentitas();
        insertKondisi();
        insertLingkungan();
        insertKenyamanan();
        
    }
    void identitas(){
        if(getPanjang()>getLebar()){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void kondisi(){
        if(getJmKomputer()>=25 && getJmMeja()>=25 && getJmKursi()>=25 && getJmRuang()<=2){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
      
        }
       
    }
    void ruangan(String bersih){
        if(getKonLantai().equalsIgnoreCase(bersih) && getKonDinding().equalsIgnoreCase(bersih)&&getKonPintu().equalsIgnoreCase(bersih) && getKonLangit().equalsIgnoreCase(bersih)){
            System.out.println("Sesuai");
            
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void nyaman(String tidak){
        if(getBising().equalsIgnoreCase(tidak) && getBau().equalsIgnoreCase(tidak) && getBocor().equalsIgnoreCase(tidak) && getRusak().equalsIgnoreCase(tidak)){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    
}
