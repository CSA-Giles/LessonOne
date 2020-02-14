public class Movies {

    private String title;
    private int rating;
    private int time;

    public Movies(){
        title = "";
        rating = 0;
        time = 0;
    }
    public Movies(String title, int rating, int time){
        this.title = title;
        this.rating = rating;
        this.time = time;
    }
    public String getTitle(){
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
    public int getTime(){
        return time;
    }
    public void setTime(int m) {
        time = m;
    }
}
