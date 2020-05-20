package edu.wsb.students;

import edu.wsb.students.dao.OrderDao;
import edu.wsb.students.model.Car;
import edu.wsb.students.model.Customer;
import edu.wsb.students.model.Order;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

class Controller {

    private OrderDao orderDao = new OrderDao();

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
        int customerId, carId;

        System.out.print("Enter customer id: ");
        customerId = scanner.nextInt();

        System.out.print("Enter car id: ");
        carId = scanner.nextInt();

        Car car = new Car();
        car.setId(carId);

        Customer customer = new Customer();
        customer.setId(customerId);

        orderDao.addOrder(new Order(LocalDate.now(), 0, car, customer));
    }

    private void getAllCars() {
        // TODO
    }

    private void getAllCustomers() {
        // TODO
    }

    private void getAllOrders() {
        List<Order> orders = orderDao.getAllOrders();
        if (orders.isEmpty()) {
            System.out.println("No any orders\n");
        }
        for (Order order : orders) {
            System.out.println("\t" + order.toString());
        }
    }

    private void deleteCar() {
        // TODO
    }

    private void deleteCustomer() {
        // TODO
    }

    private void deleteOrder() {
        int orderId;

        System.out.print("Enter order id: ");
        orderId = scanner.nextInt();

        orderDao.deleteOrder(orderId);
    }

}
