import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {



        List<String> favorites = new ArrayList<>();
       
       favorites.add("Quran");
       favorites.add("Best habits");
       favorites.add("Big mama");
       favorites.add("Midnight");
       favorites.add("365 days");
       
       favorites.remove("Big mama");
       
       for(String favs : favorites){
           System.out.println(favs);
       }
        

        
    }
}
