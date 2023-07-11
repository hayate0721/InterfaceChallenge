import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium", UsageType.SPORTS));

        mappables.add(new UtilityLIne("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLIne("Olympic Blvd", UtilityType.WATER));


        for(var m : mappables){
            Mappable.mapIt(m);
        }

    }
}
