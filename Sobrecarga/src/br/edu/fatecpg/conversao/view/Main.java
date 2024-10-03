package br.edu.fatecpg.conversao.view;

import br.edu.fatecpg.conversao.model.Conversor;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Conversor conversor = new Conversor();

        // Converter Celsius para Fahrenheit
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = conversor.converter(celsius);
        System.out.println(celsius + " °C é " + fahrenheit + " °F");

        // Converter quilometros para milhas
        System.out.println("\nDigite a distância em quilometros: ");
        double quilometros = scan.nextDouble();

        double milhas = conversor.converter(quilometros);
        System.out.println(quilometros + " km é " + milhas + " milhas");

        // Converter texto para maiusculo
        System.out.println("\nDigite o texto a ser convertido: ");
        String texto = scan.next();

        String textoMaiusculo = conversor.converter(texto);
        System.out.println("Texto convertido: " + textoMaiusculo);

        scan.close();
	}

}
