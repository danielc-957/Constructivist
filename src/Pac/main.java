package Pac;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class main {
		public static List<String> read(String arquivo){
			List<String> palavras = new ArrayList<String>();
			try {
				Scanner sc = new Scanner(main.class.getResourceAsStream(arquivo));
				while (sc.hasNext()) {
					palavras.add(sc.next().toLowerCase());
				}
//				for(int i = 0; i < palavras.size(); i++) {
//			         System.out.println(palavras.get(i));
//			    }
			}
			catch(NullPointerException e){
				System.out.println("Arquivo não existe\n");
			}
			finally{
				System.out.println("iremos usar o arquivo padrão");
				Scanner sc = new Scanner(main.class.getResourceAsStream("teste.txt"));
				while (sc.hasNext()) {
					palavras.add(sc.next().toLowerCase());
				}
//				for(int i = 0; i < palavras.size(); i++) {
//			         System.out.println(palavras.get(i));
//			    }
			}
			
			return palavras;
		}
		
		
		
		public static List<String> removeStopWords(List<String> palavras){
			List <String> stopWords = new ArrayList<String>();
			List <String> palavrasImportantes = new ArrayList<String>();
			try {
				Scanner sc = new Scanner(main.class.getResourceAsStream("stopWords.txt"));
				while (sc.hasNext()) {
					stopWords.add(sc.next().toLowerCase());
				}
			}
			catch(NullPointerException e){
				System.out.println("Arquivo de Stop words não existe\n");
				return palavras;
			}
			
//				for (int i=0;i<palavras.size();i++){
//					if(remover.contains(palavras.get(i))){
//						System.out.println("mamamamamamma");
//						palavrasImportantes.add(palavras.get(i));
//					}
//					
//				}
//				
//				System.out.println("Tamanho palavras importantes: " + palavrasImportantes.size());
//				
				for(int i = 0; i < stopWords.size(); i++) {
			         System.out.println(stopWords.get(i));
			    }
			
				
			return palavrasImportantes;
		}
		
	
	
	public static void main(String[] args){
		List<String> texto = read("alou.txt	");
		List<String> teste = removeStopWords(texto);
		//List<String> novasPalavras = removeStopWords(texto, stopWords);
	}
}




