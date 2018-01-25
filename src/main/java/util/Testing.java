package util;

import model.Customer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class Testing {

    @NotNull
    public static ArrayList<Customer> populateCustomerList() {
        return new ArrayList<>(
                Arrays.asList(
                        new Customer("Jim"),
                        new Customer("Apple"),
                        new Customer("Zoe"),
                        new Customer("Applet"),
                        new Customer("Foo"),
                        new Customer("Apple"),
                        new Customer("Applet"),
                        new Customer("Chris")
                )
        );
    }
}
