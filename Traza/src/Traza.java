public class Traza {
    public static void main(String[] args) {
        double x, y;
        x = 15.0;
        y = 10.0;

        int var1 = (int) ((x / 4) + 1); // var1 vale 4
        int var2 = (int) (y / 4); // var2 vale 2

        while (var1 > 0) {
            var1 = var1 - 1; // var1 vale 3
            var2 = var2 * var1; // var2 vale 12
            System.out.println(var2 + " ");
        }
    }
}
