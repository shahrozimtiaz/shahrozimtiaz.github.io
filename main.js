var ps = prompt("What is the password?");
while(true){
	if(ps.toLowerCase() == "p1"){
		break;
	}else{ps = prompt("Wrong. What is the password?");}
}