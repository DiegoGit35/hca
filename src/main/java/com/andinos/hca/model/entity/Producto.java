package com.andinos.hca.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="producto")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproducto;

    @NotEmpty
    private String nombre;
    @NotEmpty
    private float precio;

    @NotEmpty
    private Enum estado;
    @NotEmpty
    private int category_id;
    @NotEmpty
    private int stock;
    @NotEmpty
    private String imagen;

    @NotEmpty
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "create_time")
    private Date fechaYhora;
    @NotEmpty
    private String descripcion;

    public Producto(int idproducto, String nombre, float precio, Enum estado, int category_id, int stock, String imagen, Date fechaYhora, String descripcion) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.category_id = category_id;
        this.stock = stock;
        this.imagen = imagen;
        this.fechaYhora = fechaYhora;
        this.descripcion = descripcion;
    }

    public Producto() {

    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(Date fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
