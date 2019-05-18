package models;

public class Cliente {
    private String noCuenta;
    private String nip;
    private String nombre;
    private int monto;

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    public Cliente(){
        monto=1000;
    }
    public Cliente(String noCuenta,String nip){
        this();
        this.setNoCuenta(noCuenta);
        this.setNip(nip);
    }
    public Cliente(String nombre,String noCuenta,String nip){
        this(noCuenta,nip);
        this.setNombre(nombre);
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public boolean equals(Object o){
        boolean resp;
        Cliente a = (Cliente)o;        
        return a.getNoCuenta().equals(this.getNoCuenta());
    }

    public void transferencia(int n) {
        monto=monto+n;
    }

    public void deposito(int n) {
        monto=monto+n;
    }
    public void retiro(int n){
        monto=monto-n;
    }
}
