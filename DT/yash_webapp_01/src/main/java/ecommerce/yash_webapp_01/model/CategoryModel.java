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
public class CategoryModel {
	@Id
	@Column(name="CatId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public
	int CatId;
	@NotEmpty
	String CatName;
	public int getCatId() {
		return CatId;
	}
	public void setCatId(int catId) {
		CatId = catId;
	}
	public String getCatName() {
		return CatName;
	}
	public void setCatName(String catName) {
		CatName = catName;
	}

}
