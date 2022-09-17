package AppEjercitar;
import java.text.BreakIterator;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;
import AppEjercitar.Persona;

public class Ejercitar {
    private float Ttotal;
    private float TCalorias;
    private Persona Personax;

    public Ejercitar(Persona Personax) {
        this.Personax = Personax;
    }
    /*
     * metedos
     * Actualizar peso.
     * Indice de masa corporal.
     */
    public void actualizarPeso(Float TCalaorias){
        float Peso = Personax.getPeso();
        float PesoNuevo = Peso - (TCalaorias/3500);
        Personax.setPeso(PesoNuevo);
        JOptionPane.showMessageDialog(null, "El peso de la persona es: "+PesoNuevo); 
    }
    public float imc(float Peso, float Estatura){
        float imc = Peso/(Estatura*Estatura);
        if (imc<=18.5){
            JOptionPane.showMessageDialog(null, "Usted tiene Peso bajo con un IMC de: "+imc);
        } else if (imc>=18.5 && imc<=24.9){
            JOptionPane.showMessageDialog(null, "Usted tiene Peso normal con un IMC de: "+imc);
        } else if (imc>=25 && imc<=29.9){
            JOptionPane.showMessageDialog(null, "Usted tiene Sobrepeso con un IMC de: "+imc);
        } else if (imc>=30 && imc<=34.9){
            JOptionPane.showMessageDialog(null, "Usted tiene Obesidad con un IMC de: "+imc);
        } else {
            JOptionPane.showMessageDialog(null, "Usted tiene Peso bajo con un IMC de: "+imc);
        } 
        return imc;
    }
        
    public void correr(float peso, float T, float Vel){
        float dist = (Vel * T)/60;
        float Cal = 1.03f * peso * dist;
        this.TCalorias += Cal;
        this.Ttotal += T;
    }
    public void satar_cuerda(float peso, int saltos, float T0){
        float Cal = 0.12f * peso * saltos;
        this.TCalorias += Cal;
        this.Ttotal += T0;
    }
    public void burpees(float peso, int repeticiones, float T1){
        float Cal = 0.12f * peso * repeticiones;
        this.TCalorias += Cal;
        this.Ttotal += T1;
    }
    public void bicicleta(float T2){
        float Cal = 300* T2;
        this.TCalorias += Cal;
        this.Ttotal += T2;
    }
    public void sentadillas(float peso, int repeticiones1, float T3){
        float Cal = 0.12f * peso * repeticiones1;
        this.TCalorias += Cal;
        this.Ttotal += T3;
    }
    public void historico(){
        JOptionPane.showMessageDialog(null,"El tiempo total de ejercicio es de: "+this.Ttotal+" minutos\n"+
        "La persona a quemado un total de: "+this.TCalorias+" Calorias");
    }
    public float getTtotal() {
        return Ttotal;
    }
    public void setTtotal(float ttotal) {
        Ttotal = ttotal;
    }
    public float getTCalorias() {
        return TCalorias;
    }
    public void setTCalorias(float tCalorias) {
        TCalorias = tCalorias;
    }
}
