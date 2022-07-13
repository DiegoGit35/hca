package com.andinos.hca.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "carrito")
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "carrito", fetch = FetchType.LAZY)
    private Set<ItemProducto> itemProductos;

    @ManyToOne
    @JoinColumn(name="idusuario", nullable=false)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ItemProducto> getItemProductos() {
        return itemProductos;
    }

    public void setItemProductos(Set<ItemProducto> itemProductos) {
        this.itemProductos = itemProductos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idventa")
    private Venta venta;



    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
