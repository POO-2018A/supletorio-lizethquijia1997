/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

/**
 *
 * @author ESFOT
 */
public class Componente {
    private String tipo;
private String capacidad;
private String velocidad;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public Componente(String tipo, String capacidad, String velocidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Componente{" + "tipo=" + tipo + ", capacidad=" + capacidad + ", velocidad=" + velocidad + '}';
    }


}
