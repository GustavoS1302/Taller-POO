package AppEjercitar;

import javax.swing.JOptionPane;

public class Persona {
    private String Nombre;
    private int Edad;
    private float Estatura;
    private float Peso;
    

    public Persona(String Nombre, float Estatura, float Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }
    public float getEstatura() {
        return Estatura;
    }
    public float getPeso() {
        return Peso;
    }
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        if (Edad >10 && Edad < 90) {
        this.Edad = Edad;
        } else {
            JOptionPane.showMessageDialog(null, "Edad no valida");
        }
    }
}
