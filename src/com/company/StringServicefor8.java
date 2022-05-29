package com.company;

public class StringServicefor8 {
    private static final String FIND_STRING = "object-oriented programming";
    private static final String REPLACE_STRING = "OOP";

    public static String getReplaceOOPString(String str) {
        StringBuilder buffer = new StringBuilder(str.toLowerCase());
        StringBuilder resultStr = new StringBuilder(str);
        int lastIndex = 0;
        int index;
        while (buffer.indexOf(FIND_STRING, lastIndex) != -1) {
            int bufferIndex = buffer.indexOf(FIND_STRING, lastIndex);
            if (bufferIndex == -1)
                break;
            index = buffer.indexOf(FIND_STRING, bufferIndex + 1);
            if (index == -1)
                break;
            buffer.replace(index, index + FIND_STRING.length(), REPLACE_STRING);
            resultStr.replace(index, index + FIND_STRING.length(), REPLACE_STRING);
            lastIndex = index;
        }
        return resultStr.toString();
    }

}
