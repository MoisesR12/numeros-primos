
package numeros.prim0s;


public class NUMEROSPRIM0S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  function primos(numero, cont, i) {
                numero = parseInt(prompt(«Por favor ingrese un numero»));
                cont = 0;
                for (i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        cont++;
                    }
                }
                if (cont == 2) {
                    alert(+numero + » es un numero primo»);
                } else {
                    alert(+numero + » no es primo»);
                }
            }
            primos(nu, cont, i);
            var nu, cont, i;
            res = prompt(«si desea repetir el algoritmo digite, si de lo contrario digite cuaquier letra»);
            break;
    }
    
}
