import java.util.Scanner;

/**
 * EstRepetitive
 */
//comenta una sola linea
public class EstRepetitive {
    //objeto de un teclado
    static Scanner objTeclado=new Scanner(System.in);//Permite leer varibles
    /*Inicio a, b son atributos o varibles, pero varibles glovales*/ 
    static int a=10;
    static double b=5;
    /*Fin  a, b son atributos o varibles, pero varibles glovales*/

    /*Estos son metodos*/    
    public static void saludo() {
        System.out.print("Ingrese su Nombre:"); 
        String nombre=objTeclado.next();  //leer nombre
        System.out.println("Hola: "+nombre+ " ¿Como estas?");   
        System.out.println("suma:"+ (a+b) );   
    } 

    public void saludo2() {
        System.out.print("Ingrese su Nombre:"); 
        String nombre=objTeclado.next(); //leer nombre
        System.out.println("Hola: "+nombre+ " ¿Como estas?");      
    }
    
    public static void suma10numerosmientras() {
        //declarar variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //Datos de Entrada y proceso
        while(contador<=10){
            System.out.println("Ingrese el valor de la posiscion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;

        }
        System.out.println("la suma delos 10 numeros es:"+sumaNumeros);
        
    }

    public static void suma10numeroshacermientras() {
        //declarar variables
        double numeros, sumaNumeros=0;
        int contador=1;
        //Datos de Entrada y proceso
        do{
            System.out.println("Ingrese el valor de la posiscion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;
        }
        while(contador<=10);
        System.out.println("la suma delos 10 numeros es:"+sumaNumeros);
        
    }

    public static void suma10numerospara() {
        //declarar variables
        double numeros, sumaNumeros=0;
        
        //Datos de Entrada y proceso
        for(int contador=1;contador<=10;contador++){
            System.out.println("Ingrese el valor de la posiscion "+contador+":");
            numeros=objTeclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            
        }        
        System.out.println("la suma delos 10 numeros es:"+sumaNumeros);
        
    }

    public static void main(String[] args) {
      //suma10numeros();
      //suma10numeroshacermientras();
      suma10numerospara();
    }
    
}