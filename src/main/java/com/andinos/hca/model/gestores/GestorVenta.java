package com.andinos.hca.model.gestores;

import com.andinos.hca.model.entity.Venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestorVenta {
    List<Venta> misVentas;
    private static GestorVenta gf;

    public GestorVenta() {
        misVentas= new ArrayList<Venta>();
    }

    public static GestorVenta getInstancia() {
        if(gf == null)
            gf= new GestorVenta();
        return gf;
    }

    public void clear() {
        misVentas= new ArrayList<Venta>();
    }

    public void AddVenta(Date f01) {
        misVentas.add(new Venta(f01));
    }

    public void addVenta(Date fecha, String string) {
        misVentas.add(new Venta(fecha));
    }
}
