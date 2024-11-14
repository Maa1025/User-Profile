package user.profile;

import java.util.Scanner;

public class UserProfile {


    public static void main(String[] args) {
        
        String name;
        int age;
        String hobby;
        String favoriteFood;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        System.out.print("Enter your hobby: ");
        hobby = scanner.nextLine();

        System.out.print("Enter your favorite food: ");
        favoriteFood = scanner.nextLine();

        System.out.println("\nYour Profile:");
        System.out.println("------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);

        scanner.close();
    }
    
}