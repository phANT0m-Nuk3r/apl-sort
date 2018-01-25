package model;

import org.jetbrains.annotations.NotNull;

import static java.lang.System.exit;

public class Customer {
    private String name;

    public Customer(@NotNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /** DIY COMPARISON FUNCTION */
    public int compareTo(@NotNull Customer c2) {
        int index = 0;

        while ((index < name.length()) && (index < c2.getName().length())) {
            // IF STR1[i] < STR2[i]  return  <
            if (name.charAt(index) < c2.getName().charAt(index)) {
                return -1;
            }
            // IF STR1[i] > STR2[i]  return  >
            if (name.charAt(index) > c2.getName().charAt(index)) {
                return 1;
            }
            // IF STR1[i] == STR2[i]  ++i then start again
            if (name.charAt(index) == c2.getName().charAt(index)) {
                ++index;
            }
        }

        // IF STR1[i] is STR1.end()  &&  STR2[i] is STR2.end()  return  ==
        if ((name.length() == index) && (c2.getName().length() == index)) {
            return 0;
        }
        // IF STR1[i] is STR1.end()  return  shorter
        if (name.length() == index) {
            return -1;
        }
        // IF STR2[i] is STR2.end()  return  longer
        if (c2.getName().length() == index) {
            return 1;
        }

        exit(-1);
        return 0;
    }

    /** DIY REVERSE COMPARISON FUNCTION */
    public int reverseCompareTo(@NotNull Customer c2) {
        int index = 0;

        while ((index < name.length()) && (index < c2.getName().length())) {
            // IF STR1[i] < STR2[i]  return  <
            if (name.charAt(index) < c2.getName().charAt(index)) {
                return 1;
            }
            // IF STR1[i] > STR2[i]  return  >
            if (name.charAt(index) > c2.getName().charAt(index)) {
                return -1;
            }
            // IF STR1[i] == STR2[i]  ++i then start again
            if (name.charAt(index) == c2.getName().charAt(index)) {
                ++index;
            }
        }

        // IF STR1[i] is STR1.end()  &&  STR2[i] is STR2.end()  return  ==
        if ((name.length() == index) && (c2.getName().length() == index)) {
            return 0;
        }
        // IF STR1[i] is STR1.end()  return  shorter
        if (name.length() == index) {
            return 1;
        }
        // IF STR2[i] is STR2.end()  return  longer
        if (c2.getName().length() == index) {
            return -1;
        }

        exit(-1);
        return 0;
    }
}