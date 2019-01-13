public class Movie implements Comparable<Movie>{
    public int year;
    public String name;
    public String genre;
    public String mpaaRating;
    
    public Movie(String name, String genre, String rating, int year){
        this.name = name;
        this.genre = genre;
        this.year = year;
        mpaaRating = rating;
    }
    
    public String getName(){return name;}
    public String getGenre(){return genre;}
    public String getMPAARating(){return mpaaRating;}
    public double getYear(){return year;}
    
    public int compareTo(Movie m){
        int yearDiff = year-m.year;
        if(yearDiff==0) return name.compareTo(m.name);
        return yearDiff;
    }
    public boolean equals(Object o){
        if(!(o instanceof Movie)) return false;
        Movie m = (Movie) o;
        return name.equals(m.name);
    }
    
    public String toString(){
        return name+"("+genre+"):"+mpaaRating+"-"+year;
    }
}
