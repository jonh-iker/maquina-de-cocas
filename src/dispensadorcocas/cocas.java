/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadorcocas;

import javax.swing.JOptionPane;

/**
 *
 * @author jonhy
 */
public class cocas extends Dinero{
    private Integer cantidad;
public static final Integer valor=14;
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    

    public Integer getValor() {
        return valor;
    }
    
    public cocas(){
    this.cantidad=1;
    
    }
    public void darcoca(){
     if(this.cantidad<=0){
         System.out.println("lo siento ya no quedan cocas disponibles");
         JOptionPane.showMessageDialog(null,"lo siento ya no quedan cocas disponibles");
    }else{
     this.cantidad--;
         
     }
     
    }
    public void cambio(Integer t){
        if(t>=valor){
        Integer cambio=t-valor;
            suelto(cambio);
        }else{
        
         JOptionPane.showMessageDialog(null,"lo siento dinero insuficiente");
        }
       
   }
   public void suelto(Integer c){
       int opcion=0;
       int r;
   if(c>=100){
       opcion=1;
   }else
   if((c>=50)&&(c<100)){
   opcion=2;
   }else
   if((c>=20)&&(c<50)){
   opcion=3;
   }else
   if((c>=10)&&(c<20)){
   opcion=4;
   }else
   if((c>=5)&&(c<10)){
    opcion=5;
   }else
    if((c>=2)&&(c<5)){
    opcion=6;
    }else
    if((c>=1)&&(c<2)){
    System.out.println("monedas de 1: "+c/1);
    JOptionPane.showMessageDialog(null,"monedas de 1: "+c/1);
    }else
    if(c==0){
        JOptionPane.showMessageDialog(null,"tu cambio es de 0");
    }    
   
   switch(opcion){
       case 1:
       r=c%100; JOptionPane.showMessageDialog(null,"billetes de 100:"+c/100);
       if(r>0){
           
           JOptionPane.showMessageDialog(null,"billetes de 50: "+r/50);
         r=r%50; 
        if(r>0){
        JOptionPane.showMessageDialog(null,"monedas de 20: "+r/20);
        r=r%20;
        if(r>0){
        JOptionPane.showMessageDialog(null,"monedas de 10: "+r/10);
        r=r%10;
        if(r>0){
        JOptionPane.showMessageDialog(null,"monedas de 5: "+r/5);
        r=r%5;
        if(r>0){
        JOptionPane.showMessageDialog(null,"monedas de 2: "+r/2);
        r=r%2;
        if(r>0){
        JOptionPane.showMessageDialog(null,"monedas de 1: "+r/1);
        r=r%1;
        }
        }
        }
        }
        }    
       }
           break;
       case 2:
            JOptionPane.showMessageDialog(null,"billetes de 50: "+c/50);
           r=c%50 ;
            if(r>0){
            
            JOptionPane.showMessageDialog(null,"monedas de 20: "+r/20);
            r=r%20;
            if(r>0){
             JOptionPane.showMessageDialog(null,"monedas de 10: "+r/10);
             r=r%10;
            if(r>0){
                JOptionPane.showMessageDialog(null,"monedas de 5: "+r/5);
                r=r%5;
                if(r>0){
                    JOptionPane.showMessageDialog(null,"monedas de 2: "+r/2);
                    r=r%2;
                    if(r>0){
                        r=r%1;JOptionPane.showMessageDialog(null,"monedas de 1: "+r/1);
                        }
                    }
                }
            }
        }  
           break;
       case 3:
            JOptionPane.showMessageDialog(null,"monedas de 20: "+c/20);
          r=c%20 ;
        if(r>0){
             
             JOptionPane.showMessageDialog(null,"monedas de 10: "+r/10);
             r=r%10;
            if(r>0){
                JOptionPane.showMessageDialog(null,"monedas de 5: "+r/5);
                r=r%5;
                if(r>0){
                    JOptionPane.showMessageDialog(null,"monedas de 2: "+r/2);
                    r=r%2;
                    if(r>0){
                       JOptionPane.showMessageDialog(null,"monedas de 1: "+r/1);
                        r=r%1;
                        }
                    }
                }
            }
           break;
       case 4:
       JOptionPane.showMessageDialog(null,"monedas de 10: "+c/10);
        r=c%10;
        if(r>0){
                
                JOptionPane.showMessageDialog(null,"monedas de 5: "+r/5);
                r=r%5;
                if(r>0){
                    JOptionPane.showMessageDialog(null,"monedas de 2: "+r/2);
                    r=r%2;
                    if(r>0){
                         JOptionPane.showMessageDialog(null,"monedas de 1: "+r/1);
                        r=r%1;
                        }
                    }
                }
           break;
       case 5:
            JOptionPane.showMessageDialog(null,"monedas de 5: "+c/5);
                r=c%5;
                if(r>0){
                    JOptionPane.showMessageDialog(null,"monedas de 2: "+r/2);
                    r=r%2;
                    if(r>0){
                        JOptionPane.showMessageDialog(null,"monedas de 1: "+r/1);
                        r=r%1;
                        }
                    }
                break;
       case 6:
            
             JOptionPane.showMessageDialog(null,"monedas de 2: "+c/2);
                    r=c%2;
                    if(r>0){
                        JOptionPane.showMessageDialog(null,"monedas de 1: "+r/1);
                        
                        r=r%1;
                        }
                    break;
            
   }
     
   }
}
