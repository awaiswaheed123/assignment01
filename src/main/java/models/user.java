package models;

public class user {
String name;
String password;
String role;
int score;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

public user(String name, String pw, String role, int score) {
	this.name = name;
	this.password = pw;
	this.role = role;
	this.score = score;
}

public boolean login(String username, String password) {
	return(this.name.equals(username) && this.password.equals(password));
}

}
