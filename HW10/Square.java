// Square.java

public class Square extends TwoDimensionalShape {
  
  public Square (int x, int y, int side ) 
  {
    super ( x, y, side, side );
  }
  
  public String getName() 
  {
    return "Square";
  }
  
  public void print()
  {
    System.out.println( "(" + super.getX() + ", " + super.getY() + ") " + "side: " + super.getDimension1() );
  }
  
  public int getArea()
  {
    return super.getDimension1() * super.getDimension1();
  }

}
