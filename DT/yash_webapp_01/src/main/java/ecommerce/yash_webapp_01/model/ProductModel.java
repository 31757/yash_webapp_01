package ecommerce.yash_webapp_01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity

@Table(name="Products")

public class ProductModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;

@Column 
	String pcat;
@Column  
	String pbrand;
@Column  
	String pmodel;
@Column  
	String pdesc;
@Column
private int productQuantity;

@Column  
	String pversion;
@Column  
	String purl;
@Column  
	int pprice;

	@Transient
	MultipartFile File;

	public MultipartFile getFile() {
		return File;
	}

	public void setFile(MultipartFile file) {
		this.File = file;
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
	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "ProductModel [pid=" + pid + ", pcat=" + pcat + ",pbrand=" + pbrand + ",pmodel=" + pmodel + ",pdesc=" + pdesc
				+ ",pversion=" + pversion + ", purl=" + purl + ",pprice=" + pprice + "]";
	}
}
