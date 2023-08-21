package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(
                List.of(
                        new Product("Apple", new BigDecimal("0.60"), 5),
                        new Product("Orange", new BigDecimal("0.25"), 3),
                        new Product("Banana", new BigDecimal("0.20"), 2)
        ));

        //#1 count total price of shopping cart
        BigDecimal totalPrice = null;


        //#3 find product names for which total pice is greater than 1.00

        List<String> names = null;



        ////////




        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );

        Integer sum = matrix.stream()
                .flatMap(Collection::stream)
                        .reduce(Integer::sum)
                .orElseThrow(IllegalArgumentException::new);
    }
}
