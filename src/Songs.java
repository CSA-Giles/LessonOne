public class Songs {

    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    private int numSongs;
    private double totalCost;
    private int totalRatings;

    public Songs(){
        title = "";
        rating = 0;
        price = 0.0;
        totalCost = 0.0;
        numSongs = 0;
        totalRatings = 0;
    }
    public Songs(String title, double price, int rating){
        this.title = title;
        this.price = price;
        this.rating = rating;
        totalCost = totalCost + price;
        ++numSongs;
        totalRatings = totalRatings + rating;

    }
    public String getTitle() {
            return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    public void addToFavorites(){
        favorite = true;
    }
    public void display(){
        System.out.println(title + " " + price + " " + rating);
        System.out.println(totalCost + " " + numSongs);
    }
}
