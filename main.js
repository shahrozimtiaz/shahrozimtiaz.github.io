var password = prompt("What is the password?");

while(true){
	if(password.equalsIgnoreCase("p1")){
		break;
	}
	else{
		password = prompt("Wrong. What is the password?");
	}
}