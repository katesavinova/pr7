package com.company;

public class Main {
    //1 данные о студентах
    private static final String[] queries = {
            "1, Екатерина, Савинова, ПМИб, 20",
            "1, Катя, Савинова, ПМИб, 1",
            "1, Катерина, Савинова, ПМИб, 2",
    };


    private static String createQuery(final TStudent student) {
        // SQL запрос с одинарными кавычками
        return String.format(
                "insert into T_GroupSelected values ('%s', '%s', '%s', '%s');",
                student.getStudentId(),
                student.getFirstName(),
                student.getLastName(),
                student.getGroupId()
        );
    }
    //2
    private static final String firstInput = "савинова Александровна";
    private static final String secondInput = "Савинова Катя Александровна";
    //4
    private static final String[] inputShirts = {
            "111, some1, red, 1000",
            "222, some2, blue, 999",
            "333, some3, white, 333",
            "444, some4, black, 20020",
    };

    public static void main(String[] args) {
        System.out.println("task1");
        final int allowedDebts = 7;//количество разрешённых долгов
        final TStudent[] students = new TStudent[queries.length];// инициализируем массив со студентами
        for (int i = 0; i < queries.length; i++) {
            try {
                students[i] = new TStudent(queries[i]);//помещаем в массив данные о студентах
            } catch (RuntimeException re) {
                re.printStackTrace();
            }
        }
        for (int i = 0; i < students.length; i++) {//проходим по циклом по данным о студентах
            if (students[i].getNumberOfDebt() > allowedDebts) {//проверяем долги не больше 7
                System.out.println(createQuery(students[i]));//выводим найденного студента
            }
        }
//
//        //-------------------2task---------------------------------
        System.out.println("!!!!!!task2!!!!!!");
        final Person firstPerson = new Person(firstInput);
        final Person secondPerson = new Person(secondInput);
        System.out.println(firstPerson.getFullName());
        System.out.println(secondPerson.getFullName());

        //++++++++++++++++++++++++3++++++++++++++++++++++
        System.out.println("!!!!!!task3!!!!!!");
        Address address = new Address();
        address.setAddressFromString("Россия, Самарская область, Тольятти,Белорусская, 16в, УЛК, 313");
        System.out.println(address);

        address.setAddressFromString(" Россия; Самарская область, Тольятти;Белорусская, 12, Г, 402 ");
        System.out.println(address);

        System.out.println(address.setAddressFromString("a,a,a,a,a,a"));//некорректный ввод 6 полей
        System.out.println(address.setAddressFromStringWithAnySep("a;a.a,a-a,a"));

        address.setAddressFromStringWithAnySep("Украина; Полтавская обл, Петровск. улица ЧтоНадо- 34. кампус, 1");
        System.out.println(address);

        address.setAddressFromStringWithAnySep(" Грузия ; Табилиси  , город . улица ; дом , кампус . кв ");
        System.out.println(address);

        //---------------------4-----------------------------
        System.out.println("!!!!!!task4!!!!!!");
        final Shirt[] shirts = new Shirt[inputShirts.length];
        for (int i = 0; i < inputShirts.length; i++) {
            try {
                shirts[i] = new Shirt(inputShirts[i]);
            } catch (ShirtException sh) {
                sh.printStackTrace();
            }
        }
        for (Shirt shirt : shirts) {
            System.out.println(shirt.toString());
        }
        //------------------5------------------
        System.out.println("!!!!!!task5!!!!!!");
        DigitParser firstPars = new DigitParser("+1041235557890");
        DigitParser secondPars = new DigitParser("81234961811");

        System.out.println(firstPars.toString());
        System.out.println(secondPars.toString());

        firstPars.printPhoneNumber();
        secondPars.printPhoneNumber();
        //-----------------6-----------------------
        System.out.println("\n!!!!!!task6!!!!!!");
        StringServicefor6.stringOperations("I like Java!!!");

        StringServicefor6.stringOperations("string");

        //-----------------7-----------------------
        System.out.println("!!!!!!task7!!!!!!");
        System.out.println(MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUM));
        System.out.println(MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUBTRACTION));
        System.out.println(MakeStringsfor7.getStringWith2Int(3, 56, Operations.MULTIPLICATION));

        System.out.println(MakeStringsfor7.replaceEqualsCharByInsert(
                MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUM)));

        System.out.println(MakeStringsfor7.replaceEqualsCharByReplace(
                MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUM)));

        //-----------------8-----------------------
        System.out.println("!!!!!!task8!!!!!!");
        System.out.println(StringServicefor8.getReplaceOOPString("Object-oriented programming is a programming language model organized around " +
                "objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. " +
                "Object-oriented programming bla."));
        //-----------------9-----------------------
        System.out.println("!!!!!!task9!!!!!!");
        System.out.println(StringServicefor9.get2CharFromString("string"));
        System.out.println(StringServicefor9.get2CharFromString("code"));
        System.out.println(StringServicefor9.get2CharFromString("Practice"));
        //-----------------10-----------------------
        System.out.println("!!!!!!task10!!!!!!");
        System.out.println(MakeFormatStringfor10.getString("lastName", 3, "subject"));


    }
}