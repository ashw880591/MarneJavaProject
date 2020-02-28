package springbootdatajpaproject.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="Builder")
public class builderModel {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="tagline")
	String tagline;
	@Column(name="category")
	String category;
	@Column(name="enquiry")
	String enquiry;
	@Column(name="description1")
	String description1;
	@Column(name="description2")
	String description2;
	@Column(name="images")
	String images;
	
	 public builderModel() {
		 
	 }

	public builderModel(int id, String tagline, String category, String enquiry, String description1,
			String description2, String images) {
		super();
		this.id = id;
		this.tagline = tagline;
		this.category = category;
		this.enquiry = enquiry;
		this.description1 = description1;
		this.description2 = description2;
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "builderModel [id=" + id + ", tagline=" + tagline + ", category=" + category + ", enquiry=" + enquiry
				+ ", description1=" + description1 + ", description2=" + description2 + ", images=" + images + "]";
	}
}