package edu.wsb.students;

import java.util.Scanner;

class Controller {

    private boolean doAction = true;

    private Scanner scanner;

    void start() {
        while (doAction) {
            writeHelpText();
            doAction();
        }
    }

    private void writeHelpText() {
        System.out.println("\nEnter number:");
        System.out.println("1  - add new car");
        System.out.println("2  - add new customer");
        System.out.println("3  - add new order");
        System.out.println("4  - get all cars");
        System.out.println("5  - get all customers");
        System.out.println("6  - get all orders");
        System.out.println("7  - delete car");
        System.out.println("8  - delete customer");
        System.out.println("9  - complete with order");
        System.out.println("0 - exit\n");
    }

    private void doAction() {
        System.out.print("Enter option: ");

        scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        System.out.println();

        switch (option){
            case "1":
                addCar();
                break;
            case "2":
                addCustomer();
                break;
            case "3":
                addOrder();
                break;
            case "4":
                getAllCars();
                break;
            case "5":
                getAllCustomers();
                break;
            case "6":
                getAllOrders();
                break;
            case "7":
                deleteCar();
                break;
            case "8":
                deleteCustomer();
                break;
            case "9":
                deleteOrder();
                break;
            case "0":
                doAction = false;
        }
    }

    private void addCar() {
        // TODO
    }

    private void addCustomer() {
        // TODO
    }

    private void addOrder() {
        // TODO
    }

    private void getAllCars() {
        // TODO
    }

    private void getAllCustomers() {
        // TODO
    }

    private void getAllOrders() {
        // TODO
    }

    private void deleteCar() {
        // TODO
    }

    private void deleteCustomer() {
        // TODO
    }

    private void deleteOrder() {
        // TODO
    }

}
