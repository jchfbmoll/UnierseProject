package Universe;

public class BlackHole extends AstralObject {

    private int weight;
    private String name;
    private String type = "Black Hole";
    private long initial_time;


    public BlackHole() {

    }
    public BlackHole(String name) {
        this.name = name;
        this.weight = 0;
        this.initial_time = System.currentTimeMillis();
    }

    @Override
    public void getTime() {
        long now = System.currentTimeMillis();
        long edat = now - initial_time;
        edat /= 1000;
        long seconds = edat % 60;
        edat /= 60;
        long minutes = edat % 60;
        edat /= 60;
        long hours = edat % 24;
        edat /= 24;
        long days = edat % 30;
        edat /= 30;
        long months = edat % 12;
        long years = edat / 12;
        System.out.println("Aquest forat negre té una edat de " + years + " anys, " + months + " mesos, " + days + " dies, " + hours + " hores, " + minutes + " minuts i " + seconds + " segoms");
    }

    public int getWeight() {
        return this.weight;
    }

    public void eatAstralObject(AstralObject astralObject) {
        weight += astralObject.getWeight();
    }

    public void eatSolarObject(SolarObject solarObject) {
        weight += solarObject.getWeight();
    }
    public String getType() {
        return type;


    }
    public String getName() {
        return name;
    }


}