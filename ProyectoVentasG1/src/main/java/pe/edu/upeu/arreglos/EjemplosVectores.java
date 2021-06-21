package pe.edu.upeu.arreglos;
import java.util.Scanner;

public class EjemplosVectores {





    public static void conceptosVectores(){
        //Definire un vector
        int[] vectorX;
        int []vectorY;
        //Definir tamanho de un vector
        vectorX=new int[2];
        vectorX[0]=20; //[0]indice7posiscion
        vectorX[1]=8;  //[1]indice7posiscion

        vectorY=new int[3];
        vectorY[0]=20; //[0]indice7posiscion
        vectorY[1]=8;  //[1]indice7posiscion
        vectorY[2]=15; //[3]indice7posiscion

        System.out.println("imprimiendo valores del vector");
        System.out.println("X = "+vectorX[0]); //imprimiendo valor o elemento del vector vectorX[0]
        System.out.println("Y = "+vectorY[0]); //imprimiendo valor o elemento del vector vectorX[0]
        //Asignando valores directos a un vector
        int[] vA={1,2,3,4,5,6,7,8,9,10};
        int[] vB=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,15};
        //Conocer el tamaño de un vector
        System.out.println("Tamaño del vector A = "+ vA.length);
        System.out.println("Tamaño del vector B = "+ vB.length);
    }

    public static void mostrarValores(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]= "+vector[i]+"    Su indice es: "+i+"   Su valor es: "+vector[i]);
        }

    }

    public static int[] rellenarVector(int tv){
        int[] vector=new int[tv]; 
        Scanner cs=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el valor del indice  "+i+"");
            vector[i]=cs.nextInt();
            System.out.println("");
            
        }
        mostrarValores(vector);

        return vector;
    }

    public static void masEjemplosVectores(){
        double[] vectorA={1,2.5,3.6,4.8,5.2,6.8,7,8,9,10};
        System.out.println("Tamanho del vectorA es:"+vectorA.length);
        String[] vectorB={"A","A","A","A","A","2.5","B","B"};
        System.out.println("Tamanho del vectorB es:"+vectorB.length);
        Object[] vectorC={"A",1,2,2.5,"D",11,3.6,"F",true};
        System.out.println("Tamanho del vectorC es:"+vectorC.length);
        char[]  vecX={'/','*','A','-','+'};
        System.out.println("Tamanho del vecX es:"+vecX.length);
    }


    public static void main(String[] args) {
         conceptosVectores();
         System.out.println("Ejercicio 1");
        rellenarVector(10);
        masEjemplosVectores();
    }

}

