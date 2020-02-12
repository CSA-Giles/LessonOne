public class MediaLib {

    public static void main(String[] args){
        double totalCost = 0.00;
        int totalRating = 0;

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
        Songs two = new Songs("Call of Ktulu", 0.99, 7);
        totalCost = two.getPrice() + totalCost;
        totalRating = two.getRating() + totalRating;
        Songs three = new Songs("Creeping Death", 1.29, 10);
        totalCost = three.getPrice() + totalCost;
        totalRating = three.getRating() + totalRating;
        Songs four = new Songs("For Whom the Bell Tolls", 1.29, 10);
        totalCost = four.getPrice() + totalCost;
        totalRating = four.getRating() + totalRating;
        Songs five = new Songs("Escape", 0.99, 8);
        totalCost = five.getPrice() + totalCost;
        totalRating = five.getRating() + totalRating;
        Songs six = new Songs("Fade to Black", 0.99, 10);
        totalCost = six.getPrice() + totalCost;
        totalRating = six.getRating() + totalRating;
        Songs seven = new Songs("Fight Fire With Fire", 1.29, 8);
        totalCost = seven.getPrice() + totalCost;
        totalRating = seven.getRating() + totalRating;
        Songs eight = new Songs("Trapped Under Ice", 1.29, 8);
        totalCost = eight.getPrice() + totalCost;
        totalRating = eight.getRating() + totalRating;
        System.out.println(totalCost + " " + totalRating);

        movie1.setTitle("Garfield Movie ");
        System.out.print(movie1.getTitle());
        movie1.setRating(10);
        System.out.println(movie1.getRating());

        book1.setTitle("Garfield Book ");
        System.out.print(book1.getTitle());
        book1.setRating(10);
        System.out.println(book1.getRating());
    }
}
