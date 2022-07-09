package com.coderscampus.Assignment10.dto;

import java.util.List;

public class DayResponse {
	
	private List<Meal> meal;
	private Nutrients nutrients;
	
	
	public List<Meal> getMeal() {
		return meal;
	}

	public void setMeal(List<Meal> meal) {
		this.meal = meal;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "DayResponse [meal=" + meal + "]";
	}

}
