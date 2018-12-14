package com.lavoine.escapedeath.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Player {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private boolean hasPlayed;
	
	private boolean hidden;
}
