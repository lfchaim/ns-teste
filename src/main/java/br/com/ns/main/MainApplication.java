package br.com.ns.main;

import br.com.ns.business.StreamVowelFinder;
import br.com.ns.stream.StreamStringImpl;

public class MainApplication {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Fornecer a palavra desejada como parâmetro. Ex: java -cp . br.com.ns.main.MainApplication abeADakAfeci");
            System.exit(0);
        }
        char foundChar = StreamVowelFinder.firstChar(new StreamStringImpl(args[0]));
        if (foundChar != StreamVowelFinder.NOT_FOUND) {
            System.out.println("Caracter encontrado: " + foundChar);
        } else {
            System.out.println("Não foi possível encontrar a vogal. Por favor, tente outra palavra.");
        }
        System.out.println("Args[0]: "+args[0]);
    }
}
