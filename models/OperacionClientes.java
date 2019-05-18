package models;

public class OperacionClientes {
    public Cliente clt;
    public OperacionClientes(Cliente clt){
        this.clt=clt;
    }
    
    public void update(String pass){
        clt.setNip(pass);
    }
}
