
package projetosmaiara;

public class NumerosMultiplosDe5 {
    public static void main(String[] args) {
        
        int numero = 0;
        
        while(numero <= 100){
            if(numero % 5 == 0){
                System.out.println(numero);
            }
            numero++;
        }
    }
}
