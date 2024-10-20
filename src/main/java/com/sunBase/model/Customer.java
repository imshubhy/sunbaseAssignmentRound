package com.sunBase.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	private String uuid;

	@NotEmpty(message = "First name should not be empty or null!")
	@NotNull
	@JsonProperty("first_name")
	private String first_name;

	@NotEmpty(message = "Last name should not be empty or null!")
	@NotNull
	@JsonProperty("last_name")
	private String last_name;

	@NotEmpty(message = "Street should not be empty or null!")
	@NotNull
	private String street;

	@NotEmpty(message = "Address should not be empty or null!")
	@NotNull
	private String address;

	@NotEmpty(message = "City should not be empty or null!")
	@NotNull
	private String city;

	@NotEmpty(message = "State should not be empty or null!")
	@NotNull
	private String state;

	@Email(message = "Please provide a valid email format!")
	@NotNull(message = "Email should not be null!")
	@NotEmpty(message = "Email should not be empty!")
	private String email;

	@NotEmpty(message = "Phone should not be empty or null!")
	@NotNull
	private String phone;
}
