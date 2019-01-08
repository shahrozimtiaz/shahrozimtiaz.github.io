var password = prompt("What is the password?");

while(true){
	if(password == "pass2018"){
		document.write("Cool! You're in.")
		break;
	}
	else{
		password = prompt("What is the password?");
	}
}