package ClasesJava;

/**
 *
 * @author villa
 */

public class Procesos {
    //Realizar un método que devuelva la suma de dos numeros para despues llamarlo en el programa principal.
    //El metodo debe tener el nombre *sumar*
    //Debe recibir dos parametros de tipo flotante
public float sumar(float a, float b){
    return a+b;
}
    public static void main(String[] args) {
        float a=2,b=3,r;
        r=Float.sum(a,b);
        System.out.println(r);
    }
}
