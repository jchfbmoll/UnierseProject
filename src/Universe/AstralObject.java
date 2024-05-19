package Universe;

import java.util.ArrayList;
import java.util.List;

public abstract class AstralObject {

   private String name;
   private String type;

   public abstract void getTime();
   public abstract String getName();
   public String getType(){
      return type;
   }
   public abstract int getWeight();
}

