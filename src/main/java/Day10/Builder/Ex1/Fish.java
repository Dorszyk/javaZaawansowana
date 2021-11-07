package Day10.Builder.Ex1;

public class Fish {

    private double length;
    private int age;
    private String color;
    private double weigh;
    private boolean flying;

    private Fish(){

    }

    public static class FishBuilder{
        private double length;
        private int age;
        private String color;
        private double weigh;
        private boolean flying;

        public FishBuilder length(double length){
            this.length = length;
            return this;
        }

        public FishBuilder age(int age){
            this.age = age;
            return this;
        }

        public FishBuilder color(String color){
            this.color = color;
            return this;
        }

        public FishBuilder weigh(double weigh){
            this.weigh = weigh;
            return this;
        }

        public FishBuilder flying(boolean flying){
            this.flying = flying;
            return this;
        }

        public Fish build(){
            Fish fish = new Fish();
            fish.length = this.length;
            fish.age = this.age;
            fish.color = this.color;
            fish.weigh = this.weigh;
            fish.flying = this.flying;

            return fish;

        }

    }

    @Override
    public String toString() {
        return "Fish{" +
                "length=" + length +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weigh=" + weigh +
                ", flying=" + flying +
                '}';
    }
}
