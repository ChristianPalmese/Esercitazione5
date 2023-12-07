package Modello;

public class Automobile {
	private int idNumeroTelaio;
	private String modello;
	private String colore;
	private String casaProdutrice;
	private double cilindrata;
	private double prezzo;
	
	
	public Automobile(int idNumeroTelaio, String modello, String colore, String casaProdutrice, double cilindrata, double prezzo) {
		
		this.idNumeroTelaio = idNumeroTelaio;
		this.modello = modello;
		this.colore = colore;
		this.casaProdutrice = casaProdutrice;
		this.cilindrata = cilindrata;
		this.prezzo = prezzo;
	}
	
	public Automobile() {
		
	}
	
	
	
	
	public int getIdNumeroTelaio() {
		return idNumeroTelaio;
	}
	public void setIdNumeroTelaio(int idNumeroTelaio) {
		this.idNumeroTelaio = idNumeroTelaio;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getCasaProdutrice() {
		return casaProdutrice;
	}
	public void setCasaProdutrice(String casaProdutrice) {
		this.casaProdutrice = casaProdutrice;
	}
	public double getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Automobile [idNumeroTelaio=" + idNumeroTelaio + ", modello=" + modello + ", colore=" + colore
				+ ", casaProdutrice=" + casaProdutrice + ", cilindrata=" + cilindrata + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
