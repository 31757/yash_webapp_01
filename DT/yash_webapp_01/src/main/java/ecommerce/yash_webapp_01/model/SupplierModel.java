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
public class SupplierModel {
	@Id
	@Column(name="SupId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public
	int SupId;
	@NotEmpty
	String SupName;
	@NotEmpty
	String SupEmail;
	@NotEmpty
	String City;
	public int getSupId() {
		return SupId;
	}
	public void setSupId(int supId) {
		SupId = supId;
	}
	public String getSupName() {
		return SupName;
	}
	public void setSupName(String supName) {
		SupName = supName;
	}
	public String getSupEmail() {
		return SupEmail;
	}
	public void setSupEmail(String supEmail) {
		SupEmail = supEmail;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
