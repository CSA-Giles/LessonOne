public class MediaLib {

    public static void main(String[] args){
        System.out.println("Welcome to your Media Library...");

        Songs song1 = new Songs();
        Movies movie1 = new Movies();
        Books book1 = new Books();

        song1.setTitle("Sad But True ");
        System.out.print(song1.getTitle());
        song1.setRating(10);
        System.out.println(song1.getRating());

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
