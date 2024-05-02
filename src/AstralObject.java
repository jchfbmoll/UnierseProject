import java.util.ArrayList;
import java.util.List;

public abstract class AstralObject {

    String name;
    String type;
    int weight;


    abstract void getTime();

    String getName(){
        return name;
    }
    String getType(){
        return type;
    }
    int getWeight() {
        return weight;
    }
}
