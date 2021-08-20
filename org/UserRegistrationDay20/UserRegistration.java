package org.UserRegistrationDay20;

public class UserRegistration {
	public static void main(String[] args) {
		
}
	public String firstName (String name) {
		String firstName = name;
		if(firstName.charAt(0) == firstName.toUpperCase().charAt(0) && firstName.length() >2) {
			return firstName;
		}
		else {
			return null;
		}
	}
		
		public String lastName (String name) {
			String lastName = name;
			if(lastName.charAt(0) == lastName.toUpperCase().charAt(0) && lastName.length() >2) {
				return lastName;
			}
			else {
				return null;
			}
	}

}
