package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("hello")) {
            return "Testing this app";
        }
        if (query.toLowerCase().contains("name")) {
            return "hello";
        }
        if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split(" ");
            int largest = 0;
            for (String part: parts) {
                try {
                    if (Integer.parseInt(part) > largest) {
                        largest = Integer.parseInt(part);
                    }
                }
                catch (Exception e) {
                }
            }

            return largest + "";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            int sum = 0;
            for (String part: parts) {
                try {
                    sum += Integer.parseInt(part);
                }
                catch (Exception e) {
                }
            }

            return sum + "";
        }
        if (query.toLowerCase().contains("multiplied")) {
            String[] parts = query.split(" ");
            int product = 1;
            for (String part: parts) {
                try {
                    product *= Integer.parseInt(part);
                }
                catch (Exception e) {
                }
            }

            return product + "";
        }
        return "";
    }
}
