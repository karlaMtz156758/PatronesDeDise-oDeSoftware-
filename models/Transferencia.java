package models;

public class Transferencia implements IOperations{
    public Cliente clt;
    int n;
    public Transferencia(Cliente a,int n){
        this.clt=a;
        this.n=n;
    }    
    public void execute() {
        clt.transferencia(n);
    }
    
}
