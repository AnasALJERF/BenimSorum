/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p.c
 */
public class Personal extends Kisi{
    
    int personalİd;
    int maas;

    public Personal() {
        
    }
    
    public Personal(String a, int y, String adr, String u,int id , int m){
    super(a, y, adr, u);
    personalİd= id;
    maas= m;
    
    
    }

    public void setPersonalİd(int personalİd) {
        this.personalİd = personalİd;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    
    
    
    public int getPersonalİd() {
        return personalİd;
    }

    public int getMaas() {
        return maas;
    }
    
    
    
    
}
