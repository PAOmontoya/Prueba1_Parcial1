package com.mycompany.prueba;
import java.util.Date;

/**
 *
 * @author danie
 */
public class MovieItem extends BlockBusterItem{
    
    private String estado;
    
    public MovieItem(int codigo, String nombre, double precioRentaItem){
        super(codigo,nombre,precioRentaItem);
        this.estado="ESTRENO";
        
        
        
    }
    
    public String toString(){
        return super.toSring()+"-"+estado+"Movie";
    }
    
    public double PagoRenta(int dias){
        double pagoFinal=getPrecioRentaItem();
        
        if(estado.equals("ESTRENO")&& dias>2){
            pagoFinal+=50*(dias-2);
        }else if(estado.equals("NORMAL")&& dias>5){
            pagoFinal+=30*(dias-5);
        }
        return pagoFinal;
    }
    
    public void EvaluarEstado(){
        Date fechaActual = new Date();
        Date fechaAdicionItem= super.getFechaAdicionItem();
        long diferenciaMillisegundos=fechaActual.getTime()-fechaAdicionItem.getTime();
        long diferenciaMeses=diferenciaMillisegundos/(30L*24L*60L*1000L);
        
        if(diferenciaMeses>5 && estado.equals("NORMAL")){
            estado.equals("ESTRENO");
        
    }
        
       
    }

    @Override
    public int pagoRenta(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

