package model;
public class Model {
    private Kocsi[] autoList;
    
    public Model() {

    }
    
    public void autoLetrehoz() {
        autoList = new Kocsi[5];
        autoList[0] = new Kocsi("RTE-234", "Kek", "-");
        autoList[1] = new Kocsi("FRT-523", "Piros", "Carbon teto");
        autoList[2] = new Kocsi("GTK-324", "Sarga", "-");
        autoList[3] = new Kocsi("HLO-634", "Zold", "Arany felni");
        autoList[4] = new Kocsi("OHS-279", "Fekete", "-");
    }
    
    public String autokFelsorol(){
        String s = "";
        int index = 1;
        for(Kocsi auto : autoList){
            s = "Index: " + index++ + "\nRendszam: " + auto.getRendszam() + "\nSzin: " + auto.getSzin() + "\nExtra: " + auto.getExtra();
        }        
        return s;
    }
}
