package com.company;

import java.io.StringWriter;

public class Builderpizza {

    protected Pizza _pizza;
    public Pizza built(){
        return this._pizza;
    }

    public Builderpizza(){
        _pizza= new Pizza();
    }

    public Builderpizza setMasa(String tipoMasa){
        _pizza.setMasa(tipoMasa);
        return this;
    }
    public Builderpizza setbacon(boolean bacon){
        _pizza.setBacon(bacon);
        return this;
    }
    public Builderpizza setcebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }
    public Builderpizza setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }
    public Builderpizza setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }



}