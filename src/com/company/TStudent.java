package com.company;

public class TStudent {
    private String studentId;//код студента
    private String firstName;//имя
    private String lastName;//фамилия
    private String groupId;//код группы
    private Integer numberOfDebt;//число долгов
//конструктор принимает студента
    public TStudent(final String inputStudent) {
        if (inputStudent == null || inputStudent.isEmpty()) {//если студент пустое значение
            throw new RuntimeException("Некорректный ввод!");
        }
        final String[] studentInfo = inputStudent.split(", ");//разделить информацию запятой
        if (studentInfo.length != 5) {
            throw new RuntimeException("Некоторые данные студента не существуют!");
        }
        //вносим данные в поля из массива студента
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
