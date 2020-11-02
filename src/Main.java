import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        LinkedList cities = new LinkedList();
        ArrayList<String> destinations = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<String> source = new ArrayList<>();

        String inputData = new String();

        try {
            //Path of file
            Scanner scanner = new Scanner(new File("C:\\Users\\David\\IdeaProjects\\Trains\\src\\InputData.csv"));

            while (scanner.hasNext()) {
                inputData = scanner.nextLine();
                System.out.println("Data from input file: " + inputData);

            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String[] splitArray = inputData.split(",");

        System.out.println("Direct Graph Array: " + Arrays.toString(splitArray));

        for(int i = 0; i < splitArray.length;i++){
            String[] nodeData = splitArray[i].split("");
            source.add(nodeData[0]);
            destinations.add(nodeData[1]);
            weight.add(Integer.parseInt(nodeData[2]));

        }
        System.out.println("split into list individual lists: 1 to 1 to 1 indexing");
        System.out.println(source);
        System.out.println(destinations);
        System.out.println(weight);

    }
}
