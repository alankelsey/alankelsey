// Global variables
float radius = 50.0;
int X, Y;
int nX, nY;
int delay = 16;

// Setup the Processing Canvas
void setup(){
  size( 1080, 720 );
  strokeWeight( 10 );
  frameRate( 180 );
  X = width / 2;
  Y = height / 2;
  nX = X;
  nY = Y;  
  float mx = mouseX;
  float my = mouseY;
}

// Main draw loop
void draw(){
  
  
  radius = radius + sin( frameCount / 4 );
  
  // Track circle to new destination
  X+=(nX-X)/delay;
  Y+=(nY-Y)/delay;
  
  // Fill canvas grey
  background( 100 );

  
  
  // Set fill-color to blue
  
  
  // Set stroke-color white
   
//fill( 100, 100, 100 );
fill( 100, 121, 184 );
stroke(0);
strokeWeight( 2 );
rect(2, 2, 180, 720);
//rect( X, Y, radius, radius );  
rect(360, 2, 180, 720);
rect(720, 2, 180, 720);

stroke(255);
fill( 0, 121, 184 );
  // Draw circle
  //ellipse( X, Y, radius, radius );   



//rect(30, 20, 55, 55);  
}

void mouseOverColumn(){


	if (nX < 179){
		stroke(10);
		fill( 255, 255, 224 );
		ellipse( X, Y, radius*3, radius*3 ); 
	}else if ((nX > 359)&& (nX < 540)){
	
		stroke(10);
		fill( 255, 255, 224 );
		ellipse( X, Y, radius*3, radius*3 );
	}else if (nX > 719){
	
		stroke(10);
		fill( 255, 255, 224 );
		ellipse( X, Y, radius*3, radius*3 );
	}


}

// Set circle's next destination
void mouseMoved(){
  nX = mouseX;
  nY = mouseY;  
  mouseOverColumn();
}

