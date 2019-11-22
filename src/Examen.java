import javax.swing.*;
public class Examen{
public static void main(String args[]){

    int i, c;
    double suma, promedio, promedio2;
    double notas[][]=new double[4][3];
    String read;

    for (i=0; i<4; i++) {
        suma = 0;
        for (c = 0; c < 3; c++) {
            read = JOptionPane.showInputDialog("Ingresa la calificacion: " + c + "\n del alumno" + i);
            notas[i][c] = Double.parseDouble(read);
            while (notas[i][c] > 20 || notas[i][c] < 5) {
                read = JOptionPane.showInputDialog("Ingresa la calificacion: " + c + "\n del alumno" + i);
            }
            suma = suma + notas[i][c];
        }
        promedio = suma / 3;
        promedio2=promedio/4;
        JOptionPane.showMessageDialog(null, "El alumno tiene un promedio de:" + promedio);
        JOptionPane.showMessageDialog(null, "El promedio general es de: "+ promedio2);
    }

}
}