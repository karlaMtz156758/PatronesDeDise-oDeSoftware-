package models;

public class Deposito implements IOperations{
    public Cliente clt;
    int n;
    public Deposito(Cliente a,int n){
        this.clt=a;
        this.n=n;
    }    
    public void execute() {
        clt.deposito(n);
    }
    
}
