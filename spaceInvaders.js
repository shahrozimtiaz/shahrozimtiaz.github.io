// Shahroz Imtiaz
// 1/9/2018
window.onload=function(){
	canv=document.getElementById("gc");
	ctx=canv.getContext("2d");
	image = new Image();
	image.src="invader.jpg";
	document.addEventListener("keydown",keyPush);
	document.addEventListener("keyup",keyPush);
	timer = setInterval(game,100);
}
shooter = [180,380];
cannon = [shooter[0]+17,shooter[1]-8];
cannonBalls = [];
enemyCannonBalls = [];
invaders = [];
dir="";
fire=false;
enemyFire=false;
level=1;
score = 0;
lives = 3;
var map=[];
function game(){
	ctx.fillStyle="black";
	ctx.fillRect(0,0,canv.width,canv.height);
	ctx.fillStyle="white";
	ctx.font = "14px Georgia";
	ctx.fillText("Score: " + score, 0, 11);
	ctx.fillText("Lives: " + lives, 350, 11);
	ctx.fillText("Shahroz Imtiaz",285,392);
	ctx.font = "32px Georgia";
	ctx.fillText("Space Invaders",90,120);
	if(lives==0){
		clearInterval(timer);
		alert("Game Over");
	}
	for(var i=0;i<invaders.length;i++){
		if(invaders[i][1]>=380){
			invaders.splice(j,1);
			lives--;
		}
	}
	for(var i=0;i<cannonBalls.length;i++){
		for(var j=0;j<invaders.length;j++){
			if(((invaders[j][0]-5)+25)-cannonBalls[i][0]<=25 && ((invaders[j][0]-5)+25)-cannonBalls[i][0]>=0 && ((invaders[j][1]-5)+25)-cannonBalls[i][1]<=25 && ((invaders[j][1]-5)+25)-cannonBalls[i][1]>=0){
				ctx.fillStyle="black";
				ctx.fillRect(invaders[j][0],invaders[j][1],20,20);
				invaders.splice(j,1);
				cannonBalls.splice(i,1);
				score++;
				if(score%5==0){
					level++;
				}
			}
		}
	}
	for(var i=0;i<enemyCannonBalls.length;i++){
		if(((shooter[0]-5)+45)-enemyCannonBalls[i][0]<=45 && ((shooter[0]-5)+40)-enemyCannonBalls[i][0]>=0 && ((shooter[1]-5)+45)-enemyCannonBalls[i][1]<=45 && ((shooter[1]-5)+45)-enemyCannonBalls[i][1]>=0){
			lives--;
			enemyCannonBalls.splice(i,1);
		}
	}
	if(level==3){
		enemyFire = true;
		level=1;
	}
	for(var i=0;i<invaders.length;i++){
		ctx.fillStyle="black";
		ctx.fillRect(invaders[i][0],invaders[i][1],20,20);
		invaders[i][1]=invaders[i][1]+3;
	}
	if(invaders.length < level){
		for(var i=1;i<=level;i++){
			invader();
			invader();
		}
	}
	for(var i=0;i<invaders.length;i++){
		// ctx.fillStyle="lime";
		// ctx.fillRect(invaders[i][0],invaders[i][1],20,20);
		ctx.drawImage(image, invaders[i][0],invaders[i][1],20,20);
	}
	for(var i=0;i<cannonBalls.length;i++){
		ctx.fillStyle="black";
		ctx.fillRect(cannonBalls[i][0],cannonBalls[i][1],5,5);
		cannonBalls[i][1]=cannonBalls[i][1]-6;
		if(cannonBalls[i][1]<0){
			cannonBalls.splice(i,1);
		}
	}
	for(var i=0;i<enemyCannonBalls.length;i++){
		ctx.fillStyle="black";
		ctx.fillRect(enemyCannonBalls[i][0],enemyCannonBalls[i][1],5,5);
		enemyCannonBalls[i][1]=enemyCannonBalls[i][1]+6;
		if(enemyCannonBalls[i][1]>=400){
			enemyCannonBalls.splice(i,1);
		}
	}
	if(enemyFire){
		for(var i=0;i<invaders.length;i++){
			var ball=[invaders[i][0]+10,invaders[i][1]+20];
			enemyCannonBalls.push(ball);
		}
		enemyFire=false;
	}
	if(fire){
		var ball=[cannon[0],cannon[1]];
		cannonBalls.push(ball);
		fire=false;
	}
	if(dir=="left"){
		if(shooter[0]-10>=0){
			ctx.fillStyle="black";
			ctx.fillRect(shooter[0],shooter[1],40,10);
			ctx.fillRect(cannon[0],cannon[1],6,8);
			shooter[0]=shooter[0]-10;
			cannon[0]=cannon[0]-10;
			dir="";
		}
	}
	else if(dir=="right"){
		if(shooter[0]+40+10<=400){
			ctx.fillStyle="black";
			ctx.fillRect(shooter[0],shooter[1],40,10);
			ctx.fillRect(cannon[0],cannon[1],6,8);
			shooter[0]=shooter[0]+10;
			cannon[0]=cannon[0]+10;
			dir="";
		}
	}
	ctx.fillStyle="white";
	ctx.fillRect(shooter[0],shooter[1],40,10);
	ctx.fillRect(cannon[0],cannon[1],6,8);
	for(var i=0;i<cannonBalls.length;i++){
		ctx.fillStyle="white";
		ctx.fillRect(cannonBalls[i][0],cannonBalls[i][1],5,5);
	}
	for(var i=0;i<enemyCannonBalls.length;i++){
		ctx.fillStyle="red";
		ctx.fillRect(enemyCannonBalls[i][0],enemyCannonBalls[i][1],5,5);
	}
}
function keyPush(event){
	map[event.keyCode] = event.type == 'keydown';
	if(map[32] && map[37]){
		fire=true;
		dir="left";
	}
	else if(map[32] && map[39]){
		fire=true;
		dir="right";
	}
	else if(map[32]){
		fire=true;
	}
	else if(map[37]){
		dir="left";
	}
	else if(map[39]){
		dir="right";
	}
}
function invader(){
	var x = Math.floor(Math.random()*360);
	inv=[x,0];
	invaders.push(inv);
}