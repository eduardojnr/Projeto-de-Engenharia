package com.sceapp.enums;

public enum PerfilEnumerador {
    
    ADMIN("ADMIN"),
    PRESIDENTE("PRESIDENTE"),
    PESQUISADOR("PESQUISADOR"),
    SECRETARIA("SECRETARIA");
    
    private String perfil;
    
    PerfilEnumerador(String perfil) {
        this.perfil = perfil;
    }
    
    @Override
    public String toString() {
        return perfil;
    }

}
