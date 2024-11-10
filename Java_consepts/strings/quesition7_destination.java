package Java_consepts.strings;

public class quesition7_destination {
    // find the sortest path to reach the destination
    public static float getShortestPath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char dir = s.charAt(i);
            // East
            if (dir == 'E') {
                x++;
            }
            // West
            if (dir == 'W') {
                x--;
            }
            // North
            if (dir == 'N') {
                y++;
            }
            // South
            if (dir == 'S') {
                y--;
            }

        }
        int x1 = x * x;
        int y1 = y * y;
        return (float) Math.sqrt(x1 + y1);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
