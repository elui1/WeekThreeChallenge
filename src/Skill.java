import java.util.ArrayList;

public class Skill {
    private String name;
    private String rating;
    private ArrayList<String> ratings;

    public Skill() {
        ratings = new ArrayList<>();
        ratings.add("Fundamental");
        ratings.add("Novice");
        ratings.add("Intermediate");
        ratings.add("Advanced");
        ratings.add("Expert");
    }

    public Skill(String name, String rating) {
        this.name = name;
        this.rating = rating;

        ratings = new ArrayList<>();
        ratings.add("Fundamental");
        ratings.add("Novice");
        ratings.add("Intermediate");
        ratings.add("Advanced");
        ratings.add("Expert");
    }

//    public Skill(String name, String rating) {
//        this.name = name;
//        this.rating = rating;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ArrayList<String> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<String> ratings) {
        this.ratings = ratings;
    }

    public String toString() {
        return this.name + ", " + rating;
    }

}
