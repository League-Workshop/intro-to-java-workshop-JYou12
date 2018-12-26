PImage mustache;
  PImage Smiley;
    PImage topHat;
void setup(){

  Smiley = loadImage("Smiley_Face.png");
  mustache = loadImage("Mustache.png");
  topHat = loadImage("TopHat.jpg");
  size(600, 600);
  Smiley.resize(600, 600);
  topHat.resize(200, 200);

}

void draw(){

  background(Smiley);
    fill(0);
  rect(0,0,width,height);
  
  if (mousePressed == true){
 
    Smiley.resize(600, 600);
  topHat.resize(200, 200);
  image(mustache, mouseX, mouseY);
  image(topHat, mouseX + 32, mouseY - 325);
    
  
    }
  }