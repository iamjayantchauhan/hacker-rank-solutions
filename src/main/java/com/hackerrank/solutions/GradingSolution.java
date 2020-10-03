package com.hackerrank.solutions;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 *   Grading Problem
 *
 * https://www.hackerrank.com/challenges/grading/problem
 *
 **/
class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(e -> {
            if (e <= 38) {
                return e;
            } else {
                Integer roundedNumber = (e + 4) / 5 * 5;
                if ((roundedNumber - e) < 3) {
                    return roundedNumber;
                } else {
                    return e;
                }
            }
        }).collect(toList());
    }

}

public class GradingSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("RANK_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(gradesCount);
        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        System.out.println(result);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
