 public class Main{
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();
        
        
        m1.title = "The Lion King";
        m1.genre = "Animation and Drama";
        m1.duration = 88;
        
        m2.title = "Beauty and the beast";
        m2.genre = "Animation and Romance";
        m2.duration = 84;
        
        m3.title = "Aladdin";
        m3.genre = "Animation and Fantasy";
        m3.duration = 90;


        
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();
    }
 }
