package app;
import javax.swing.JOptionPane;
import app.util.InputRequester;

import app.model.Frutas;
import app.service.FrutasService;
import app.util.InputRequester;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private FrutasService service = new FrutasService();

    public Menu() {
        int option = 0;
        do {
            String menu = """
                    ===========================
                           🍎 MENÚ FRUTAS 🍌
                    ===========================
                    1. Crear fruta
                    2. Listar todas las frutas
                    3. Buscar fruta (por ID o nombre parcial)
                    4. Actualizar fruta (modificar atributos)
                    5. Eliminar fruta (por ID)
                    6. Salir
                    ---------------------------
                    Seleccione una opción: 
                    """;

            String input = JOptionPane.showInputDialog(menu);

            if (input == null) {
                break;
            }
            try {
                option = Integer.parseInt(input);
                switch (option) {
                    case 1:
                        crearFruta();
                        break;
                    case 2:
                        listarFrutas();

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero no una letra");
            }

        } while (option != 6);
    }

    private void crearFruta() {
        String nombre = InputRequester.readString("Nombre: ");
        double peso = InputRequester.readDouble("Peso en Kg: ");
        String color = InputRequester.readString("Color: ");
        double precio = InputRequester.readDouble("Precio: ");
        boolean esOrganica = InputRequester.readYesNo("¿Es organica?");
        Frutas f = new Frutas(nombre, color, peso, precio, esOrganica);
        service.crear(f);
    }

    private void listarFrutas(){
        List<Frutas> nuevasFrutas = service.getFrutas();
        StringBuilder s = new StringBuilder("----Listado De frutas-----");
        nuevasFrutas.forEach(fruta -> s.append(fruta).append("\n"));
        JOptionPane.showMessageDialog(null,s.toString());
    }
}


