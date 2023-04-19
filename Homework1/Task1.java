package Homework1;

//* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws MyException, IOException, NumberFormatException {
        Task1 task1 = new Task1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder height;
        System.out.print("Input your height: ");

        //* test1*/
        height  = task1.inputHeight1(reader);

        //* test2*/
//        height  = task1.inputHeight2(reader);

        //* test3*/
//        height  = task1.inputHeight3(reader);

        System.out.println("Data accepted: " + height + " cm");
    }
    public StringBuilder inputHeight1(BufferedReader r) throws  IOException{
        StringBuilder h1 = new StringBuilder(r.readLine());
        if (h1.length() == 0) {
            throw new IOException("Input can not be empty!");
        }
        return h1;
    }
    public StringBuilder inputHeight2(BufferedReader r) throws MyException, IOException {
        StringBuilder h2 = new StringBuilder(r.readLine());
        if (Integer.parseInt(h2.toString().trim()) <= 0) {
            throw new MyException("Height can not be zero or negative!");
        }
        return h2;
    }
    public StringBuilder inputHeight3(BufferedReader r) throws NumberFormatException, IOException {
        StringBuilder h3 = new StringBuilder(r.readLine());
        try {
            Integer.parseInt(h3.toString());
        } catch (NumberFormatException e) {
            System.out.println("Height has to be a number!");
            System.exit(0);
        }
        return h3;
    }
}
