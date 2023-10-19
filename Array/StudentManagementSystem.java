import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxStudents = 100;
        int maxSubjects = 5;

        String[][] studentRecords = new String[maxStudents][maxSubjects+2]; // 2 extra columns for name and roll number
        int studentCount = 0;

        while(true) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Student Records");
            System.out.println("3. View Student Details by Roll Number");
            System.out.println("4. Calculate Student Average Marks");
            System.out.println("5. View Subject-wise Topper");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    if(studentCount < maxStudents) {
                        addStudentRecord(sc, studentRecords, studentCount);
                        studentCount++;
                    } else {
                        System.out.println("Maximum student limit reached!");
                    }
                    break;

                case 2:
                    viewAllStudentRecords(studentRecords, studentCount);
                    break;

                case 3:
                    viewStudentDetailsByRollNumber(sc, studentRecords, studentCount);
                    break;

                case 4:
                    calculateStudentAverageMarks(sc, studentRecords, studentCount);
                    break;

                case 5:
                    viewSubjectWiseTopper(studentRecords, studentCount);
                    break;

                case 6:
                    System.out.println("Exiting the program...");
                    sc.close();
                    System.exit(0); // 0 means normal termination
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }// end of switch
        }// end of while
    }// end of main

    public static void addStudentRecord(Scanner sc, String[][] studentRecords, int studentCount) {
        sc.nextLine();  // to consume the extra \n character
        System.out.println("Enter Student's Name: ");
        String name = sc.nextLine();
        studentRecords[studentCount][0] = name;

        System.out.println("Enter Student's Roll Number: ");
        String rollNumber = sc.nextLine();
        studentRecords[studentCount][1] = rollNumber;

        for(int i = 2; i < studentRecords[0].length; i++) {
            System.out.println("Enter marks for Subject " + (i-1) + ": ");
            int marks = sc.nextInt();
            studentRecords[studentCount][i] = String.valueOf(marks);
        }
        System.out.println("Student record added successfully!");
    }// end of addStudentRecord


    public static void viewAllStudentRecords(String[][] studentRecords, int studentCount) {
        if(studentCount == 0) {
            System.out.println("No student records found!");
            return;
        }

        System.out.println("All Student Records: ");
        for(int i=0; i<studentCount; i++) {
            System.out.println("Name: " + studentRecords[i][0] + ", ");
            System.out.println("Roll Number: " + studentRecords[i][1] + ", ");
            System.out.println("Marks: ");
            for(int j=2; j<studentRecords[0].length; j++) {
                System.out.print("Subject " + (j-1) + ": " + studentRecords[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void viewStudentDetailsByRollNumber(Scanner sc, String[][] studentRecords, int studentCount) {
        sc.nextLine();  // to consume the extra \n character
        System.out.println("Enter the Roll Number to view student details: ");
        String rollNumber = sc.nextLine();
        boolean found = false;

        for(int i=0; i<studentCount; i++) {
            if(rollNumber.equals(studentRecords[i][1])) {
                System.out.println("Student Details: ");
                System.out.println("Name: " + studentRecords[i][0] + ", ");
                System.out.println("Roll Number: " + studentRecords[i][1] + ", ");
                System.out.println("Marks: ");
                for(int j=2; j<studentRecords[0].length; j++) {
                    System.out.print("Subject " + (j-1) + ": " + studentRecords[i][j] + ", ");
                }
                System.out.println();
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student with Roll Number " + rollNumber + " not found!");
        }
    }

    public static void calculateStudentAverageMarks(Scanner sc, String[][] studentRecords, int studentCount) {
        sc.nextLine();
        System.out.println("Enter the Roll Number to calculate average marks: ");
        String rollNumber = sc.nextLine();
        int totalMarks = 0;
        int subjectCount = studentRecords[0].length - 2;
        boolean found = false;

        for(int i=0; i<studentCount; i++) {
            if(rollNumber.equals(studentRecords[i][1])) {
                for(int j=2; j<studentRecords[0].length; j++) {
                    totalMarks += Integer.parseInt(studentRecords[i][j]);
                }
                double averageMarks = (double) totalMarks / subjectCount;
                System.out.println("Average marks for student with Roll Number " + rollNumber + " is " + averageMarks);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student with Roll Number " + rollNumber + " not found!");
        }
    }

    public static void viewSubjectWiseTopper(String[][] studentRecords, int studentCount) {
        if (studentCount == 0) {
            System.out.println("No student records found!");
            return; // exit the method
        }

        for(int i=2; i<studentRecords[0].length; i++) {
            int maxMarks = Integer.MIN_VALUE;
            String subjectName = "Subject " + (i - 1);
            String topperName = "";

            for(int j=0; j<studentCount; j++) {
                int marks = Integer.parseInt(studentRecords[j][i]);
                if(marks > maxMarks) {
                    maxMarks = marks;
                    topperName = studentRecords[j][0];
                }
            }
            System.out.println("Topper in " + subjectName + ": " + topperName + " with " + maxMarks + " marks.");
        }
    }
}// end of class

/*
Problem Statement: Student Record Management System

You are tasked with creating a Student Record Management System using Java. The system should allow users to perform various operations on student records using both 1D and 2D arrays. The program should provide the following menu options:

1. Add a Student Record
   - Prompt the user to enter the student's name, roll number, and marks for multiple subjects. Store this information in a 2D array.

2. View All Student Records
   - Display a list of all student records including their name, roll number, and marks in each subject.

3. View Student Details by Roll Number
   - Prompt the user to enter a roll number, and then display the details (name, roll number, and marks) of the student with that roll number.

4. Calculate Student Average Marks
   - Prompt the user to enter a roll number, and then calculate and display the average marks for the student with that roll number.

5. View Subject-wise Topper
   - Display the student who scored the highest marks in each subject.

6. Exit
   - Terminate the program.

Your program should use a combination of 1D and 2D arrays to store and manage student records. You should implement error handling to ensure that the program does not crash if invalid inputs are provided.

Remember to provide a user-friendly interface with clear instructions and ensure that the program continues running until the user chooses to exit.

*/