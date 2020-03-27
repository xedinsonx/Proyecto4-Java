
package proyecto4;

import javax.swing.JOptionPane;


public class PROYECTO4 {

  
    public static void main(String[] args) {
       
        String Alumno;
        int Edad;
        char Sexo;
        double Nota;
        
        Alumno = JOptionPane.showInputDialog("Digite Los Datos Personales: ");
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su Edad: "));
        Sexo = JOptionPane.showInputDialog("Digite un Sexo").charAt(0);
        Nota = Double.parseDouble(JOptionPane.showInputDialog("Digite  su Nota:"));
        
        JOptionPane.showMessageDialog(null,"El Estudiante es: "+Alumno);
        JOptionPane.showMessageDialog(null,"La Edad es: "+Edad);
        JOptionPane.showMessageDialog(null,"El Sexo es: "+Sexo);
        JOptionPane.showMessageDialog(null,"La Nota es: "+Nota);
        
    }
    
}
