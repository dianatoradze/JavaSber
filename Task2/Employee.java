package Task2;

import java.util.ArrayList;
import java.util.List;

public class Employee  {
    private final String name;

    private static final List<Letter> messages = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    //
    public Employee setEmployee(Employee employee) {

        return employee;
    }

    public static void addNewMessage(int number, String title, Employee sender, Employee receiver, String text) {
        messages.add(new Letter(number, title, sender, receiver, text));
    }

    public static void showDialog(Employee u1, Employee u2) {

        for (Letter message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2 ||
                    message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender() + ": " + message.getText());

            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    }





