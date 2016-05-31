


public class HeaderTest {
	public static void main(String [] args){
		HeaderContentManager header = new HeaderContentManager();
		Detail detail = new Detail();
		EscriboDatos datos = new EscriboDatos();
		JournalEntryProcessRequest je = new JournalEntryProcessRequest();
		
		je.setVerfyFileExist(true);
		header.process(je);
		detail.process(je);
		datos.process(je);
		
		je.setVerfyFileExist(false);
		header.process(je);
		detail.process(je);
		datos.process(je);
		
		je.setVerfyFileExist(false);
		header.process(je);
		detail.process(je);
		datos.process(je);
		
		je.setVerfyFileExist(false);
		header.process(je);
		detail.process(je);
		datos.process(je);
		
				
		
		//System.out.print(je.getSapJournalEntryHeaderRecord());
		
		
		
		//System.out.print(je.getSapJournalEntryHeaderRecord());
		
	}
	

}
