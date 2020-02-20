package scifi_name;
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 *
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     *
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String[] args)
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name

        firstName = firstName.substring(0, 3);
        lastName = lastName.substring(0, 2);
        String newFirstName = firstName + lastName;
        char c1 = newFirstName.charAt(0);
        c1 = Character.toUpperCase(c1);
        newFirstName = c1 + newFirstName.substring(1, 5);

        city = city.substring(0, 2);
        school = school.substring(0, 3);
        String newLastName = city + school;
        char c2 = newLastName.charAt(0);
        c2 = Character.toUpperCase(c2);
        newLastName = c2 + newLastName.substring(1, 5);


        int r = (int)(Math.random()*relativeName1.length());
        int r2 = (int)(Math.random()*relativeName2.length());
        relativeName1 = relativeName1.substring(r, relativeName1.length());
        relativeName2 = relativeName2.substring(r2, relativeName2.length());
        String origin = relativeName1 + relativeName2;
        char c3 = origin.charAt(0);
        c3 = Character.toUpperCase(c3);
        origin = c3 + origin.substring(1, origin.length());

        System.out.println("Yo, whats good " + newFirstName + " " + newLastName + " of " + origin);

    }
}