package com.mycompany.prueba;
import java.util.Date;
/**
 *
 * @author danie
 */
public abstract class BlockBusterItem {
    private int codigo;
    private String nombre;
    private double precioRentaItem;
    private Date fechaAdicionItem;
    
    
    
    public BlockBusterItem(int codigo, String nombre, double precioRentaItem){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precioRentaItem=precioRentaItem;
        this.fechaAdicionItem= new Date();
    }
    
    public int getCodigo(){
       return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getPrecioRentaItem(){
        return precioRentaItem;
    }
    
    public void setPrecioRentaItem(double precioRentaItem){
        this.precioRentaItem=precioRentaItem;
    }
    
    public Date getFechaAdicionItem(){
        return fechaAdicionItem;
    }
    
    public void setFechaAdicionItem(Date fechaAdicionItem){
        this.fechaAdicionItem=fechaAdicionItem;
    }
    
    public String toSring(){
        return "Codigo: "+codigo+"Nombre: "+nombre+"Precio de Renta del Item: "+precioRentaItem;
    }
 
    public abstract int pagoRenta(int dias);
   
}