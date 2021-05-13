package com.company;



public class Pizza {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean piña;
    private boolean champiñones;
    private boolean ExtraQueso;
    private boolean aceitunas;
    private boolean sardinas;
    private boolean bacon;
    private boolean jamon;
    private boolean kiwi;


    public Pizza() {
    }

    public Pizza(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean piña, boolean champiñones, boolean extraQueso, boolean aceitunas, boolean sardinas, boolean bacon, boolean jamon, boolean kiwi) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.piña = piña;
        this.champiñones = champiñones;
        ExtraQueso = extraQueso;
        this.aceitunas = aceitunas;
        this.sardinas = sardinas;
        this.bacon = bacon;
        this.jamon = jamon;
        this.kiwi = kiwi;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isExtraQueso() {
        return ExtraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        ExtraQueso = extraQueso;
    }

    public boolean isAceitunas() {
        return aceitunas;
    }

    public void setAceitunas(boolean aceitunas) {
        this.aceitunas = aceitunas;
    }

    public boolean isSardinas() {
        return sardinas;
    }

    public void setSardinas(boolean sardinas) {
        this.sardinas = sardinas;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isKiwi() {
        return kiwi;
    }

    public void setKiwi(boolean kiwi) {
        this.kiwi = kiwi;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", ExtraQueso=" + ExtraQueso +
                ", aceitunas=" + aceitunas +
                ", sardinas=" + sardinas +
                ", bacon=" + bacon +
                ", jamon=" + jamon +
                ", kiwi=" + kiwi +
                '}';
    }
}
