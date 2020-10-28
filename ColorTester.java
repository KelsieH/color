public class ColorTester
{
    public static void main(String[] args) {
        Color one = new Color();
        Color two = new Color(77, 130, 54);

        one.Final();
        two.Final();
        two.Darken(10);
        two.Final();
        one.Randomize();
        one.Final();
        one.Brighten(10);
        one.Final();
    }    
}