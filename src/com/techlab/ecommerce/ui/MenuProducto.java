package com.techlab.ecommerce.ui;

import java.util.Scanner;
import com.techlab.ecommerce.ui.MenuProducto;
import com.techlab.ecommerce.service.ProductoService;

public class MenuProducto {
    private final Scanner sc;
    private final ProductoService service;


    public MenuProducto(Scanner sc, ProductoService service){
        this.sc=sc;
        this.service=service;
    }

    public void mostrarMenu(){
        System.out.println("======= Gestion de Productos =======");
        System.out.println("1- Agregar Producto");
        System.out.println("2- Listar Productos");
        System.out.println("6- Salir");
    }

}