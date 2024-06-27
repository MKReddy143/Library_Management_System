package com.java.LibraryManagementSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Library")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String price;
	private String bDiscription;

	public Book(int id, String name, String author, String price, String bDiscription, String imageData1,
			String imageData2, String imageData3) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.bDiscription = bDiscription;
		this.imageData1 = imageData1;
		this.imageData2 = imageData2;
		this.imageData3 = imageData3;
	}

	@Lob
	@Column(name = "imagedata1", length = 1000)
	private String imageData1;

	@Transient
	public String getimageData1() {
		if (imageData1 == null)
			return null;
		return "/Employee-photo/" + "/" + imageData1;
	}

	@Lob
	@Column(name = "imagedata2", length = 1000)
	private String imageData2;

	@Transient
	public String getimageData2() {
		if (imageData1 == null)
			return null;
		return "/Employee-photo/" + "/" + imageData2;
	}

	@Lob
	@Column(name = "imagedata3", length = 1000)
	private String imageData3;

	@Transient
	public String getimageData3() {
		if (imageData1 == null)
			return null;
		return "/Employee-photo/" + "/" + imageData3;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getbDiscription() {
		return bDiscription;
	}

	public void setbDiscription(String bDiscribtions) {
		this.bDiscription = bDiscribtions;
	}

	public String getImageData1() {
		return imageData1;
	}

	public void setImageData1(String imageData1) {
		this.imageData1 = imageData1;
	}

	public String getImageData2() {
		return imageData2;
	}

	public void setImageData2(String imageData2) {
		this.imageData2 = imageData2;
	}

	public String getImageData3() {
		return imageData3;
	}

	public void setImageData3(String imageData3) {
		this.imageData3 = imageData3;
	}

}
