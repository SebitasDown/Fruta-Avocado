package app.service;

import app.model.Frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class FrutasService {
    private final ArrayList<Frutas> frutas = new ArrayList<>();

    // Crear fruta
    public Frutas crear(Frutas fruta) {
        frutas.add(fruta);
        return fruta;
    }

    // Listal las frutas de forma segura
    public List<Frutas> getFrutas() {
        return new ArrayList<>(frutas);
    }

    // Buscar por id
    public Frutas BucarPorId(int id) {
        for (Frutas fruta : frutas) {
            if (fruta.getId() == id) {
                return fruta;
            }
        }
        return null;
    }

    // Buscar nombre parcial de la fruta

    public Optional<Frutas> buscarPorNombre(String nombreParcial) {
        if (nombreParcial == null || nombreParcial.trim().isEmpty()) {
            return Optional.empty();
        }
        for (Frutas f : frutas) {
            if (f.getNombre().toLowerCase().contains(nombreParcial.toLowerCase())) {
                return Optional.of(f);
            }
        }

        return Optional.empty();
    }

}