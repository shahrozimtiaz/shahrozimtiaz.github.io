var password = prompt("What is the password?");

while(true){
	if(password == "p1"){
		document.write("Cool! You're in.")
		break;
	}
	else{
		password = prompt("Wrong. What is the password?");
	}
}