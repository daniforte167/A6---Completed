/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  Hashtable<String, Boolean> collection;
  //creates hashtable for use 

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean> ();
    //  initialize it
      collection.put("Horton Hears a Who by Doctor Suess", true);
      collection.put("The Girl at Midnight by Melissa Grey", true);
      collection.put("Scapegracers by H.A. Clarke", true);      
      System.out.println("You have built a library: 📖");

    }


    private void put(String title){
      collection.put(title, true);
      

    }



    public String remove(String title){
      collection.remove(title);
      return title;

    }
    // return the title that we removed


    public boolean checkOut(String title){
      return false;

    }

    public boolean returns(String title){
      return true;
    }



  
public boolean containsTitle(String title){
  return true;

} 
// returns true if the title appears as a key in the Libary's collection, false otherwise

public boolean isAvailable(String title){
  return true;
  
 }
 // returns true if the title is currently available, false otherwise

 public void printCollection(){
  
}
 // prints out the entire collection in an easy-to-read way (including checkout status)

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson", "7 Neilson Drive, Northampton, MA, 01063", 4);
      Neilson.collection.put("When We Were Magic by Sarah Gailey", true);
      Neilson.collection.remove("Horton Hears a Who by Doctor Suess");
      Neilson.isAvailable("Scapegracers by H.A. Clarke");
      System.out.println(Neilson.collection);
      System.out.println(Neilson);
    }

  }