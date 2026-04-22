package com.patika.java101.obs;

public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }

    public void addBulkOralNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.oralNote = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.oralNote = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.oralNote = chemistry;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Grades have not been fully entered.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average: " + this.average);

            if (this.isPass) {
                System.out.println("Passed the class.");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void calcAverage() {
        double mathAvg = (math.note * (1 - math.oralWeight)) + (math.oralNote * math.oralWeight);
        double physicsAvg = (physics.note * (1 - physics.oralWeight)) + (physics.oralNote * physics.oralWeight);
        double chemistryAvg = (chemistry.note * (1 - chemistry.oralWeight)) + (chemistry.oralNote * chemistry.oralWeight);

        this.average = (mathAvg + physicsAvg + chemistryAvg) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.println("Math Grade: " + this.math.note);
        System.out.println("Physics Grade: " + this.physics.note);
        System.out.println("Chemistry Grade: " + this.chemistry.note);
    }
}
