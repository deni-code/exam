/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaalquileres;

import javax.swing.JOptionPane;

/**
 *
 * @author devig
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    // Caracteristicas del carro
    public class CARROS{
       private  String marcaoCarro;
       private String placa;
       private int precioBase;
       private int cantidasDiasAlquiler;
       private int seguroCarro;
       private int GPS;
       private int Porcentaje;
        private int CalculoFinal;
       
        //Funciones del CARRO
       public CARROS(){
            this.marcaoCarro = "";
            this.placa = "123";
            this.precioBase = 0;
            this.cantidasDiasAlquiler = 0;
            this.seguroCarro= 0;
            this.GPS = 0;
           this.Porcentaje= 0;
        
    }
        public void calculoconPorcentaje(int Porcentaje){// 
           this.cantidasDiasAlquiler = 7;
           this.Porcentaje = (int) 0.15;
        }
           public void CalculoFinal(int Final){
             if(this.cantidasDiasAlquiler> 7) {
             
              }else{
                 if(this.CalculoFinal< 6){
                 this.CalculoFinal = 0;
                 
                 }
            
                 public void carroSeguro(int Seguro){
                     this.seguroCarro = 5000;
                     this.cantidasDiasAlquiler = 7;
                     this.GPS = 2000;
          
                     
                 }  
            public void  Segurofinal(int Final){
                if(this.seguroCarro > 5000){
                   
                }
                    if(this.GPS > 2000){
                    }else{
                        if(this.seguroCarro < 49999){
                        if(this.GPS < 19999){
                        }
                        
                        }}}

        public String getMarcaoCarro() {
            return marcaoCarro;
        }

        public void setMarcaoCarro(String marcaoCarro) {
            this.marcaoCarro = marcaoCarro;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public int getPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(int precioBase) {
            this.precioBase = precioBase;
        }

        public int getCantidasDiasAlquiler() {
            return cantidasDiasAlquiler;
        }

        public void setCantidasDiasAlquiler(int cantidasDiasAlquiler) {
            this.cantidasDiasAlquiler = cantidasDiasAlquiler;
        }

        public int getSeguroCarro() {
            return seguroCarro;
        }

        public void setSeguroCarro(int seguroCarro) {
            this.seguroCarro = seguroCarro;
        }

        public int getGPS() {
            return GPS;
        }

        public void setGPS(int GPS) {
            this.GPS = GPS;
        }

        public int getPorcentaje() {
            return Porcentaje;
        }

        public void setPorcentaje(int Porcentaje) {
            this.Porcentaje = Porcentaje;
        }

        public int getCalculoFinal() {
            return CalculoFinal;
        }

        public void setCalculoFinal(int CalculoFinal) {
            this.CalculoFinal = CalculoFinal;
        }

        @Override
        public String toString() {
            return "CARROS{" + "marcaoCarro=" + marcaoCarro + ", placa=" + placa + ", precioBase=" + precioBase + ", cantidasDiasAlquiler=" + cantidasDiasAlquiler + ", seguroCarro=" + seguroCarro + ", GPS=" + GPS + ", Porcentaje=" + Porcentaje + ", CalculoFinal=" + CalculoFinal + '}';
         
                    
        }
        
    }}



                            
                        
                    
                    
                        
                    
                
                    
                
                       
                        

                        
                
                     
                     
               
            
             
                
                  
                     
                 
                    
                 

      

            
        
                 
           
           
               
                
           
               
                
            
            
            
            
       