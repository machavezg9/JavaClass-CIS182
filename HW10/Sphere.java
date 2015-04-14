// Sphere.java

public class Sphere extends ThreeDimensionalShape {
  
  public Sphere (int x, int y, int radius ) 
  {
    super ( x, y, radius, radius, radius );
  }
  
  public String getName() 
  {
    return "Sphere";
  }
  
  public int getArea()
  {
    return (int)( 4 * Math.PI * super.getDimension1() * super.getDimension1() );
  }
  
  public int getVolume()
  {
    return (int)( ( 4 / 3 ) * Math.PI * super.getDimension1() * super.getDimension1() * super.getDimension1() );
  }
  
  public void print()
  {
    System.out.println( "(" + super.getX() + ", " + super.getY() + ") " + "radius: " + super.getDimension1() );
  }
  
}
