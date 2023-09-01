import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* int[] arr = new int[4];

        System.out.println("plz enter the new arr size");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];*/

        String[] names = {"anis", "sami", "ali"};
        System.out.println(names.length);

        for (int i = 0; i <names.length; i++) {
            if (names[i].equalsIgnoreCase("anis")) {
                System.out.println("Enter new name");
                String newName = scanner.nextLine();
                names[i] = newName;
                break;
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        /*int[] nums = new int[4];



        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Plz enter the element");
            nums[i] = scanner.nextInt();
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }*/



        /*System.out.println("plz enter the size of array");
        int size = scanner.nextInt();

        int[] nums = new int[size];*/

        /*int nums[] = {3, 7, 2, 1};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/

        /*int[] nums = new int[10];
        nums[0] = 50;
        nums[1] = 40;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/


        /*int[] arr = new int[5];

        System.out.println(arr.length);
        System.out.println(arr[0]);
        arr[0] = 10;
        System.out.println(arr[0]);
        arr[1] = arr[0];
        System.out.println(arr[1]);

        int x = arr[0];


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        //System.out.println(arr[-1]);//ArrayIndexOutOfBoundsException
        //System.out.println(arr[5]);//ArrayIndexOutOfBoundsException

        /*for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }*/
    }
}
