
public class HeaderContentManager implements handler {

	JournalEntryProcessRequest s;
	
	public JournalEntryProcessRequest process() {

		String headerLine = "";
		for (JournalEntryHeader valores : JournalEntryHeader.values()) {
			System.out.println(valores.getName());
			if (valores.getName().equals("Document_Date_CST")) {
				headerLine = headerLine + "FECHA_DATE";
			} else {
				headerLine = headerLine + valores.getValue();
			}

		}
		return s;

	}

	public void process(final JournalEntryProcessRequest s) {
		int numberMocked = 0;
		// preguntar si el archivo existe.
		// si no entonces incrementar el contador
		if (s.isVerfyFileExist()) {
			++numberMocked;
			String headerLine = "";
			for (JournalEntryHeader values : JournalEntryHeader.values()) {
				if (values.getName().equals("Header_Record_Indicator")) {
					values.setValue("0000" + numberMocked);
				}
				if (values.getName().equals("Document_Date_CST")) {
					values.setValue("FECHA_DATE");
				}
				headerLine = headerLine + values.getValue();
			}
			s.setSapJournalEntryHeaderRecord(headerLine);

		}else{
			System.out.println("Nothing ");
		}

	}

}
