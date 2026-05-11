package com.techlab.ecommerce;

import com.techlab.ecommerce.ui.MenuProducto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MenuProducto menu = MenuProducto(sc); 

        int opcion;

        do{
            menu.mostrarMenu();
            try {
                switch (opcion) {
                    case 1 -> menu.agregarProducto();           
                        break;
                    default:
                        break;
                }
            }
        } while (opcion !=6);
    }
}
