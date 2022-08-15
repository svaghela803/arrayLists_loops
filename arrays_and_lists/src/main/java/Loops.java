import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("silver");
        colours.add("pink");

        System.out.println(colours);

        System.out.println("--Using enhanced for loop--"); //Use enhanced for loop as default unless otherwise

        for (String colour : colours){
            System.out.println(colour);
        }

        System.out.println("--Using classic for loop--"); //Classic loop allows more flexibility

//        for stopping condition, use less than sign and colours.size will keep continuing
        for(int i = 0; i < colours.size(); i++){
            String colour = colours.get(i); // get will give you the starting item e.g. red
            System.out.println(colour);
        }

        //Prints every other number e.g. 1, 3, 5, 7. 9
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i+=2) {
            numbers.add(i);
        }

        System.out.println("numbers: " + numbers);

    }
}
