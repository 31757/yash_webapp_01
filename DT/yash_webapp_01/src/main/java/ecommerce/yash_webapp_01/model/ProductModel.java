package ecommerce.yash_webapp_01.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pid;
	String pcat;
		@NotNull @NotEmpty
		String pbrand;
		@NotNull @NotEmpty
	String pmodel;
		@NotNull @NotEmpty
	String pos;
		@NotNull @NotEmpty
	String pversion;
		@NotNull @NotEmpty
	String purl;
		@NotNull @NotEmpty
	int pprice;
	@Transient
	MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPcat() {
		return pcat;
	}

	public void setPcat(String pcat) {
		this.pcat = pcat;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getPversion() {
		return pversion;
	}

	public void setPversion(String pversion) {
		this.pversion = pversion;
	}


	public String getPurl() {
		return purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "ProductModel [pid=" + pid + ", pcat=" + pcat + ",pbrand=" + pbrand + ",pmodel=" + pmodel + ",pos=" + pos + ",pversion=" + pversion + ", purl=" + purl + ",pprice="
				+ pprice + "]";
	}
}

