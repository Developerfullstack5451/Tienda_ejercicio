/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;


// Clase abstracta ProductoElectronico
abstract class ProductoElectronico {
    private double precio;
    private String marca;
    private String modelo;

    public ProductoElectronico(double precio, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

// Clase TelefonoMovil que extiende ProductoElectronico
class TelefonoMovil extends ProductoElectronico {
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    public TelefonoMovil(double precio, String marca, String modelo, int capacidadAlmacenamiento, int duracionBateria) {
        super(precio, marca, modelo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
}

// Clase Tableta que extiende ProductoElectronico
class Tableta extends ProductoElectronico {
    private double tamanoPantalla;
    private String resolucionPantalla;

    public Tableta(double precio, String marca, String modelo, double tamanoPantalla, String resolucionPantalla) {
        super(precio, marca, modelo);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucionPantalla = resolucionPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
}

