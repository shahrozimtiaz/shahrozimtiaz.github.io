var password = prompt("What is the password?");
while(true){
	if(password.toLowerCase() == "p1"){
		break;
	}
	else{
		password = prompt("Wrong. What is the password?");
	}
}