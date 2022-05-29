package com.company;

public class TStudent {
    private String studentId;
    private String firstName;
    private String lastName;
    private String groupId;
    private Integer numberOfDebt;

    public TStudent(final String inputStudent) {
        if (inputStudent == null || inputStudent.isEmpty()) {
            throw new RuntimeException("Incorrect info!");
        }
        final String[] studentInfo = inputStudent.split(", ");
        if (studentInfo.length != 5) {
            throw new RuntimeException("Some student's data is not exist!");
        }
        this.studentId = studentInfo[0];
        this.firstName = studentInfo[1];
        this.lastName = studentInfo[2];
        this.groupId = studentInfo[3];
        this.numberOfDebt = Integer.valueOf(studentInfo[4]);
    }

    public TStudent() {
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroupId() {
        return groupId;
    }

    public Integer getNumberOfDebt() {
        return numberOfDebt;
    }
}
