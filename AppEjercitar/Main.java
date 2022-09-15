package AppEjercitar;
import javax.swing.JOptionPane;
import AppEjercitar.Persona;
import AppEjercitar.Ejercitar;


public class Main {
    public static void main(String[] args) {
        // Registro de datos de usuario
        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona (entre 10 y 90)"));
        float Peso= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la estatura de la persona (en metros)"));
        float Estatura= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la persona (en kilogramos)"));
        Persona Persona1 = new Persona(Nombre, Edad, Estatura, Peso);
        Ejercitar Ejercitar1 = new Ejercitar(Persona1);
        // Menu de opciones
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones\n"+
            "1. Correr\n"+
            "2. Actualizar peso\n"+
            "3. Indice de masa corporal\n"+
            "4. Historico\n"+
            "5. Salir"));
            switch (opcion) {
                case 1:
                    float T = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de ejercicio (en minutos)"));
                    float Vel = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad de ejercicio (en km/h)"));
                    Ejercitar1.correr(Persona1.getPeso(), T, Vel);
                    break;
                case 2:
                    Ejercitar1.actualizarPeso((int)Ejercitar1.getTCalorias());
                    break;
                case 3:
                    Ejercitar1.imc(Persona1.getPeso(), Persona1.getEstatura());
                    break;
                case 4:
                    Ejercitar1.historico();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }

}
