import java.io.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        String name;
        int age;
        String gender;
        double height;
        double weight;
        double bmi;
        String bmiStatus;



        Scanner one = new Scanner(System.in);
        System.out.println("Enter Name:" );
        name = one.next();
        System.out.println("Name accepted " + name);


        Scanner two = new Scanner(System.in);
        System.out.println("Enter Age:" );
        age = two.nextInt();
        System.out.println("Age accepted " + age);

        
        Scanner three = new Scanner(System.in);
        System.out.println("Enter Gender: F/M" );
        gender = three.next();
        System.out.println("Gender accepted " + gender);


        Scanner four = new Scanner(System.in);
        System.out.println("Enter height:" );
        height = four.nextDouble();
        System.out.println("Height accepted " + height);

        Scanner five = new Scanner(System.in);
        System.out.println("Enter weight:" );
        weight = five.nextDouble();
        System.out.println("Weight accepted " + weight);

        bmi= (weight/ (height*height));

        if(bmi<18.5){
            bmiStatus =" underweight";
        } else if(bmi>18.5 && bmi<24.9){
            bmiStatus="normal";
        } else if(bmi>24.9 && bmi<29.9){
            bmiStatus="overweight";
        } else{
            bmiStatus="obese";
        }

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("text.html"), "utf-8"));
            writer.write("Your name is :" + name + "\n");
            writer.write("Your gender is: " + gender + "   "+ "\n" );
            writer.write("Your age is :" + age + "\n");
            writer.write("Your weight is :" + weight + "\n");
            writer.write("Your height is :" + height + "\n");
            writer.write("BMI: WEIGHT(kg)/ (HEIGHT(m))^2"+ "\n");
            writer.write("YOUR BMI:" + bmi+"\n");
            writer.write("BMI STATUS IS :" + bmiStatus+"\n");
        } catch (IOException ex) {
            // report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }
}
