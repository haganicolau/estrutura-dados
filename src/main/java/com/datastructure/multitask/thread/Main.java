package com.datastructure.multitask.thread;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {

        Path path = Paths.get("\\app\\users\\estudo\\file.txt");
        List<Integer> numbers = Files.readAllLines(path)
                .stream().map(Integer::valueOf).collect(Collectors.toList());

        SumNumbers sumNumbers = new SumNumbers(numbers);
        sumNumbers.start();

        AvgNumbers avgNumbers = new AvgNumbers(numbers);
        avgNumbers.start();

        SubNumbers subNumbers = new SubNumbers(numbers);
        subNumbers.start();

        BiggerNumber biggerNumber = new BiggerNumber(numbers);
        biggerNumber.start();

        SmallerNumber smallerNumber = new SmallerNumber(numbers);
        smallerNumber.start();

    }
}
