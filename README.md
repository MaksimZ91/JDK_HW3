# Урок 3. Обобщенное программирование
1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
   Параметры этих методов – два числа разного типа (но необязательно разного между собой), над которыми должна быть произведена операция.  
3. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.  
   Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.  
5. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,  
   а также переопределение метода toString(), возвращающее строковое представление пары.

## Class Main
```java
package org.example;
import org.example.Animal.Animal;
import org.example.Animal.Cat;
import org.example.Animal.Dog;


public class Main {
    public static void main(String[] args) {
        /*1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(),
        multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно
        разного между собой), над которыми должна быть произведена операция.
         */

        System.out.println(Calculator.sum(1.7f, 1.2));
        System.out.println(Calculator.multiply(2, 1.5));
        System.out.println(Calculator.divide(6, 1.4f));
        System.out.println(Calculator.subtract(35.2, 1.4f));

        /*2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они
        одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину
        и содержать элементы одного типа.*/

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Cat[] catArr = {cat, cat1};
        Dog[] dogArr= {dog, dog1};
        Animal[] an = {dog, dog1};
        Animal[] an1 = {cat, dog1};
        System.out.println(СompareArray.<Animal, Dog>compareArrays(an, dogArr));

        /*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь
         методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение
         метода toString(), возвращающее строковое представление пары.
         */
        Pair<String,Integer> p = new Pair<>("first",1 );
        System.out.println(p);

    }
}
```
## Class Calculator
```java
package org.example;

public class Calculator {
    public static <T extends Number, V extends Number> Number sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
        //a.byteValue() + b.byteValue();
    }
    public static <T extends Number, V extends Number> Number multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number, V extends Number> Number divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
    public static <T extends Number, V extends Number> Number subtract(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
}
```

## Class СompareArray
```java
package org.example;

import java.util.Arrays;

public class СompareArray {

    public static <T,U> boolean  compareArrays(T[] a,   U[] b ){
        return Arrays.equals(a,b);
    }
}
```
