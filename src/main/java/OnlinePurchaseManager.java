import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    /* to be implemented in part (a) */
    int result = 0;
    for(Gizmo i : purchases){
      if(i.getMaker().equals(maker) && i.isElectronic()){
        result++;
      }
    }
    return result;




    
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    /* to be implemented in part (b) */
    Gizmo a = purchases.get(0);
    for(int i=0; i<purchases.size(); i++){
      Gizmo b=purchases.get(i);
      if(a.equals(b)){
        return true;
      }
      a=b;
    }
    return false;




    
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
