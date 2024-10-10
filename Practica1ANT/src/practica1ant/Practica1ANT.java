/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1ant;

import javax.swing.JOptionPane;

/**
 *
 * @author tamar
 */
public class Practica1ANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar la cantidad de empleados

        int cantEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));

        //Variable SEM Y IVT
        double totalSEM = 0;
        double totalIVM = 0;

        // Solicitar el salario por empleado
        for (int i = 1; i <= cantEmpleados; i++) {
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado #" + i + ":"));

            // Calcular SEM e IVM
            double SEM = salario * 0.0925;
            double IVM = salario * 0.0508;

            totalSEM += SEM;
            totalIVM += IVM;
        }

        // Calcular total de la caja
        double totalPagar = totalSEM + totalIVM;

        // Mensaje final
        String mensajeFinal = String.format("Su empresa deberá abonar a la CCSS un monto de " + totalPagar + " colones por concepto de SEM y IVM.");
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}

