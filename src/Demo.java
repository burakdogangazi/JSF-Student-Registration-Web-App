import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ogrenci")
public class Demo {

	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	private String yas;
	private String cinsiyet;
	
	@Embedded
	private DemoEmbed demoEmbed = new DemoEmbed();
	
	@OneToOne(cascade = CascadeType.ALL)
	private DemoFK demoFK = new DemoFK();
	


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	
	//Embed getter setter
	public DemoEmbed getDemoEmbed() {
		return demoEmbed;
	}

	public void setDemoEmbed(DemoEmbed demoEmbed) {
		this.demoEmbed = demoEmbed;
	}
	

	//FK getter setter
	public DemoFK getDemoFK() {
		return demoFK;
	}

	public void setDemoFK(DemoFK demoFK) {
		this.demoFK = demoFK;
	}
	
	
	
}
