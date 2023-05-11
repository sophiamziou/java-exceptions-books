package org.java.books;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi salvare?");
		
		int num = sc.nextInt();
		
		Libro[] libri = new Libro[num];
		
		for (int i = 0; i < libri.length; i++) {
			
			System.out.println("titolo del libro?");
			String titolo = sc.next();
			
			System.out.println("numero delle pagine?");
			int pag = sc.nextInt();
			
			System.out.println("nome dell'editore?");
			String edit = sc.next();
			
			System.out.println("nome dell'autore?");
			String aut = sc.next();

			System.out.println("--------------------");
			
			try {
				Libro l1 = new Libro(titolo, pag, edit, aut);
				libri[i] = l1;
			} catch (Exception e) {
				i--;
				System.err.println("Errore libro " + e.getMessage());
			}
			
		}
		
		FileWriter myWriter = new FileWriter("./librijava.txt");

		for (int i = 0; i < num; i++) {
				
			Libro l = libri[i];
			myWriter.write(l.toString() + "\n");
		}

		myWriter.close();

		File fileLibri = new File("./librijava.txt");
		Scanner reader = new Scanner(fileLibri);

		while (reader.hasNextLine()) {
			
			String line = reader.nextLine();
			System.out.println(line);
			   
		}

		reader.close();
			
		//System.out.println(Arrays.asList(libri));
		sc.close();
	}
}
