package com.lombok.demo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@EqualsAndHashCode

//@Data
public class Student {
	

	private int sid;
	//private String sname;
	private double fee;
	
	
}
