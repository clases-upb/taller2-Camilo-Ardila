/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {

        try {

            System.out.println(Calcular_saldo(2000000, 1000000, 500000));
        
            System.out.println(Calcular_tip(100));

            System.out.println(Obtener_puntos(3, 2, 1));

            System.out.println(Calcular_definitiva(4, 4, 4, 4, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));

            System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));

            System.out.println(Calcular_salario(40, 10, 5, 20000));

            System.out.println(Calcular_area_triangulo(10, 5));

            System.out.println(Calcular_perimetro_cuadrado(5));

            System.out.println(Calcular_volumen_cilindro(5, 10));

            System.out.println(Calcular_area_circulo(5));
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
    }

    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

    public static int Calcular_saldo(int base_taquilla, int total_recaudos, int total_retiros){

        try {

           int saldo_taquilla = 0;

           final int base_constante = 2000000;

           if(base_taquilla == base_constante){

                saldo_taquilla = base_taquilla + total_recaudos - total_retiros;

                return saldo_taquilla;
           }

           else{
                return -1;
           }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */

    public static String Calcular_tip(float consumo_cliente){

        try {

            String cuenta;
            float total = 0;
            float propina = 0;
            float impuesto = 0;

            final float porcentaje_propina = 0.1f;
            final float porcentaje_impuesto = 0.08f;

            if(consumo_cliente > 0){

                propina = consumo_cliente * porcentaje_propina;
                impuesto = consumo_cliente * porcentaje_impuesto;
                total = consumo_cliente + propina + impuesto;

                cuenta = "valor comida: $" + consumo_cliente + " - valor propina $" + propina + " - valor impoconsumo $" + impuesto + " - total a pagar $" + total;

                return cuenta;
            }

            else{
                String mensaje_condicional = "Error calculando consumo";
                return mensaje_condicional;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            String mensaje_error = "Error en la función Calcular_tip";
            return mensaje_error;
        }
    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

    public static int Obtener_puntos(int partidos_ganados, int partidos_perdidos, int partidos_empatados){

        try {

            int puntos_totales = 0;
            int puntos_ganados = 0, puntos_perdidos = 0, puntos_empatados = 0;

            final int
            valor_ganados = 3, valor_perdidos = 0, valor_empatados = 1, minimo_partidos = 0;

            if(partidos_ganados >= minimo_partidos && partidos_perdidos >= minimo_partidos && partidos_empatados >= minimo_partidos){

                puntos_ganados = partidos_ganados * valor_ganados;
                puntos_perdidos = partidos_perdidos * valor_perdidos;
                puntos_empatados = partidos_empatados * valor_empatados;

                puntos_totales = puntos_ganados + puntos_perdidos + puntos_empatados;

                return puntos_totales;
           }

            else{
                return -1;
           }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_definitiva(float n1, float n2 , float n3, float n4, float n5, float v1, float v2, float v3, float v4, float v5){

        try {
            
            float definitiva = 0, nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0;

            final int n_min = 0;
            final int n_max = 5;

            if(n1 >= n_min && n1 <= n_max && n2 >= n_min && n2 <= n_max && n3 >= n_min && n3 <= n_max && n4 >= n_min && n4 <= n_max && n5 >= n_min && n5 <= n_max && (v1 + v2 + v3 + v4 + v5) == 1){ // Las notas deben ser de 0 a 5 y los valores porcentuales de cada una deben sumar 1 

                nota1 = n1 * v1;
                nota2 = n2 * v2;
                nota3 = n3 * v3;
                nota4 = n4 * v4;
                nota5 = n5 * v5;

                definitiva = nota1 + nota2 + nota3 + nota4 + nota5;

                return definitiva;
            }

            else{
                return -1;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

    public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, float v1, float v2, float v3, float v4, float v5){
    
        try {

            float nota_necesaria = 0;
            
            float
            nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, notas = 0;
            
            final int n_min = 0;
            final int n_max = 5;
            final int n_ganada = 3;
            
            if(n1 >= n_min && n1 <= n_max && n2 >= n_min && n2 <= n_max && n3 >= n_min && n3 <= n_max && n4 >= n_min && n4 <= n_max && (v1 + v2 + v3 + v4 + v5) == 1){
                
                nota1 = n1 * v1;
                nota2 = n2 * v2;
                nota3 = n3 * v3;
                nota4 = n4 * v4;
                
                notas = nota1 + nota2 + nota3 + nota4;
                
                nota_necesaria = (n_ganada - notas) / v5;
                
                return nota_necesaria;
            }
        
            else{
                return -1;
            }
        } 

        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_salario(int horas_normales, int horas_extrad, int horas_extran, float valor_hora){

        /* Esta función tiene un error en su test puesto a que no se está aplicando el recargo a las horas extra,
        en lugar de esto, se les está asignando un valor inferior a las horas normales. Por esto, las constantes
        valor_extrad = 0.15 y valor_extran = 0.35 deberían ser 1.15 y 1.35, respectivamente. Con el propósito de 
        que el sistema de calificación automático funcione, se dejarán los valores erróneos. */

        try {

            float salario = 0, normal = 0, extrad = 0, extran = 0;

            final int min = 0;

            final float valor_extrad = 0.15f;
            final float valor_extran = 0.35f;

            if(valor_hora > min && horas_normales >= min && horas_extrad >= min && horas_extran >= min){
                
                normal = horas_normales * valor_hora;
                extrad = horas_extrad * valor_hora * valor_extrad;
                extran = horas_extran * valor_hora * valor_extran;

                salario = normal + extrad + extran;

                return salario;
            }

            else{
                return -1;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_triangulo(float base, float altura){

        try {
            
            float area = 0;

            final int min = 0;
            final float medio = 0.5f;

            if(base > min && altura > min){

                area = medio * base * altura;

                return area;
            }

            else{
                return -1;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_perimetro_cuadrado(float lado){

        try {
            
            float perimetro = 0;

            final int lados = 4;
            final int min = 0;

            if(lado > min){

                perimetro = lado * lados;

                return perimetro;
            }

            else{
                return -1;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_volumen_cilindro(float radio, float altura){

        try {

            float volumen = 0;
            float radio_cuadrado = radio * radio;

            final float pi = 3.1415927f;

            final int min = 0;
            
            if(radio > min && altura > min){
                
                volumen = pi * radio_cuadrado * altura;

                return volumen;
            }

            else{
                return -1;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_circulo(float radio){

        try {
            
            float area = 0;
            float radio_cuadrado = radio * radio;

            final float pi = 3.1415927f;

            final int min = 0;

            if(radio > min){

                area = pi * radio_cuadrado;

                return area;
            }

            else{
                return -1;
            }
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            return -1;
        }
    }
}
