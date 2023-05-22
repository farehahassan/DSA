public class LinearSeachh {
    public static void main(String[] args) {
        int data[] = { 20, 50, 10, 40, 30, 25, 45, 100, 80, 60 };
        int item = 40;
        int loc = -1;
        for (int i = 0; i < data.length; i++) {
            if (item == data[i]) {
                loc = i;
                System.out.println("Item found at location: " + loc);
                break;
            }
        }
        if (loc == -1)
            System.out.println(item + " is not in the list.");
    }
}