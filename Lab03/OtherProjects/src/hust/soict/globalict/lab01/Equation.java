package hust.soict.globalict.lab01;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Equation{
    static void linearEquation(){
        String s1,s2;
        JOptionPane.showMessageDialog(null,"ax + b =0","Input",JOptionPane.INFORMATION_MESSAGE);
        s1=JOptionPane.showInputDialog(null,"Enter a: ","Input",JOptionPane.INFORMATION_MESSAGE);
        double a= Double.parseDouble(s1);
        s2=JOptionPane.showInputDialog(null,"Enter b: ","Input",JOptionPane.INFORMATION_MESSAGE);
        double b= Double.parseDouble(s2);
        JOptionPane.showMessageDialog(null,
                "Solution: " + (-b/a),
                "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
    static void linearSystem(){
        double[][] a = new double[2][2];
        double[] b = new double[2];

        for(int i = 0; i < 2;i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null,
                        "a11x1 + a12x2 = b1\na21x1 + a22x2 = b2" + "\nInput a" + (i + 1) + "" + (j + 1),
                        null,
                        JOptionPane.INFORMATION_MESSAGE);
                a[i][j] = Double.parseDouble(input);

            }
            String input = JOptionPane.showInputDialog(null,
                    "a11x1 + a12x2 = b1\na21x1 + a22x2 = b2" + "\nInput b" + (i + 1) ,
                    null,
                    JOptionPane.INFORMATION_MESSAGE);
            b[i] = Double.parseDouble(input);
        }

        double[] d= new double[3];
        d[0] = a[0][0]*a[1][1] - a[0][1]*a[1][0];
        d[1] = b[0]*a[1][1] - b[1]*a[0][1];
        d[2] = a[0][0]*b[1] - b[0]*a[1][0];
        if(d[0] != 0){
            JOptionPane.showMessageDialog(null,
                    "The system has a unique solution: " + "x1 = " + (d[1]/d[0]) +
                            ", " +"x2 = " + (d[2]/d[0]),
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if((d[1] == 0) && (d[2] == 0)){
                JOptionPane.showMessageDialog(null,
                        "The system has infinitely many solutions",
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "The system has no solution",
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    static void secondEquation(){
        JOptionPane.showMessageDialog(null,"ax^2 + bx +c =0","Input",JOptionPane.INFORMATION_MESSAGE);
        String s1= JOptionPane.showInputDialog(null, "Enter a: ","Input",JOptionPane.INFORMATION_MESSAGE);
        double a= Double.parseDouble(s1);
        String s2= JOptionPane.showInputDialog(null, "Enter b: ","Input",JOptionPane.INFORMATION_MESSAGE);
        double b= Double.parseDouble(s2);
        String s3= JOptionPane.showInputDialog(null, "Enter c: ","Input",JOptionPane.INFORMATION_MESSAGE);
        double c= Double.parseDouble(s3);
        double delta = Math.pow(b,2)- 4 * a * c;
        if(delta == 0){
            double root = -b/(2 * a);
            JOptionPane.showMessageDialog(null,
                    "The equation has double root: x1 = x2 =" + root,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }else if(delta > 0){
            double root1 = (- b + Math.sqrt(delta))/(2 * a);
            double root2 = (- b - Math.sqrt(delta))/(2 * a);
            JOptionPane.showMessageDialog(null,
                    "The equation has two distinct roots: " +
                            "x1 = " + root1 + " and " +" x2 = " +root2,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "The equation has no solution",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args){
        String choice;
        choice = JOptionPane.showInputDialog(null,
                "Enter choice: \n1.Solve first-degree equation\n2.Solve system of first-degree equations\n3.Solve second-degree equation\n4.Exit",
                "Menu",
                JOptionPane.INFORMATION_MESSAGE);
        int a= Integer.parseInt(choice);
        switch (a) {
            case 1:
                linearEquation();
                break;

            case 2:
                linearSystem();
                break;
            case 3:
                secondEquation();
                break;
            case 4:
                System.exit(0);
        }
    }
}
