import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DemoFK {

	@Id
	@GeneratedValue
	private Long idfk;
	private String il;
	private String ilce;
	
	@OneToOne(mappedBy = "demoFK")
	//mapping yaparken isim oluþturulan instance ismi olmalý
	private Demo demo;
	
	public Long getIdfk() {
		return idfk;
	}
	public void setIdfk(Long idfk) {
		this.idfk = idfk;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	
}
