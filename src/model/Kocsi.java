package model;
public class Kocsi {
    private String rendszam;
    private String szin;
    private String extra;

    public Kocsi(String rendszam, String szin, String extra) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra = extra;
    }

    public Kocsi() {
    }
    
    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getExtra() {
        return extra;
    }
    
    public void AtFestes() {
        
    }
    
    public void ExtraKeres() {
        
    }
}
