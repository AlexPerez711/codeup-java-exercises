public class RubberPegasus {
    public String name;
    public String color;
    public String noise;
    public String hairColor;
    public String location;
        public RubberPegasus(String name, String color, String noise, String hairColor, String location){
            this.name= name;
            this.color = color;
            this.noise = noise;
            this.hairColor = hairColor;
            this.location = location;
        }
    public static void main(String[] args) {
            RubberPegasus juanJulio = new RubberPegasus("Juan Julio","white", "squeek", "pink hair", "on my notebook");
            System.out.format("%s is a %s rubber pegasus with %s that %s and is located %s.",juanJulio.name, juanJulio.color, juanJulio.hairColor,juanJulio.noise, juanJulio.location);
    }
}


