public class MediaLib {

    public static void main(String[] args){
        double totalCost = 0.00;
        int totalRating = 0;
        int numSongs = 0;
        double avgCost;
        double avgRating;

        System.out.println("Welcome to your Media Library...");

        Songs song1 = new Songs();
        Movies movie1 = new Movies();
        Books book1 = new Books();

        song1.setTitle("Sad But True ");
        System.out.print(song1.getTitle());
        song1.setRating(10);
        System.out.println(song1.getRating());
        song1.setPrice(2.50);
        System.out.println("$" + song1.getPrice());

        Songs one = new Songs("Ride The Lightning", 1.29, 9);
        totalCost = one.getPrice() + totalCost;
        totalRating = one.getRating() + totalRating;
        numSongs = numSongs + 1;
        Songs two = new Songs("Call of Ktulu", 0.99, 7);
        totalCost = two.getPrice() + totalCost;
        totalRating = two.getRating() + totalRating;
        numSongs = numSongs + 1;
        Songs three = new Songs("Creeping Death", 1.29, 10);
        totalCost = three.getPrice() + totalCost;
        totalRating = three.getRating() + totalRating;
        numSongs = numSongs + 1;
        Songs four = new Songs("For Whom the Bell Tolls", 1.29, 10);
        totalCost = four.getPrice() + totalCost;
        totalRating = four.getRating() + totalRating;
        numSongs = numSongs + 1;
        Songs five = new Songs("Escape", 0.50, 8);
        totalCost = five.getPrice() + totalCost;
        totalRating = five.getRating() + totalRating;
        numSongs = numSongs + 1;
        Songs six = new Songs("Fade to Black", 1.29, 10);
        totalCost = six.getPrice() + totalCost;
        numSongs = numSongs + 1;
        totalRating = six.getRating() + totalRating;
        Songs seven = new Songs("Fight Fire With Fire", 1.29, 8);
        totalCost = seven.getPrice() + totalCost;
        totalRating = seven.getRating() + totalRating;
        numSongs = numSongs + 1;
        Songs eight = new Songs("Trapped Under Ice", 1.29, 8);
        totalCost = eight.getPrice() + totalCost;
        totalRating = eight.getRating() + totalRating;
        numSongs = numSongs + 1;
        System.out.println(totalCost + " " + totalRating + " " + numSongs);
        avgCost = totalCost / numSongs;
        avgRating = totalRating / numSongs;
        System.out.println("Average Cost: " + (avgCost));
        System.out.println("Average Rating: " + (avgRating) );

        Movies oneM = new Movies("Avengers: End Game", 9, 182);
        System.out.println(oneM.getTitle() + ", rating: " + oneM.getRating() + ", time: " + (oneM.getTime()/60) + " hours, " + (oneM.getTime()%60) + " minutes");
    }
}
