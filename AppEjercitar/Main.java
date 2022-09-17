package AppEjercitar;
import javax.swing.JOptionPane;
import AppEjercitar.Persona;
import AppEjercitar.Ejercitar;


public class Main {
    public static void main(String[] args) {
        // Registro de datos de usuario
        String Nombre = JOptionPane.showInputDialog("Bienvenido al programa ejercicios EAN \n" + "Ingrese el nombre de la persona");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona (entre 10 y 90)"));
        float Estatura= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la estatura de la persona (en metros)"));
        float Peso= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la persona (en kilogramos )"));

        Persona Persona1 = new Persona(Nombre, Estatura, Peso, Edad);
        Ejercitar Ejercitar1 = new Ejercitar(Persona1);
        // Menu de opciones
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones Ejercicios EAN Bienvenido:\n"+
            Nombre+"\n"+
            "1. Correr\n"+
            "2. Saltar cuerda\n"+
            "3. Burpees\n"+
            "4. Bicicleta\n"+
            "5. Sentadillas\n"+
            "6. Actualizar peso\n"+
            "7. Indice de masa corporal\n"+
            "8. Historico\n"+
            "9. Salir"));
            switch (opcion) {
                case 1:
                    float T = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de ejercicio (en minutos)"));
                    float Vel = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad de ejercicio (en km/h)"));
                    Ejercitar1.correr(Persona1.getPeso(), T, Vel);
                    break;
                case 2:
                    int saltos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de saltos"));
                    float T0 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de ejercicio (en minutos)"));
                    Float getPeso = Persona1.getPeso();
                    Ejercitar1.satar_cuerda(getPeso, (int) saltos, T0);
                    break;
                case 3:
                    int repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de repeticiones en los Burpees"));
                    float getPeso1 = Persona1.getPeso();
                    float T1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de ejercicio (en minutos)"));
                    Ejercitar1.burpees(getPeso1, repeticiones, T1);
                    break;
                case 4:
                    float T2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de ejercicio (en Horas)"));
                    Ejercitar1.bicicleta(T2);
                    break;
                case 5:
                int repeticiones1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de repeticiones en las Sentadillas"));
                float getPeso2 = Persona1.getPeso();
                float T3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de ejercicio (en minutos)"));
                Ejercitar1.sentadillas(getPeso2, repeticiones1, T3);
                    break;
                case 6:
                    Ejercitar1.actualizarPeso((Float)Ejercitar1.getTCalorias());
                    break;
                case 7:
                    Ejercitar1.imc(Persona1.getPeso(), Persona1.getEstatura());
                    break;
                case 8:
                    Ejercitar1.historico();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa Ejercicios EAN" + "\n" + "Hasta pronto" + "\n" + Nombre);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (opcion != 9);
    }

}
