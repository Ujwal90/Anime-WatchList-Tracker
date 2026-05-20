public class Anime{
    String title;
    int episodeswatched;
    double rating;
    Anime(String t, int ep, double rate){
        title=t;
        episodeswatched=ep;
        rating=rate;
    }
    void display(){
        System.out.println("Title: " + title + " | Episodes: " + episodesWatched + " | Rating: " + rating);
    
    }
}