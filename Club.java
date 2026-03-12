import java.util.*;
import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        this.members = new ArrayList <>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
        
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size(); 
    }
    
    /**
     * 
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    * @return The number of members who joined in that month.
    */
    public int joinedInMonth(int month) {
        if(month < 1 || month > 12) {
            System.out.println("Error: Invalid Month");
            return 0;
      }
      int count = 0;
      for (Membership member : members) {
          if(member.getMonth() == month) {
              count++;
          }
      } 
      return count;
    }
}
