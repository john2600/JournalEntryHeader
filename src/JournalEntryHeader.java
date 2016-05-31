
public enum JournalEntryHeader {
	SYSTEM("System", "MTX"), 
	HEADER_RECORD("Header_Record #", "\t"),
	HEADER_RECORD_INDICATOR("Header_Record_Indicator", "00001"),
	COMPANY_CODE("Company_Code", "\t"),
	DOCUMENT_TYPE("Document_Type","H"),
	TAB_1("Data_1 ","\t"),
	DATA_2("Data_2","9001"),
	TAB_3("Data_3", "\t"),
	TAB_4("Data_4", "\t"),
	DOCUMENT_DATE("Document_Date_CST","20140515"),
	TAB_5("Data_5", "\t"),
	POSTING_DATE("Posting_date_CST", "20140515"),
	TAB_6("Data_6", "\t"),
	CURRENCY("Currency", "USD"),
	TAB_7("Data_7", "\t"),
	TAB_8("Data_8", "\t"),
	EXCHANCE("Exchange Rate","MTXINV"),
	TAB_9("Data_9", "\t"),
	REFERENCE("Reference","MTX INVENTORY TRANSACTION"),
	TAB_10("Data_10", "\t"),
	TAB_11("Data_11", "\t"),
	TAB_12("Data_12", "\t"),
	TAB_13("Data_13", "\t"),
	CR("car return", "\r"),
	LF("car return", "\n");

	private String name;
	private String value;

	JournalEntryHeader(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value){
		this.value = value;
	}
	
}


