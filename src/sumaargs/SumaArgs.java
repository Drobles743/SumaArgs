/*David Tadeo Robles Lara
Sumar y promediar argumentos
29/08/2022
*/
package sumaargs;
public class SumaArgs {
    public static void main(String[] args) {
        

        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.format("suma = %d\n", sum);
        System.out.format("Promedio = %d\n",sum/args.length );


    }
    
}
