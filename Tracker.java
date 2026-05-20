import java.util.*;
public class Tracker{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    Anime watchlist []=new Anime[50];
    int count=0;
    int k;
    do{
        System.out.println("1. Add Show");
        System.out.println("2. View All");
        System.out.println("3. Sort by Rating");
        System.out.println("4. Exit");
        k=in.nextInt();
        switch(k){
            case 1: 
            String title;
            int episodeswatched;
            double rating;
            in.nextLine();
            System.out.println("Enter the title :");
            title=in.nextLine();
            System.out.println("Enter the number of episodes watched :");
            episodeswatched=in.nextInt();
            System.out.println("Enter the rating of the anime :");
            rating=in.nextDouble();
            watchlist[count]=new Anime(title,episodeswatched,rating);
            count++;
            break;
            case 2:
                for(int i=0;i<=count-1;i++){
                    watchlist[i].display();
                }
                break;
                case 3:
                    int i,j;
                    
                    for(i=0;i<count-1;i++)
                    {
                        for(j=0;j<(count-1)-i;j++)
                        {
                            if(watchlist[j].rating<watchlist[j+1].rating){
                            Anime t=watchlist[j];
                        watchlist[j]=watchlist[j+1];
                        watchlist[j+1]=t;
                            }
                        }
                        
                    }
                    break;
                    case 4:
                        System.out.println("Goodbye");
                        break;
                        default:
                            System.out.println("Wrong choice !!!");
        }

    }
    while(k!=4);

    }
}