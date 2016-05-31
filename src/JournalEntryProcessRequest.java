
public class JournalEntryProcessRequest {
	 private String journalEntryXml;
	   private SendDetailedInventoryFinancialLog journalEntryInfo;
	   private JournalEntry journalEntryBeanXml;
	   private String sapJournalEntryHeaderRecord;
	   private String sapJournalEntryDetailsRecord;
	   private boolean verfyFileExist;

	   public String getJournalEntryXml() {
	      return journalEntryXml;
	   }

	   public void setJournalEntryXml(String journalEntryXml) {
	      this.journalEntryXml = journalEntryXml;
	   }

	   public SendDetailedInventoryFinancialLog getJournalEntryInfo() {
	      return journalEntryInfo;
	   }

	   public void setJournalEntryInfo(SendDetailedInventoryFinancialLog journalEntryInfo) {
	      this.journalEntryInfo = journalEntryInfo;
	   }

	   public JournalEntry getJournalEntryBeanXml() {
	      return journalEntryBeanXml;
	   }

	   public void setJournalEntryBeanXml(JournalEntry journalEntryBeanXml) {
	      this.journalEntryBeanXml = journalEntryBeanXml;
	   }

	   public String getSapJournalEntryHeaderRecord() {
	      return sapJournalEntryHeaderRecord;
	   }

	   public void setSapJournalEntryHeaderRecord(String sapJournalEntryHeaderRecord) {
	      this.sapJournalEntryHeaderRecord = sapJournalEntryHeaderRecord;
	   }

	   public String getSapJournalEntryDetailsRecord() {
	      return sapJournalEntryDetailsRecord;
	   }

	   public void setSapJournalEntryDetailsRecord(String sapJournalEntryDetailsRecord) {
	      this.sapJournalEntryDetailsRecord = sapJournalEntryDetailsRecord;
	   }

	   public boolean isVerfyFileExist() {
		   return verfyFileExist;
	   }

	   public void setVerfyFileExist(boolean verfyFileExist) {
		   this.verfyFileExist = verfyFileExist;
	   }

}
