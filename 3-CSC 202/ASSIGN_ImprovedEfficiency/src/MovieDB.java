public class MovieDB{
    private Movie[] entries;
    private int last;
    
    public MovieDB(){
        entries = new Movie[5];
        last=-1;
    }
    
    public void add(Movie m){
        if(last==entries.length-1) growArr();
        last++;
        for(int i=0; i<last; i++){
            if(entries[i].compareTo(m)>0){
                Movie temp = entries[i];
                entries[i] = m;
                m = temp;
            }
        }
        entries[last]=m;
    }
    
    private void growArr(){
        Movie[] newArr = new Movie[entries.length+1];
        for(int i=0; i<entries.length; i++)
            newArr[i]=entries[i];
        entries = newArr;
    }
    
    public void remove(Movie m){
        boolean removed = false;
        for(int i=0; i<=last; i++){
            if(!removed && m.equals(entries[i])){
                for(int j=i; j < last; j++) entries[j]=entries[j+1];
                last--;
                removed = true;
            }
        }
    }
    
    public Movie get(int ind){
        return entries[ind];
    }
    
    public boolean contains(Movie m){
        boolean flag = false;
        for(int i=0; i<=last; i++){
            if(m.equals(entries[i])) flag=true;
        }
        return flag;
    }

    public int size(){
        return last+1;
    }
}
