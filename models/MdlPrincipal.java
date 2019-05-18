package models;

import java.util.ArrayList;

public class MdlPrincipal {
    public ArrayList<Cliente> usuarios;
    
    public MdlPrincipal(){
        usuarios=new ArrayList();
        usuarios.add(new Cliente("Administrador","1234","1234"));
    }
    public Cliente login(String noCuenta,String nip){
        Cliente tmp = new Cliente(noCuenta,nip);
        Cliente resp=null;
        int index;
        index=usuarios.indexOf(tmp);
        if(index!=-1){
            resp=usuarios.get(index);
        }
        return resp;
    }
}
