/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p.c
 */
public class ogrenci extends Kisi {
    
    int ogrenciId;
    double ortalamaPuan;
    
   
    public ogrenci() {
    }
    
    public ogrenci(String a, int y, String adr, String u,int id , double or){
    super(a, y, adr, u);
    ogrenciId= id;
    ortalamaPuan= or;
    
    
    }

    public void setOgrenciId(int ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public void setOrtalamaPuan(double ortalamaPuan) {
        this.ortalamaPuan = ortalamaPuan;
    }

    public int getOgrenciId() {
        return ogrenciId;
    }

    public double getOrtalamaPuan() {
        return ortalamaPuan;
    }
    



} 