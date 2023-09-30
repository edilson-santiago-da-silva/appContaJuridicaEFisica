package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Empresarial;
import entities.Individual;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes fiscais: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++ ) {
			System.out.println("Dados do contribuinte #"+ i + ":" );
			System.out.print("Pessoa Individual ou Empresarial (i/e)? ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(c == 'i') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				list.add(new Individual(nome, rendaAnual, gastosSaude)) ;
			}
			else {
				System.out.print("Número de funcionários:");
				int numeroDeFuncionarios = sc.nextInt();
				
				list.add(new Empresarial(nome, rendaAnual, numeroDeFuncionarios));
			}
		}
		System.out.println();
		System.out.println("Impostos Pago:");
		double sum = 0.0;
		
		for(Contribuinte con : list) {
			System.out.println(con.getNome() + ": $ " + String.format("%.2f", con.taxa()));
			sum += con.taxa();
		}
		System.out.println();
		System.out.println("Total de impostos arrecadados: $ " + String.format("%.2f", sum ));
		
		sc.close();
	}
}
