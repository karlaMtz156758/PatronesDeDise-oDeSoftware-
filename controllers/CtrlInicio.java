package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.MdlInicio;
import views.FrmInicio;

public class CtrlInicio implements ActionListener{
    public MdlInicio b;
    public FrmInicio a;
    
    public CtrlInicio(MdlInicio b,FrmInicio a){
        this.a=a;
        this.b=b;        
        this.a.btn_deposito.addActionListener(this);
        this.a.btn_retirar1.addActionListener(this);
        this.a.btn_salir.addActionListener(this);
        this.a.btn_transferencia.addActionListener(this);
        this.a.btn_realizar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.a.btn_retirar1)){
            this.b.retiro(Integer.valueOf(this.a.txt_monto.getText()));
            this.a.txt_monto.setText("");
        }else if(e.getSource().equals(this.a.btn_deposito)){
            this.b.deposito(Integer.valueOf(this.a.txt_monto.getText()));
            this.a.txt_monto.setText("");
        }else if(e.getSource().equals(this.a.btn_transferencia)){
            this.b.tranferencia(Integer.valueOf(this.a.txt_monto.getText()));
            this.a.txt_monto.setText("");
        }else if(e.getSource().equals(this.a.btn_realizar)){
            this.b.acciones();
            JOptionPane.showMessageDialog(null, "Listo. \n Monto total: "+this.b.clnt.getMonto());
            System.out.println("Listo. \n Monto total: "+this.b.clnt.getMonto());
        }else if(e.getSource().equals(this.a.btn_salir)){
            System.exit(0);
        }
    }
}
