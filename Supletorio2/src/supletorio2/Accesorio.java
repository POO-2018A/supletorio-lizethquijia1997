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
public class Accesorio {
    
    private String tipo;
    private String color;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Accesorio(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "tipo=" + tipo + ", color=" + color + '}';
    }
    
    
}
