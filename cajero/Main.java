package cajero;

import controllers.CtrlPrincipal;
import models.MdlPrincipal;
import views.FrmPrincipal;

public class Main {

    public static void main(String[] args) {
        MdlPrincipal a = new MdlPrincipal();
        FrmPrincipal b = new FrmPrincipal();
        CtrlPrincipal c = new CtrlPrincipal(a,b);        
        c.b.setVisible(true);
    }
    
}
