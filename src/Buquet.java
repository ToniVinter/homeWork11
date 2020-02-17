import java.util.HashSet;
import java.util.Set;

public class Buquet {
        private Set<String> buquet = new HashSet<>();
        public Buquet( HashSet buquet){
            this.buquet = buquet;
        }
        public String getAll(){
                return buquet.toString();
        }
        public void add(String flower){
                buquet.add(flower);
        }
        public void remove(String flower){
                if(buquet.contains(flower)){
                        buquet.remove(flower);
                }else{
                        System.out.printf("There's no %s to remove", flower);
                }
        }


}
