package pkg;

public class Movie{
    String movie;
    double rating;
    int numratings;
    int revenue;
    
    public Movie(){
        movie = "The Avengers";
        rating = 8.0;
        numratings = 33;
        revenue = 623357910;
    }
    
    public Movie(String a, double b, int c, int d){
        movie = a;
        rating = b;
        numratings = c;
        revenue = d;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+ movie);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: "+ numratings);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    }
    
    public String getMovieName(){
        return movie;
    }
    
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double e){
        rating = ((rating*(double)numratings)+e)/((double)numratings+1.0);
        numratings++;
    }
    public double getRating(){
        return rating;
    }
    
    public boolean compareRatings(Movie a){
        return (this.rating>a.rating); // EXTRA CREDIT : this.
    }
    
}
