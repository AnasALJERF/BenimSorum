
    
public class Kisi {

    private String ad;
    int yas;
    String uyruk;
    String adres;


    public Kisi() {
    
    }

    public Kisi (String a, int y, String adr){
    
    ad = a;
    yas =y;
    adres = adr;
    
    }
    


    
    public Kisi (String a, int y, String adr, String u){
    
    this(a,y,adr);
    uyruk = u;
    
    }
    
    
    
    
    private void setAd(String a){
    
        ad = a;
       
    }
    
    public void setAdres (String adr){
    
    adres = adr;
    }
    
    public void setYas(int y){
        
    yas = y;
   
    }
    
    public void setUyruk(String u){
    uyruk =u;
   
    
    }

    public String getAd() {
        return ad;
    }
    
    
    
    
    public int getYas(){
    
    return yas;
    }
    
    
    
    public String getAdres(){
    return adres;
    }
    
    
    public String getUyruk(){
    return uyruk;
    }
 
    
    
    public static void main(String[] args) {
    
 
        
    }
    
}

    
