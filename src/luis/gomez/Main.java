package luis.gomez;


import java.util.Scanner;

public class Main {


    public static boolean esCapicua (String numero) {

        int n = Integer.parseInt(numero);

        boolean result = false;

        if (numero.length() == 2){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
            }
            else {
            }
        }

        if (numero.length() == 3){
            if (numero.charAt(0)==numero.charAt(2)){ //Aqui he rectificado el valor 1 por un 2, ya que para numeros de 3 cifras, queremos que compare la primera cifra (0) y la ultima (2)
                result = true;
            }
            else {
            }
        }

        return result;
    }



    public static boolean esPar (String numero){

        int n = Integer.parseInt(numero);

              if (n%2==0){
            return true;

        } else {
            return false;
        }
    }

    public static boolean esDivisiblePorTres (String numero){
        int n = Integer.parseInt(numero);

        if (n%3==0){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        // Abro Scanner para introducir numero con teclado

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero entero");

        // obtengo el valor del nuemro introducido por teclado
        String numero=sc.next();


        //Si el número tiene 2 o 3 cifras, llamamos al metodo esCapicua
        if(numero.length()==2 || numero.length()==3){

        // Ahora uso este formato para obtener el resultado del metodo, se trata de poner a la hora de imprimir,
        // el metodo y entre parentesis el nombre de la variable que va a usar para hacer el metodo, seguido de una interrogacion,
        // despues, seguido de comillas y entre comillas ponemos
        // el texto que queremos que aparezca si el metodo devuelve un true, despues ponemos 2 puntos
        // y seguido y entre comillas el texto para cuando el metodo devuelva false
        System.out.println((esCapicua(numero)?"El numero es capicúa":"El número no es capicúa"));
        }

        //Si el número  tiene tres o mas cifras, llamamos al metodo esPar
        if(numero.length()>=3){
            System.out.println((esPar(numero)?"El numero es par":"El numero es no es par"));
        }

        //Si el número tiene una cifra, llamamos al metodo esDivisiblePorTres
        if (numero.length()==1){
            System.out.println((esDivisiblePorTres(numero)?"El numero es divisible por 3":"El numero no es divisible por 3"));
        }
        //Cerramos el Scanner
        sc.close();


    }
}
