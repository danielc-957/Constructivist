package Pac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

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
				int size = palavras.size();
			}
			catch(NullPointerException e) {
				System.out.println("Sua lista é invalida");
				return palavrasImportantes;
			}
			
			if(palavras.size() == 0) {
				System.out.println("Seu arquivo estava vazio, no há o que abrir");
				return palavrasImportantes;
			}
			
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
			
			for (int i=0;i<palavras.size();i++){
				if(!stopWords.contains(palavras.get(i))){
					palavrasImportantes.add(palavras.get(i));
				}
				
			}
				
				System.out.println("Tamanho palavras importantes: " + palavrasImportantes.size());
				
				for(int i = 0; i < palavrasImportantes.size(); i++) {
			         System.out.println(palavrasImportantes.get(i));
			    }
			
				
			return palavrasImportantes;
		}
		
		public static HashMap<String, Integer> countFrequency(List<String> palavras){
//				HashMap<String, Integer> frequencia = new HashMap<String, Integer>();
//				
//				for(int i = 0; i < palavras.size(); i++) {
//					if(frequencia.size()==0) {
//						frequecia.put(palavras.get(i),1);
//			         //System.out.println(palavras.get(i));
//			    }
			 // Creates an empty HashMap 
	        HashMap<String, Integer> hmap = new HashMap<String, Integer>(); 
	  
	        // Traverse through the given array 
	        for (int i = 0; i < palavras.size(); i++) { 
	  
	        	String aux = palavras.get(i);
	        	
	        	Integer c = hmap.get(palavras.get(i)); 
	            // If this is first occurrence of element 
	            // Insert the element 
	            if (hmap.get(palavras.get(i)) == null) { 
	                hmap.put(aux, 1); 
	            } 
	  
	            // If elements already exists in hash map 
	            // Increment the count of element by 1 
	            else { 
	                hmap.put(aux, ++c); 
	            } 
	        } 
	  
	        // Print HashMap 
	        System.out.println(hmap); 
					
					
			
				return hmap;
		}
		
	
	
	public static void main(String[] args){
		List<String> teste2 = new ArrayList<String>();
		List<String> texto = read("alou.txt	");
		List<String> teste = removeStopWords(texto);
		HashMap<String, Integer> hmap = countFrequency(teste);
		
		//List<String> novasPalavras = removeStopWords(texto, stopWords);
	}
}




