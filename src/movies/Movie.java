package movies;

public class Movie {
    private String name;
    private String category;

    public Movie() {

    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    //    getters and setters
//    name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    //    categories
    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category = category;
    }
}
