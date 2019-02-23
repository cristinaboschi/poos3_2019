
package triangulopoo;

import javax.swing.JOptionPane;


public class Main {
     public static void main(String[] args) {
    TrianguloPoo p1 = new TrianguloPoo();
    
   
  p1.setLado1(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor X:  ")));
  p1.setLado2(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor y:  ")));
  p1.setLado3(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor z:  ")));
  p1.calcularTipo();
    }
    
}
