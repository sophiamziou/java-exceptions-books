package org.java.books;

public class Libro {
	
	private String titolo;
	private int pagine;
	private String editore;
	private String autore;

	public Libro(String titolo, int pagine, String editore, String autore) throws Exception {
		setAutore(autore);
		setEditore(editore);
		setPagine(pagine);
		setTitolo(titolo);
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws Exception {
		
		if (titolo.isEmpty()) {
			throw new Exception("il titolo è obbligatorio");
		}
		this.titolo = titolo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) throws Exception {
		this.pagine = pagine;
		if (pagine <= 0) {
			throw new Exception("le pagine devono essere maggiori di zero");
		}
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		this.autore = autore;
		
		if (autore.isEmpty()) {
			throw new Exception("l'autore è obbligatorio");
		}
	}
		
	@Override
	public String toString() {
        return
        		"\n titolo= " + getTitolo() +
                "\n numero pagine= " + getPagine() +
                "\n editore= "+ getEditore() +
                "\n autore= " + getAutore() + 
                "\n";
	}
}
