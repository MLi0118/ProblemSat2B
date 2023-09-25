
/**
 * 
 * @Melanie Li 
 * @Sept 22th
 */
public class OrderedPair
{
    double x;
    double y;
    
    public OrderedPair(){
        x=0;
        y=0;
    }
    
    public OrderedPair(double x, double y){
        this.x =x;
        this.y =y;
    }
    public String toString(){
        return x + "," + y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
}
