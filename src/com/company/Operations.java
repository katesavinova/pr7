package com.company;

public enum Operations {
    SUM("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*");
    private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public String getOperation () {
        return operation;
    }

    public int getOperationOf2Int(int integer1, int integer2) {
        return this == Operations.SUM ? integer1 + integer2 :
                this == Operations.SUBTRACTION ? integer1 - integer2 :
                        integer1 * integer2;
    }
}

