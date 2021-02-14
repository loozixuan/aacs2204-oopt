
public class ComparableCircle extends Circle implements Comparable,Colorable {

    public ComparableCircle(double radius) {
        super(radius);
    }
    
    //USE COMPARETO IS NOT SUITABLE
     public int compareTo(Object o){
        ComparableCircle temp = (ComparableCircle)o;
        
        if(this.getRadius() > (temp.getRadius())){
            return 1;
        }else if(this.getRadius() < (temp.getRadius())){
            return -1;
        }else{
            return 0;
        }    
   } 

    public void howToColor() {
        System.out.println("Filled with Blue Color");
    }
     
}
