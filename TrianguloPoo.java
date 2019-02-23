
package triangulopoo;

import javax.swing.JOptionPane;

public class TrianguloPoo {
    private int lado1;
    private int lado2;
    private int lado3;
    
public void calcularTipo(){
   
      if (this.getLado1() < this.getLado2() + this.getLado3() && this.getLado2() < this.getLado1() + this.getLado3()&& 
              this.getLado3() < this.getLado1()+ this.getLado2()){
            if (this.getLado1() == this.getLado2() && this.getLado2()== this.getLado3()){
            JOptionPane.showMessageDialog(null,"Triangulo Equilatero");
            }else
             if (this.getLado1() == this.getLado2() && this.getLado2() != this.getLado3() || 
                     this.getLado1() == this.getLado3() && this.getLado3() != this.getLado2() ||
                     this.getLado3() == this.getLado2() && this.getLado2() != this.getLado3()){
             JOptionPane.showMessageDialog(null,"Triangulo Isosceles");
               }else
              if (this.getLado1() != this.getLado2() && this.getLado2() != this.getLado3()) {
                   JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
               }        
      }
       JOptionPane.showMessageDialog(null,"Não forma triângulo");
   }
        
 
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
        if(lado1<0){
             JOptionPane.showMessageDialog(null,"Esse valor não existe será considerado como 0");
             this.lado1=0;
        }
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
         if(lado2<0){
             JOptionPane.showMessageDialog(null,"Esse valor não existe será considerado como 0");
             this.lado2=0;
        }
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
         if(lado3<0){
             JOptionPane.showMessageDialog(null,"Esse valor não existe será considerado como 0");
             this.lado3 = 0;
        }
    }

   
    
}
