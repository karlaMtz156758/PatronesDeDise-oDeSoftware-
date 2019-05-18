package models;

import java.util.ArrayList;

public class MdlInicio {
    public Cliente clnt;
    public ArrayList<IOperations> acciones;
    
    public MdlInicio(Cliente clnt){
        this.setClnt(clnt);
        acciones = new ArrayList();
    }
    
    public void acciones(){
        for(int x=0; x<acciones.size(); x++){
            acciones.get(x).execute();
        }
        acciones.clear();
    }
    
    public void retiro(int n){
        acciones.add(new Retiro(clnt,n));
    }
    
    public void deposito(int n){
        acciones.add(new Deposito(clnt,n));
    }
    
    public void tranferencia(int n){
        acciones.add(new Transferencia(clnt,n));
    }
    
    public Cliente getClnt() {
        return clnt;
    }

    public void setClnt(Cliente clnt) {
        this.clnt = clnt;
    }
    
}
