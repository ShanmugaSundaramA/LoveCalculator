package com.sundar.lc.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sundar.lc.validators.Age;

public class UserRegisterDTO {

	@NotEmpty(message = "{string.empty}")
	private String name;
	
	private String userName;

	@NotBlank(message = "* not be blank")
	@Size(min = 3, max = 8, message = "* must be 3 to 15")
	private String password;

	@NotBlank(message = "select your counrty.")
	private String country;

	@Size(min = 1, message = "select any one.")
	private String hobby[];

	@NotBlank(message = "select your gender.")
	private String gender;

	private CommunicationDTO communicationDTO;

	private BillDTO billDTO;

	@Age(lower = 30, upper = 60)
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	public BillDTO getBillDTO() {
		return billDTO;
	}

	public void setBillDTO(BillDTO billDTO) {
		this.billDTO = billDTO;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
