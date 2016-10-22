package ecommerce.yash_webapp_01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class ProductModel {
	@Id
	@Column(name="prodid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public
	int prodid;
	@NotEmpty
	String prodbrand;
	@NotEmpty
	String prodmodel;
	@NotEmpty
	String prodos;
	@NotEmpty
	String prodversion;
	@NotEmpty
	String prodprice;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdbrand() {
		return prodbrand;
	}
	public void setProdbrand(String prodbrand) {
		this.prodbrand = prodbrand;
	}
	public String getProdmodel() {
		return prodmodel;
	}
	public void setProdmodel(String prodmodel) {
		this.prodmodel = prodmodel;
	}
	public String getProdos() {
		return prodos;
	}
	public void setProdos(String prodos) {
		this.prodos = prodos;
	}
	public String getProdversion() {
		return prodversion;
	}
	public void setProdversion(String prodversion) {
		this.prodversion = prodversion;
	}
	public String getProdprice() {
		return prodprice;
	}
	public void setProdprice(String prodprice) {
		this.prodprice = prodprice;
	}
	
	@Override
	public String toString(){
		return "ProductModel [Id="+prodid+" , Brand="+prodbrand+", Model="+prodmodel+", Os="+prodos+" , Version="+prodversion+", Price="+prodprice+"]";
	
	}
}

