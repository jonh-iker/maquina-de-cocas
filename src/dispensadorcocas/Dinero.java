/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadorcocas;

/**
 *
 * @author jonhy
 */
public class Dinero {
    private moneda monedas;
    private billete billetes;
    

    public void setMonedas(moneda monedas) {
        this.monedas = monedas;
    }

    public void setBilletes(billete billetes) {
        this.billetes = billetes;
    }

    public moneda getMonedas() {
        return monedas;
    }

    public billete getBilletes() {
        return billetes;
    }
    
   public Integer convertirmonedas(moneda m){
   Integer suelto=0;
   if(m==moneda.UNO){
   suelto=1;
   }else if(m==moneda.DOS){
   suelto=2;
   }else if(m==moneda.CINCO){
   suelto=5;
   }else if(m==moneda.DIEZ){
   suelto=10;
   }
       return suelto;
   }
   
   public Integer convertirbilletes(billete b){
   Integer fajo=0;
   if(b==billete.VEINTE){
   fajo=20;
   }else if(b==billete.CINCUENTA){
   fajo=50;
   }else if(b==billete.CIEN){
   fajo=100;
   }
   return fajo;
   }
  
   
}
