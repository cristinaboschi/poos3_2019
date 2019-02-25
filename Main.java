/*
 * Cristina, observe que como usou o eclipse ou netbeans para programar foi definido um 
 * pacote (triangulopoo), por isso, seu sistema não funciona da forma que está.
 *
 * Evite utilizar interação com o usuário em suas classes de negócio, nesse exercício você 
 * usou JOptionPane na classe TrianguloPoo, isso implica que se eu desejar utilizar sua classe
 * em outro tipo de aplicação não será possível. Lembre-se sempre da portabilidade.
 *
 * De forma geral o programa resolve o problema.
 * 
 * Nota 10,0
 */
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
