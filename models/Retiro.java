package models;

public class Retiro implements IOperations{
    public Cliente clt;
    public int n;
    public Retiro(Cliente a,int n){
        this.clt=a;
        this.n=n;
    }
    
    public void execute() {
        clt.retiro(n);
    }
    
}
