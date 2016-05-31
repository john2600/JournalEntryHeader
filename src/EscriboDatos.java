
public class EscriboDatos implements handler{

	@Override
	public void process(JournalEntryProcessRequest s) {
		if(s.isVerfyFileExist()){
			System.out.println(" Creo Archivo ");
			System.out.println(" escribo "+s.getSapJournalEntryHeaderRecord());
		}
		System.out.println(" escribo detalle "+s.getSapJournalEntryDetailsRecord());
		
		
	}

}
