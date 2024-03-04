public class DragonMain01{

    int x, y, width, height;

    void moveLeft() {
        x -= 1;
       detectCollision(x,y);   
   }
   void moveRight() {
       x += 1;
       detectCollision(x,y);
   }
   void moveUp() {
       y -= 1;
       detectCollision(x,y);
   }
   void moveDown() {
       y += 1;
       detectCollision(x,y);
   }
   
   public void printPosition() {
       System.out.println("Posisi Mendatar: " + x);
       System.out.println("Posisi Vertikal: " + y);
   }
   
   public void detectCollision(int x, int y) {
       if (x < 0 || x > width || y < 0 || y > height) {
           System.out.println("Game Over");
       }
    }
   public static void main(String[] args) {
    DragonMain01 dragon = new DragonMain01();
    dragon.x = 7;
    dragon.y = 7;
    dragon.width = 6;
    dragon.height = 10;

    dragon.moveLeft();
    dragon.moveRight();
    dragon.moveUp();
    dragon.moveDown();
    dragon.printPosition();
    dragon.detectCollision(7, 6);
}
}