package com.example

class MainGroovy {

    public static void main(String[] args) {
        println "Groovy main start"
        JavaEnumService enumService = new JavaEnumService();
        enumService.showGroovyEnum(GroovyEnum.FIELD1);
    }
}
