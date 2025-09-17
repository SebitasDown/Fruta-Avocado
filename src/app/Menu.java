package app;
import javax.swing.*;

import app.service.FrutasService;

public class Menu {

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

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero no una letra");
            }

        } while (option != 6);
        }
        private void crearFruta() {
            Spring nombre = in
        }
    }
}
