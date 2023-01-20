package me.tokanes.recipeshw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ingredient {

	private String title;
	private int amount;
	private String measureUnit;


}
