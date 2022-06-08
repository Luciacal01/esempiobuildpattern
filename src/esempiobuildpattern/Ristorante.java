package esempiobuildpattern;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Date;

public class Ristorante {
	private final String ragioneSociale;
	private final String indirizzo;
	private final String partitaIva;
	private final int numeroDipendenti;
	private final int numeroDiTelefono;
	private final boolean isAperto;
	private final Date dataApertura;
	
	private Ristorante(RisoranteBuilder risoranteBuilder) {
		this.ragioneSociale= risoranteBuilder.ragioneSociale;
		this.indirizzo=risoranteBuilder.indirizzo;
		this.partitaIva=risoranteBuilder.partitaIva;
		this.numeroDiTelefono=risoranteBuilder.numeroDiTelefono;
		this.numeroDipendenti= risoranteBuilder.numeroDipendenti;
		this.isAperto=risoranteBuilder.isAperto;
		this.dataApertura= risoranteBuilder.dataApertura;
	}
	
	
	
	
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}





	public String getIndirizzo() {
		return indirizzo;
	}





	public String getPartitaIva() {
		return partitaIva;
	}





	public int getNumeroDipendenti() {
		return numeroDipendenti;
	}





	public int getNumeroDiTelefono() {
		return numeroDiTelefono;
	}





	public boolean isAperto() {
		return isAperto;
	}





	public Date getDataApertura() {
		return dataApertura;
	}





	public static class RisoranteBuilder{
		private final String ragioneSociale;
		private final String indirizzo;
		private String partitaIva;
		private int numeroDiTelefono;
		private int numeroDipendenti;
		private boolean isAperto;
		private Date dataApertura;
		
		public RisoranteBuilder(String ragioneSociale, String indirizzo) {
			this.ragioneSociale=ragioneSociale;
			this.indirizzo= indirizzo;
		}
		
		public RisoranteBuilder partitaIva(String partitaIva) {
			this.partitaIva=partitaIva;
			return this;
		}
		
		public RisoranteBuilder numeroDiTelefono(int numeroDiTelefono) {
			this.numeroDiTelefono=numeroDiTelefono;
			return this;
		}
		
		public RisoranteBuilder numeroDipendenti(int numeroDipendenti) {
			this.numeroDipendenti= numeroDipendenti;
			return this;
		}
		
		public RisoranteBuilder isAperto(boolean aperto) {
			this.isAperto=aperto;
			return this;
		}
		
		public RisoranteBuilder dataApertura(Date dataApertura) {
			this.dataApertura=dataApertura;
			return this;
		}
		
		public Ristorante build() {
			return new Ristorante(this);
		}
	}
	
	
}
