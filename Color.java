import java.util.Random;

public class Color
{
    private int red;
    private int green;
    private int blue;
    Random rand = new Random(256);

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color() {
        red = rand.nextInt(256);
        green = rand.nextInt(256);
        blue = rand.nextInt(256);
    }

    public void Randomize() {
        red = rand.nextInt(256);
        green = rand.nextInt(256);
        blue = rand.nextInt(256);
    }

    public void Darken(double percent) {
        red *= (1 - ((double)percent / 100));
        green *= (1- ((double)percent / 100));
        blue *= (1 - ((double)percent / 100));
        Clamp();
    }

    public void Brighten(double percent) {
        red *= (1 + ((double)percent / 100));
        green *= (1 + ((double)percent / 100));
        blue *= (1 + ((double)percent / 100));
        Clamp();
    }

    public void setRed(int red) {
        this.red = red;
        Clamp();
    }

    public void setGreen(int green) {
        this.green = green;
        Clamp();
    }

    public void setBlue(int blue) {
        this.blue = blue;
        Clamp();
    }

    public void getRed() {
        System.out.println(this.red);
    }

    public void getBlue() {
        System.out.println(this.blue);
    }

    public void getGreen() {
        System.out.println(this.green);
    }

    public void Clamp() {
        if (red > 255){
            red = 255;
        }
        if (red < 0){
            red = 0;
        }
        if (green > 255){
            green = 255;
        }
        if (green < 0){
            green = 0;
        }
        if (blue > 255){
            blue = 255;
        }
        if (blue < 0){
            blue = 0;
        }
    }

    public void Final() {
        System.out.println("[" + red + ", " + green + ", " + blue + "]");
    }

}