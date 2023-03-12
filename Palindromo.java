/*
Jesús Rosales Santana.
09-03-2023.
Verificar si una palabra es palídroma o no.
 */

public class Palindromo{//Se crea clase principal.
    public static void main(String[] args) {//Definimos el metodo main para el funcionamiento del programa.
        String palabra = "Rodador";//La palabra a comprobar.

        System.out.println("¿La palabra  " + palabra + "es palindroma?:" + esPalindromo(palabra));//Se muestra por pantalla el resultado.

    }
    public static boolean esPalindromo(String palabra){//Definimos clase para comprobar si es booleano.
        palabra = palabra.toLowerCase();//Convertimos a minusculas.

        for(int i = 0, j = palabra.length() -1; i <= j; i++, j--){//Con el bucle se recorre la palabra de alante a atras y de atras para adelante.
            if (palabra.charAt(i) != palabra.charAt(j)){//La condición que deberia de cumplirse.
                return false;//Si la palabra es distinta retorna falso.
            }
        }
        return true;//Si es verdadera retorna true.
    }
       
}
 
 
