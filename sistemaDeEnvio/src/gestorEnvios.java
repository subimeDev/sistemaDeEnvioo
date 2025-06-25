/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mati
 */
import java.util.ArrayList;
import java.util.List;

public class GestorEnvios {
    private static GestorEnvios instancia;
    private List<Envio> listaEnvios;

    private GestorEnvios() {
        listaEnvios = new ArrayList<>();
    }

    public static GestorEnvios obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorEnvios();
        }
        return instancia;
    }

    public void agregarEnvio(Envio envio) {
        listaEnvios.add(envio);
    }

    public List<Envio> obtenerEnvios() {
        return listaEnvios;
    }
}
