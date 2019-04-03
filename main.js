String.prototype.hashCode = function(){
	var hash = 0;
	for (var i = 0; i < this.length; i++) {
		var character = this.charCodeAt(i);
		hash = ((hash<<5)-hash)+character;
		hash = hash & hash; // Convert to 32bit integer
	}
	return hash;
}
var ps = prompt("What is the password?");
while(true){
	if(ps == null){ps = prompt("Wrong. What is the password?");}
	else if(ps.toLowerCase().hashCode() == 3521){break;}
	else{ps = prompt("Wrong. What is the password?");}
}