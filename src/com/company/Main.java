package com.company;

public class Main {
    //1
    private static final String[] queries = {
            "1, Екатерина, Савинова, ПМИб, 0",
            "1, Катя, Савинова, ПМИб, 1",
            "1, Катерина, Савинова, ПМИб, 2",
    };

    //2
    private static String createQuery(final TStudent student) {
        return String.format(
                "insert into T_GroupSelected values ('%s', '%s', '%s', '%s');",
                student.getStudentId(),
                student.getFirstName(),
                student.getLastName(),
                student.getGroupId()
        );
    }

    private static final String firstInput = " Екатерина Савинова";
    private static final String secondInput = " Е.A.Савинова";
    //4
    private static final String[] inputShirts = {
            "111, some1, red, 1000",
            "222, some2, blue, 999",
            "333, some3, white, 333",
            "444, some4, black, 20020",
    };

    public static void main(String[] args) {

//        final int allowedDebts = 7;
//        final TStudent[] students = new TStudent[queries.length];
//        for (int i = 0; i < queries.length; i++) {
//            try {
//                students[i] = new TStudent(queries[i]);
//            } catch (RuntimeException re) {
//                re.printStackTrace();
//            }
//
//        }
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getNumberOfDebt() > allowedDebts) {
//                System.out.println(createQuery(students[i]));
//            }
//        }
//
//        //-------------------2task---------------------------------
//
//        final Person firstPerson = new Person(firstInput);
//        final Person secondPerson = new Person(secondInput);
//
//        System.out.println(firstPerson.getFullName());
//        System.out.println(secondPerson.getFullName());
        //++++++++++++++++++++++++3++++++++++++++++++++++
        final String input = "Россия, Самарская область, Тольятти, Белорусская, 16в, УЛК, 313";
        final String regex = input.replaceAll("[А-Яа-яA-Za-z0-9-]", "");
        final Address address = new Address(input, String.valueOf(regex.charAt(0) + " "));

        System.out.println(address);
        //---------------------4-----------------------------
        final Shirt[] shirts = new Shirt[inputShirts.length];
        for (int i = 0; i < inputShirts.length; i++) {
            try {
                shirts[i] = new Shirt(inputShirts[i]);
            } catch (ShirtException sh) {
                sh.printStackTrace();
            }
        }
        System.out.println("Shirts:\n");
        for (Shirt shirt : shirts) {
            System.out.println(shirt.toString());
            //------------------5------------------
            DigitParser firstPars = new DigitParser("+1041234567890");
            DigitParser secondPars = new DigitParser("81234567890");

            System.out.println(firstPars.toString());
            System.out.println(secondPars.toString());

            firstPars.printPhoneNumber();
            secondPars.printPhoneNumber();
            //-----------------6-----------------------

            StringServicefor6.stringOperations("I like Java!!!");

            StringServicefor6.stringOperations("string");

            //-----------------7-----------------------
            System.out.println(MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUM));
            System.out.println(MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUBTRACTION));
            System.out.println(MakeStringsfor7.getStringWith2Int(3, 56, Operations.MULTIPLICATION));

            System.out.println(MakeStringsfor7.replaceEqualsCharByInsert(
                    MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUM)));

            System.out.println(MakeStringsfor7.replaceEqualsCharByReplace(
                    MakeStringsfor7.getStringWith2Int(3, 56, Operations.SUM)));

            //-----------------8-----------------------
            System.out.println(StringServicefor8.getReplaceOOPString("Object-oriented programming is a programming language model organized around " +
                    "objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. " +
                    "Object-oriented programming bla."));
            //-----------------9-----------------------
            System.out.println(StringServicefor9.get2CharFromString("string"));
            System.out.println(StringServicefor9.get2CharFromString("code"));
            System.out.println(StringServicefor9.get2CharFromString("Practice"));
            //-----------------10-----------------------
            System.out.println(MakeFormatStringfor10.getString("lastName", 3, "subject"));

        }
    }
}