import model.Customer;
import org.jetbrains.annotations.NotNull;
import util.Testing;

import java.util.LinkedList;
import java.util.List;

import static java.lang.System.exit;

public class Main {

    public static void main(String args[]) {
        // get a List<model.Customer> to test sorting algorithm
        List<Customer> customers = Testing.populateCustomerList();

        // display the names of customers in the unsorted list
        System.out.println("\nUnsorted:");
        printCustomerNames(customers);

        // create a list to store the sort results and instantiate it with the result of getSortedList
        List<Customer> sortedCustomers = sortCustomers(customers);

        // display names of customers in the sorted list
        System.out.println("\nRegular sort:");
        printCustomerNames(sortedCustomers);

        // reset the list
        customers = Testing.populateCustomerList();

        // reverse sort the list
        System.out.println("\nReverse sort:");
        List<Customer> reverseSortedCustomers = reverseSortCustomers(customers);

        // display names of customers in the sorted list
        printCustomerNames(reverseSortedCustomers);
    }

    private static void printCustomerNames(@NotNull List<Customer> customers) {
        for (Customer c : customers) {
            System.out.println("\t" + c.getName());
        }
    }

    @NotNull
    private static LinkedList<Customer> sortCustomers(@NotNull List<Customer> customers) {
        LinkedList<Customer> sortedCustomers = new LinkedList<>();

        for (Customer c : customers) {
            boolean found = false;
            int index = 0;

            while (!found) {
                if (index == sortedCustomers.size()) {
                    found = true;
                } else {
                    switch (c.compareTo(sortedCustomers.get(index))) {
                        case -1: {
                            found = true;
                            break;
                        }
                        case 0: {
                            ++index;
                            break;
                        }
                        case 1: {
                            ++index;
                            break;
                        }
                        default: {
                            exit(-1);
                        }
                    }
                }
            }

            if (sortedCustomers.size() == 0 || index == sortedCustomers.size()) {
                sortedCustomers.add(c);
            } else {
                sortedCustomers.add(index, c);
            }
        } // fall out of range-based for loop
        return sortedCustomers;
    }

    @NotNull
    private static LinkedList<Customer> reverseSortCustomers(@NotNull List<Customer> customers) {
        LinkedList<Customer> sortedCustomers = new LinkedList<>();

        for (Customer c : customers) {
            boolean found = false;
            int index = 0;

            while (!found) {
                if (index == sortedCustomers.size()) {
                    found = true;
                } else {
                    switch (c.reverseCompareTo(sortedCustomers.get(index))) {
                        case -1: {
                            found = true;
                            break;
                        }
                        case 0: {
                            ++index;
                            break;
                        }
                        case 1: {
                            ++index;
                            break;
                        }
                        default: {
                            exit(-1);
                        }
                    }
                }
            }

            if (sortedCustomers.size() == 0 || index == sortedCustomers.size()) {
                sortedCustomers.add(c);
            } else {
                sortedCustomers.add(index, c);
            }
        } // fall out of range-based for loop
        return sortedCustomers;
    }
}