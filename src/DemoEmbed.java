import javax.persistence.Embeddable;

@Embeddable
public class DemoEmbed {

	
	private String telefon;
	private String tcNo;
	
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
}
