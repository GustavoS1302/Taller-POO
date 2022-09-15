package AppEjercitar;
import javax.swing.JOptionPane;
import AppEjercitar.Persona;

public class Ejercitar {
    private float Ttotal;
    private float TCalorias;
    private Persona personax;

    public Ejercitar(Persona personax) {
        this.personax = personax;
    }
    /*
     * metedos
     * Actualizar peso.
     * Indice de masa corporal.
     */
    public void actualizarPeso(int Calaorias){
        if (TCalorias>=3500){
            personax.setPeso(personax.getPeso()-1);
            TCalorias=0;
        }
    }
    public float imc(float peso, float estatura){
        float IMC = peso/(estatura*estatura);
        if (IMC<18.5f) {
            JOptionPane.showMessageDialog(null,"La persona esta por debajo de su peso normal");
        } else if (IMC>18.5f && IMC<24.9f) {
            JOptionPane.showMessageDialog(null,"La persona esta en su peso normal");
        } else if (IMC>25f && IMC<29.9f) {
            JOptionPane.showMessageDialog(null,"La persona esta por encima de su peso normal");
        } else if (IMC>30f) {
            JOptionPane.showMessageDialog(null,"La persona esta en obesidad");
        }
        return IMC;
    }
    public void correr(float peso, float T, float Vel){
        float dist = (Vel * T)/60;
        float Cal = 1.03f * peso * dist;
        this.TCalorias += Cal;
        this.Ttotal += T;
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
