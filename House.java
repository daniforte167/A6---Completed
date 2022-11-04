/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  ArrayList<String> Residents;
  boolean hasDiningRoom;
  boolean isResident;

  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors);
    hasDR = hasDiningRoom;
    this.Residents = new ArrayList<String>() ;

    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  public int nResidents(){
    return this.Residents.size();

  }
  public void moveIn(String name){
    //adding a String of the name
    Residents.add(name);
    //adding a name to the list
  }
  

  public String moveOut(String name){
    //removing a name
    Residents.remove(name);
    return name;

  }

  public boolean isResident(String person){
    //checking if the Resident is in the house
    return Residents.contains(person);
  }
    //returns the name of the person
    //asking if resident is a real person within the list




  public static void main(String[] args) {
    House Wilder = new House("Wilder",  "1 Mandelle Road", 4, true);
    Wilder.Residents.add("Dani");;
    Wilder.Residents.add("Jillian");
    Wilder.isResident("Dani");
    Wilder.Residents.size();
    System.out.println(Wilder.hasDiningRoom);
    System.out.println(Wilder);
    System.out.println(Wilder.Residents);
  }

}