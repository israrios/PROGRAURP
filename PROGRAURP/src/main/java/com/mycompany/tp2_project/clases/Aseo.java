/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_project.clases;


public class Aseo extends Producto {

    private String fechaCaducidad;
    private String fragancia;
    
    public Aseo(){
        
    }
    
    public Aseo(int id, String codigo,double precio,String nombre,int stock,String categoria,String fc,String fragancia){
        super.setId(id);
        super.setCodigo(codigo);
        super.setPrecio(precio);
        super.setNombre(nombre);
        super.setStock(stock);
        super.setCategoria(categoria);
        this.fechaCaducidad=fc;
        this.fragancia=fragancia;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    
}
