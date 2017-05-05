package Model;


public class Figure extends Coord implements Runnable{
	
   private static final int STEP = 1;
   private static final int SPEED_LOSS = -5;  // perdida de velocidad ********agregar a interfaz
   
   private int size;
   private double direction;
   private double speed;
   
   private Area area;
   
   private boolean moving;
   private boolean crash;

    public Figure(int size, double direction, double speed, Coord coor) {
        super(coor.x, coor.y);
        this.size = size;
        this.direction = direction;
        this.speed = speed;
        this.moving = false;
        this.area = null;
        this.crash = false;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }
    
    public boolean isCrash() {
		return crash;
	}

	public void setCrash(boolean crash) {
		this.crash = crash;
	}

//	@Override
	public void run() {
        while(moving){
            try {
                Thread.sleep((long)((STEP/this.speed)*1000)); 
                this.move(this.direction,STEP);
                if (!this.isInArea(area) || this.crash){
                   this.setDirection(this.direction + Math.toRadians((int)(Math.random()*180)));    
                   this.move(this.direction,(STEP*2));  //cuando se estrella  (el dos para que una vez se salga del area vuelva a el area o retroceda dos pasos y siga con la condicion)
                   this.speed += SPEED_LOSS;
                   moving = this.speed > 0;
                   this.crash = false;
				}
            } catch (InterruptedException ex) {
            	System.out.println(ex);
            }
        }
    }
}
