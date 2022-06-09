package com.example.MapstructH2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

	@JsonProperty("id")
	private int id;
	
    @JsonProperty("firstname")
    private String firstname;
    
    @JsonProperty("lastname")
    private String lastname;
	
    @JsonProperty("email")
    private String email;

}
