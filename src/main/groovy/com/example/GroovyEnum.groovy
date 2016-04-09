package com.example

enum GroovyEnum {
    FIELD1 {
        @Override
        int getNumber() {
            return 0
        }
    },
    FIELD2 {
        @Override
        int getNumber() {
            return 1
        }
    };

    abstract int getNumber();
}
