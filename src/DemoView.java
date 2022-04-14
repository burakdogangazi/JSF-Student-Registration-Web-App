import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

@ManagedBean(name = "demoView", eager = true)
@SessionScoped
public class DemoView {

	private Demo demo = new Demo();
	private String kullaniciAdi;
	private String sifre;
	
	public String giris() {
		
		if(kullaniciAdi.equals("Burak") && sifre.equals("12345")) {
			
			return "dogru";
		}
		
		else {
			return "yanlis";
		}
	}
	

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(demo);
		en.getTransaction().commit();
		demo = new Demo();
	}
	
	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(demo);
		en.getTransaction().commit();
		demo = new Demo();
	}
	
	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(demo);
		en.getTransaction().commit();
		demo = new Demo();
	}
	
	public List<Demo> getKayitListe(){
		
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Demo").getResultList();	
	}
	
	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
}
