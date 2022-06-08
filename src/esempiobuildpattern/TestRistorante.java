package esempiobuildpattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestRistorante {
	public static void main(String[] args) throws Exception {
		Date datApertura= new SimpleDateFormat("dd-MM-yyyy").parse("23-12-2021");
		Ristorante ristorante1= new Ristorante.RisoranteBuilder("Foglia", "Via mosca 62, Roma").partitaIva("gh2879812").numeroDiTelefono(333456).numeroDipendenti(8).isAperto(false).dataApertura(datApertura).build();
		System.out.println(ristorante1.getRagioneSociale()+" "+ ristorante1.getDataApertura());
		
		Ristorante ristorante2= new Ristorante.RisoranteBuilder("Giglio", "Via Antonio Bosio 34, Roma").partitaIva("HJK6271").numeroDiTelefono(23).isAperto(true).build();
		System.out.println(ristorante2.getRagioneSociale()+" "+ristorante2.getDataApertura());
	}
}
