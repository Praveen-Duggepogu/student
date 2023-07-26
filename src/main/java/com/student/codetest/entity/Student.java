package com.student.codetest.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Table(name="Student")
@Entity
@NoArgsConstructor
public class Student {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    @Size(min = 3)
	    private String firstName;

	    @NotBlank
	    @Size(min = 3)
	    private String lastName;

	    @NotNull
	    @Past
	    private Date dob;

	    @Min(0)
	    @Max(100)
	    private Integer marks1;

	    @Min(0)
	    @Max(100)
	    private Integer marks2;

	 
		@Min(0)
	    @Max(100)
	    private  Integer marks3;

	    @NotBlank
	    @Pattern(regexp = "[ABC]")
	    private String section;

	    @NotBlank
	    @Pattern(regexp = "[MF]")
	    private String gender;

		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
					+ ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + ", section=" + section
					+ ", gender=" + gender + "]";
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void setMarks3(Integer marks32) {
			// TODO Auto-generated method stub
			
		}

		public void setMarks2(Integer marks32) {
			// TODO Auto-generated method stub
			
		}

		public void setMarks1(Integer marks32) {
			// TODO Auto-generated method stub
			
		}
	}

	


