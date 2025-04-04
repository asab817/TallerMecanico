package org.iesalandalus.programacion.tallermecanico.vista;

import java.util.HashMap;
import java.util.Map;

public enum Opcion {

    INSERTAR_CLIENTE(1, "Insertar Cliente"),
    BUSCAR_CLIENTE(2, "Buscar Cliente"),
    BORRAR_CLIENTE(3, "Borrar Cliente"),
    LISTAR_CLIENTES(4, "Listar Clientes"),
    MODIFICAR_CLIENTE(5, "Modificar Cliente"),
    INSERTAR_VEHICULO(6, "Insertar Vehículo"),
    BUSCAR_VEHICULO(7, "Buscar Vehículo"),
    BORRAR_VEHICULO(8, "Borrar Vehículo"),
    LISTAR_VEHICULOS(9, "Listar Vehículos"),
    INSERTAR_REVISION(10, "Insertar Revisión"),
    BUSCAR_REVISION(11, "Buscar Revisión"),
    BORRAR_REVISION(12, "Borrar Revisión"),
    LISTAR_REVISIONES(13, "Listar Revisiones"),
    LISTAR_REVISIONES_CLIENTE(14, "Listar Revisiones Cliente"),
    LISTAR_REVISIONES_VEHICULO(15, "Listar Revisiones Vehículo"),
    ANADIR_HORAS_REVISION(16, "Añadir Horas Revisión"),
    ANADIR_PRECIO_MATERIAL_REVISION(17, "Añadir Precio_Material Revisión"),
    CERRAR_REVISION(18, "Cerrar Revisión"),
    SALIR(0, "Salir");

    private int numeroOpcion;
    private String mensaje;

    private static final Map<Integer, Opcion> opcionesPorNumero = new HashMap<>();

    static {
        for (Opcion opcion : Opcion.values()) {
            opcionesPorNumero.put(opcion.numeroOpcion, opcion);
        }
    }

    Opcion(int numeroOpcion, String mensaje) {
        this.numeroOpcion = numeroOpcion;
        this.mensaje = mensaje;
    }

    public int getNumeroOpcion() {
        return numeroOpcion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public static boolean esValida(int numeroOpcion) {
        return opcionesPorNumero.containsKey(numeroOpcion);
    }

    public static Opcion get(int numeroOpcion) {
        if (!esValida(numeroOpcion)) {
            throw new IllegalArgumentException("El número de opción " + numeroOpcion + " no es válido.");
        }
        return opcionesPorNumero.get(numeroOpcion);
    }

    @Override
    public String toString() {
        return numeroOpcion + ".- " + mensaje;
    }
}
