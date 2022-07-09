package com.coderscampus.Assignment10.dto;

import java.util.List;



public class Meal {
	
	private Integer Id;
	private String title;
	private String image;
	private List<String> imageUrls;
	private Integer readyInMinutes;
	private Integer servings;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	@Override
	public String toString() {
		return "Meal [Id=" + Id + ", title=" + title + ", image=" + image + ", imageUrls=" + imageUrls
				+ ", readyInMinutes=" + readyInMinutes + ", servings=" + servings + "]";
	}
	

}
