package controler;

import model.Model;
import view.View;

public class Controler {
    private model.Model MODEL;
    private view.View VIEW;

    public Controler(Model MODEL, View VIEW) {
        this.MODEL = MODEL;
        this.VIEW = VIEW;
        start();
    }

    public Controler() {
    }
    
    public void start(){
        VIEW.konzolAblakMutat(MODEL.autokFelsorol());
    }
}
