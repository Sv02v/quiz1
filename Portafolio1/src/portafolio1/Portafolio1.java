/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Portafolio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Una empresa necesita determinar el monto total que debe pagar a la Caja Costarricense del
Seguro Social (CCSS). Para esto, se requiere un programa que calcule dicho monto basado en el
salario de N empleados. El programa debe solicitar la cantidad de empleados, así como los
salarios individuales, y calcular el monto total a pagar aplicando los siguientes rubros:
         */
        JOptionPane.showMessageDialog(null, "Bienvenido a la empresa");
        String empleados = JOptionPane.showInputDialog("Digite la cantidad de empleados de la empresa"); //se pide la cantidad de empleados para el programa
        int cEmpleados = Integer.parseInt(empleados); //convertimos el string "empleados" a un int llamado "cEmpleados"
        double montoT = 0;//le asignamos un valor de 0 a montoT que sera el montototal a futuro 
        for (int i = 0; i < cEmpleados; i++) { //realizamos un for que nos pregunte los salarios de los empleados
            String salario = JOptionPane.showInputDialog("Digite los salarios de los empleados");// lo que hacemo es solucitar el salario 
            double salarioB = Double.parseDouble(salario);//convertimos el valor String de salario a uno double para poder hacer calculos con el 
            double ivm = salarioB * 0.0508; //Realizamos la operacion de IVM(invalidez,Vejez,Muerte) 
            double sem = salarioB * 0.0925;//Realiazmos la operacion del SEM(Seguro de Enfermedad y Maternidad)
            montoT += + sem + ivm; //Hacemos la suma del monto total
        }
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de " + montoT + "por concepto de SEM y IVM");
        //Por ultimo lo que hacemos es darle al usuario la informacion de cuanto va a abonar la empresa a la ccss
    }
}
