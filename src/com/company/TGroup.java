package com.company;

public class TGroup {
    private String studentId;
    private String firstName;
    private String lastName;
    private String groupId;

    public TGroup(String studentId, String firstName, String lastName, String groupId) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "TGroup{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId='" + groupId + '\'' +
                '}';
    }
}
