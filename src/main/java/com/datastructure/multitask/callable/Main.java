package com.datastructure.multitask.callable;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException, ExecutionException, InterruptedException {
        Path path = Paths.get("\\app\\users\\estudo\\file.txt");
        List<Integer> numbers = Files.readAllLines(path)
                .stream().map(Integer::valueOf).collect(Collectors.toList());

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> sumFuture = executorService.submit(new SumCallable(numbers));
        Future<Integer> subFuture = executorService.submit(new SubCallable(numbers));
        Future<Double> avgFuture = executorService.submit(new AvgCallable(numbers));
        Future<Integer> biggerFuture = executorService.submit(new BiggerCallable(numbers));
        Future<Integer> smallerFuture = executorService.submit(new SmallerCallable(numbers));

        Integer sum = sumFuture.get();
        Integer sub = subFuture.get();
        Double avg = avgFuture.get();
        Integer bigger = biggerFuture.get();
        Integer smaller = smallerFuture.get();

        executorService.shutdown();

        System.out.println("Soma: " + sum);
        System.out.println("Subtacao: " + sub);
        System.out.println("Média: " + avg);
        System.out.println("Máximo: " + bigger);
        System.out.println("Mínimo: " + smaller);
    }
}
