package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Cliente;
import models.MdlInicio;
import models.MdlPrincipal;
import views.FrmInicio;
import views.FrmPrincipal;

public class CtrlPrincipal implements ActionListener{
    public FrmPrincipal b;
    public MdlPrincipal a;
    
    public CtrlPrincipal(MdlPrincipal a,FrmPrincipal b){
        this.a=a;
        this.b=b;
        this.b.btn_ingresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cliente cl;
        if(e.getSource().equals(this.b.btn_ingresar)){
            cl=a.login(this.b.txt_numero.getText(),this.b.txt_nip.getText());
            if(cl!=null){
                FrmInicio bb = new FrmInicio();
                MdlInicio cc = new MdlInicio(cl);
                CtrlInicio aa = new CtrlInicio(cc,bb);
                this.b.setVisible(false);
                aa.a.setVisible(true);
            }
        }
    }
}
