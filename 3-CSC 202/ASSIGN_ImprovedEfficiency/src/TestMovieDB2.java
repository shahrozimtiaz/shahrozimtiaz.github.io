import java.io.*;
import java.util.*;
public class TestMovieDB2{

    public static void main(String[] args)throws IOException{
        //Read in movies to query!
        FileInputStream fis = new FileInputStream("./procMovieData.txt");
        Scanner reader = new Scanner(fis);
        ArrayList<Movie> moviesToModify = new ArrayList();
        while(reader.hasNext()){ //reading in
            String[] parts = reader.nextLine().split(",");
            Movie m = new Movie(parts[0],parts[1],parts[2],Integer.parseInt(parts[3]));
            moviesToModify.add(m);
        }
        reader.close();
        
        
        int amount = 10;
        double avgImp=0;
        for(int i=0; i<amount; i++){
            int moviesFound=0;
            fis = new FileInputStream("./searchMovieData.txt");
            reader = new Scanner(fis);
            MovieDB mdb = new MovieDB();
            long st = System.nanoTime();
            while(reader.hasNext()){ //reading in
                String[] parts = reader.nextLine().split(",");
                Movie m = new Movie(parts[0],parts[1],parts[2],Integer.parseInt(parts[3]));
                mdb.add(m);
            }
            for(int j=0; j<moviesToModify.size(); j++)
                if(mdb.contains(moviesToModify.get(j)))
                    moviesFound++;
            for(int j=0; j<moviesToModify.size(); j++)
                mdb.remove(moviesToModify.get(j));
            long et = System.nanoTime();
            reader.close();
            long time1 = et-st;
            System.out.println("Round 1: "+time1);
            
            /////////////////////////////////////////////////////////////////
            // Second set of code - Improved...
            /////////////////////////////////////////////////////////////////
            fis = new FileInputStream("./searchMovieData.txt");
            reader = new Scanner(fis);
            MovieDBImp2 mdbi = new MovieDBImp2();
            st = System.nanoTime();
            while(reader.hasNext()){ //reading in
                String[] parts = reader.nextLine().split(",");
                Movie m = new Movie(parts[0],parts[1],parts[2],Integer.parseInt(parts[3]));
                mdbi.add(m);
            }
            for(int j=0; j<moviesToModify.size(); j++)
                if(mdbi.contains(moviesToModify.get(j)))
                    moviesFound++;
            for(int j=0; j<moviesToModify.size(); j++)
                mdbi.remove(moviesToModify.get(j));
            et = System.nanoTime();
            reader.close();
            long time2 = et-st;
            System.out.println("Round 2: "+time2);
            avgImp += (double)time1/(double)time2;
        }//END FOR
        avgImp/=amount;
        System.out.println("\n\nAVERAGE IMPROVEMENT: "+avgImp);
    }
}
