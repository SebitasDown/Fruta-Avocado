package app.util;
import javax.swing.JOptionPane;

public class InputRequester {
    // Leer un String que puede estar vacio
    public static String readStringAllowBlank (String mensaje, String pistaOpcional){
        String entrada = JOptionPane.showInputDialog(null,mensaje + (pistaOpcional != null ? pistaOpcional : ""));
        return entrada == null ? "" : entrada.trim();

    }
    // Leer un String que No puede estar vacío
    public static String readString(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);

                entrada = entrada.trim();
            if(entrada.isEmpty()){
                JOptionPane.showMessageDialog(null, "El valor no puede estar vacio");
                continue;
            }
            try {
                Double.parseDouble(entrada);
                JOptionPane.showMessageDialog(null, "no puedes poner un numero");
                continue;
            }catch (NumberFormatException e){
                return entrada;
            }
        }
    }
    public static double readDouble(String mensaje) {
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(mensaje);
            if(s == null || s.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingresa un número");
            }
            double valor = Double.parseDouble(s.trim());

            if (valor > 0){
                return valor;
            }else {
                JOptionPane.showMessageDialog(null, "Debe ser un número mayor a 0");
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.");
            }
        }
    }

    // Manejo de boolean
    public static Boolean readYesNo(String mensaje){

        while(true){
          int respuesta =  JOptionPane.showConfirmDialog(
                    null,
                    mensaje,
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );

            if (respuesta == JOptionPane.YES_OPTION){
                return true;
            }else if (respuesta == JOptionPane.NO_OPTION){
                return false;
            }else{
                JOptionPane.showMessageDialog(null, "Debes elegir Si o No");
            }
        }
    }

}
