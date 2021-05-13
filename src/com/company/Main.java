package com.company;

public class Main {

    public static void main(String[] args) {

/*Pizza barbacoa=new Pizza();
barbacoa.setMasa("Masa gruesa");
barbacoa.setTipo(1);
barbacoa.setSalsa(true);
barbacoa.setTipoSalsa("barbacoa");
barbacoa.setBacon(true);
barbacoa.setAceitunas(true);
barbacoa.setPiña(false);
barbacoa.setJamon(true);
String mostrarPizza=barbacoa.toString();
        System.out.println(mostrarPizza);
Pizza granburger=new Pizza();
        granburger.setMasa("Masa gruesa");
        granburger.setTipo(1);
        granburger.setSalsa(true);
        granburger.setTipoSalsa("barbacoa");
        granburger.setBacon(true);
        granburger.setAceitunas(false);
        granburger.setPiña(true);
        granburger.setJamon(true);
        granburger.setCebolla(true);
        String mostrarPizza2=barbacoa.toString();
        System.out.println(mostrarPizza2);
Pizza jamonqueso =new Pizza();
        jamonqueso.setMasa("Masa gruesa");
        jamonqueso.setTipo(1);
        jamonqueso.setSalsa(true);
        jamonqueso.setTipoSalsa("barbacoa");
        jamonqueso.setBacon(true);
        jamonqueso.setAceitunas(false);
        jamonqueso.setPiña(false);
        jamonqueso.setJamon(true);
        jamonqueso.setCebolla(false);
        jamonqueso.setExtraQueso(true);
        String mostrarPizza3=barbacoa.toString();
        System.out.println(mostrarPizza3);*/


        Pizza base = new Builderpizza()
                .setbacon(true)
                .setPiña(true)
                .setMasa("fina")
                .setcebolla(true)
                .built();

        Pizza rellena = new Builderpizza()
                .setbacon(true)
                .setPiña(true)
                .setMasa("fina")
                .setcebolla(true)
                .setRelleno(true)
                .built();

        System.out.println("las pizzas"+base+"\n pizza rellena"+rellena);


    }
}