public class Operadores {
    
    public static void main (String[] args){
        int numero = 5;

        numero = - numero; //um jeito de deixar o numero negativo 

       // System.out.println(- numero);
        System.out.println(numero);

        //Incremento

        int incremento = 5;

        incremento ++;
        // mesmo conceito acima
        //(incremento = incremento + 1;) ou System.out.println(++ incremento);
        
        System.out.println(incremento);

        //Para decrementar
        incremento --;

        System.out.println(incremento);





        // BooLean é o valor de verdadeiro e falso (true / false)

        boolean variavel = true;

        variavel = !variavel;   //Melhor forma para alterar o valor

       // System.out.println(!variavel); 
        //O simbolo ' ! '  inverte o valor.

        System.out.println(variavel);
        //valor original continua o mesmo sendo impresso sem o simbolo.




        //Ternario
        int valor1, valor2;

        valor1 = 5;
        valor2 = 5;

        String resultado = valor1==valor2 ?"verdadeiro" : "falso";
        // int resultado = valor1==valor2 ? 1 : 2; (para valores inteiros)
        
        //Isso é uma expressão booleana (similar ao if / else)

       /* String resultado = "";  (Modo if e else)
        
        if (valor1==valor2)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        
        System.out.println(resultado);


    }
}
