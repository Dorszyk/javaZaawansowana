package Opp.Ex3;

class Shape {

    private String color;
    private boolean isFiled;

    public Shape(){
        this.color = "unknow";
        this.isFiled = false;

    }

    public Shape(String color, boolean isFiled) {
        this.color = color;
        this.isFiled = isFiled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return isFiled;
    }

    public void setFiled(boolean filed) {
        isFiled = filed;
    }

    @Override
    public String toString() {
        return String.format("Kształt figury z kolorem %s i %s",color, isFiled ? "wypełniony" : "Niewypełniony");
    }


}
