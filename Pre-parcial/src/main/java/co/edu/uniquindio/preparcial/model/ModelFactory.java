package co.edu.uniquindio.preparcial.model;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory {

    // Instancia única del singleton
    private static final ModelFactory instancia = new ModelFactory();

    // Datos simulados
    private final List<Recaudador> listaRecaudadores = new ArrayList<>();
    private final List<Vehiculo> listaVehiculos = new ArrayList<>();
    private final List<PasoPeaje> listaPasos = new ArrayList<>();

    // Constructor privado
    private ModelFactory() {
        // Puedes agregar datos de prueba si deseas:
        listaRecaudadores.add(new Recaudador("Juan Pérez", "123", "Peaje Norte", "2025-01-01", 2300000.90));
        listaRecaudadores.add(new Recaudador("Ana López", "456", "Peaje Sur", "2024/5/27", 2560000.90));

        listaVehiculos.add(new Vehiculo("ABC123", "Automóvil", "Carlos Martínez") {
            @Override
            public double calcularPeaje() {
                return 0;
            }

            @Override
            public String descripcionVehiculo() {
                return "";
            }

            @Override
            public TipoVehiculo getTipo() {
                return null;
            }
        });
        listaVehiculos.add(new Vehiculo("XYZ789", "Camión", "María García") {
            @Override
            public double calcularPeaje() {
                return 0;
            }

            @Override
            public String descripcionVehiculo() {
                return "";
            }

            @Override
            public TipoVehiculo getTipo() {
                return null;
            }
        });
    }

    // Acceso a la instancia
    public static ModelFactory getInstance() {
        return instancia;
    }

    // Métodos para acceder y modificar los datos
    public List<Recaudador> getListaRecaudadores() {
        return listaRecaudadores;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public List<PasoPeaje> getListaPasos() {
        return listaPasos;
    }

    public void agregarRecaudador(Recaudador r) {
        listaRecaudadores.add(r);
    }

    public void agregarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    public void registrarPaso(PasoPeaje paso) {
        listaPasos.add(paso);
    }

    public Recaudador buscarRecaudador(String criterio) {
        for (Recaudador r : listaRecaudadores) {
            if (r.getCedula().equalsIgnoreCase(criterio) || r.getNombre().equalsIgnoreCase(criterio)) {
                return r;
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }
}