package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//HackerLand University has the following grading policy:
//
//Every student receives a grade in the inclusive range from 0 to 100.
//Any grade less than 40 is a failing grade.
//Sam is a professor at the university and likes to round each student's grade according to these rules:
//
//If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
//If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
//Examples
//
// grade = 84 round to  85(85 - 84 is less than 3)
// grade = 29 do not round (result is less than 40)
// grade = 57 do not round (60 - 57 is 3 or higher)
//Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
//
//Function Description
//
//Complete the function gradingStudents in the editor below.
//
//gradingStudents has the following parameter(s):
//
//int grades[n]: the grades before rounding
//Returns
//
//int[n]: the grades after rounding as appropriate
//Input Format
//
//The first line contains a single integer, n, the number of students.
//Each line  of the  subsequent lines contains a single integer, grades[i].
//
//Constraints
//1 <= n <= 60
//0 <= grades[i] <= 100

public class GradingStudents {

    public GradingStudents(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma sequencia de números represetnados as notas do estudantes separadas por vírgula:");

        String numbers = scan.nextLine();
        int[] ar = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        List<Integer> grades = new ArrayList<>();
        for(int number: ar){
            grades.add(number);
        }

        gradingStudents(grades);
    }

    private void gradingStudents(List<Integer> grades){
        int students = grades.size();
        List<Integer> finalGrade = new ArrayList();
        for(int i = 0; i < students; i++){
            int grade = grades.get(i);
            if(grade >= 38){
                if(grade % 5 >= 3){
                    grade += 5 - (grade % 5);
                }
            }
            finalGrade.add(grade);
        }

        System.out.println(finalGrade);
    }
}
