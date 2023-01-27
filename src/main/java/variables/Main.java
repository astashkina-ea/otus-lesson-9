package main.java.variables;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char c = 'a'; //символ как символ
        char с1 = 50; //символ как код в таблице юникодов

        System.out.println(с1);

        char c2 = '2';
        char c3 = 135;
        String s = Character.toString(c2) + Character.toString(c3);

        System.out.println(s);

        int a = 10;
        int b = 123;

        System.out.println(a++); //10
        System.out.println(a); //11

        System.out.println(++a); //11
        System.out.println(a); //11

        boolean f = a == b;
        boolean f1 = (a != 10) && (b == 5);

        System.out.println(f);
        System.out.println(f1);
        System.out.println(!f);

        a += 5; //a = a + 5
        a -= 5;

        String s1 = "Hello world";
        String[] e = s1.split(" ");

        System.out.println(Arrays.toString(e));


        byte sh = 127;
        sh = (byte) (sh + 1);
        System.out.println(sh); //-128 тк переполнение

        /***********************/
        //переменные и их типы
        int a1 = 500;
        byte t = 55;
        double b1 = 20.5;
        System.out.println(a1);
        System.out.println(t);
        System.out.println(b1);

        boolean q = true;
        boolean f2 = false;
        System.out.println(q);
        System.out.println(f2);
        f2 = true;
        System.out.println(f2);

        int z = 44;
        System.out.println(z);
        z = 67;
        System.out.println(z);

        char lit = 'p';
        System.out.println(lit);
        lit = 'w';
        System.out.println(lit);

        char c1 = 41;
        char d = 58;
        System.out.println(c1);
        System.out.println(d);

        //бинарные арифм операции
        int aa = 10;
        int bb = 22;
        int cc = aa + bb;
        System.out.println(cc);
        aa = aa + 15;
        System.out.println(aa);
        int dd = aa - bb;
        System.out.println(dd);
        int ee = dd * cc;
        System.out.println(ee);
        int ff = ee / bb;
        System.out.println(ff);

        double o = 11;
        double p = 5;
        double op = o / p;
        System.out.println(op);

        //унарные арифм операции
        int x1 = 8;
        int y1 = ++x1; //префиксный инкримент - сначала увелич x1 на 1,
        // затем складывает в y1 новый x1
        System.out.println(x1); // 9
        System.out.println(y1); // 9

        int x2 = 8;
        int y2 = --x2; //префиксный декремент
        System.out.println(x2); // 7
        System.out.println(y2);// 7

        int x3 = 8;
        int y3 = x1++; //постфиксный инкримент - сначала в y1 сложит x1,
        // затем увеличит x1 на 1
        System.out.println(x3); // 8
        System.out.println(y3); // 9

        int x4 = 8;
        int y4 = x4--; //постфиксный декремент
        System.out.println(x4); // 7
        System.out.println(y4); // 8

        int a3 = 7;
        int b3 = 5;
        int c4 = a3++ - --b3 + ++a3 + --b3;
        System.out.println(c4);

        //приоритет арифм опер
        // 1) ++, --
        // 2) *, /, %
        // 3) +, -
        // изменить приоритет можно с помощью ()

        //пробразование типов
        //безболезненно можно преобразовать из меньшего к большему, но не наоборот
        byte vv = 125;
        vv = (byte) (vv + 10); // в скобках тот тип данных в кот мы хотим преобразовать,
        // те когда мы хотим сложить что то в меньшую коробку,
        // мы должны сказать компилятору что мы это делаем намеренно
        System.out.println(vv);//идем на второй круг, в самое начало тк выходим за пределы типа и получим -121

        byte vv1 = 125;
        int vv2 = vv1 + 10;
        System.out.println(vv2);

        //логические операции
        boolean bool1 = false;
        boolean bool2 = true;
        boolean res1 = bool1 & bool2; //логич И (провереят обе части выражения) - умнож
        System.out.println(res1);
        //false & false => false
        //false & true => false
        //true & false => false
        //true & true => true

        boolean bool3 = false;
        boolean bool4 = true;
        boolean res2 = bool3 && bool4; //скоращенное логич И (провереят первую часть выражения, и если она false, то вторую не провеяем)
        System.out.println(res2);

        boolean bool5 = false;
        boolean bool6 = true;
        boolean res3 = bool5 | bool6; //логич ИЛИ (провереят обе части выражения) - сложен
        System.out.println(res3);
        //false | false => false
        //false | true => true
        //true | false => true
        //true | true => true

        boolean bool7 = false;
        boolean bool8 = true;
        boolean res4 = bool7 | bool8; //скоращенное логич ИЛИ (провереят первую часть выражения, и если она true, то вторую не провеяем)
        System.out.println(res4);


        boolean bool9 = false;
        boolean bool10 = true;
        boolean res5 = bool9 ^ bool10; // логич исключающее ИЛИ (если все части разные, то будет true, иначе false (те сравниваем обе части))
        System.out.println(res5);

        boolean bool11 = false;
        boolean bool12 = !bool11; //логическое унарное НЕ
        System.out.println(bool12);

        boolean bool13 = false;
        boolean bool14 = true;
        bool13 &= bool14; // равносильно bool13 = bool13 & bool14;
        System.out.println(bool13);
        bool13 |= bool14; // равносильно bool13 = bool13 | bool14;
        System.out.println(bool13);
        bool13 ^= bool14; // равносильно bool13 = bool13 ^ bool14;
        System.out.println(bool13);

        boolean bool15= true;
        boolean bool16 = true;
        boolean result = bool15 == bool16; //логическое равно - спрашиваем одно равно другому?
        System.out.println(result);

        boolean bool17= true;
        boolean bool18 = false  ;
        boolean result1 = bool17 != bool18; //логическое НЕ равно - спрашиваем одно НЕ равно другому?
        System.out.println(result1);

        //помимо операций выше есть <, > ,<=,>=

        //битовые сдвиги
        //>> Сдвиг вправо
        //>>> Сдвиг вправо с заполнением нулями (беззнаковый сдвиг)
        //<< Сдвиг влево
        int ab = 23; //0001 0111 = 23
        int resultAb = ab << 2; //0101 1100 = 92 //сдвинули все на два бита влево
        System.out.println(resultAb);
        int resultAb1 = ab >> 2; //0000 0101 = 5 //сдвинули все на два бита вправо, и все что не влезло
        System.out.println(resultAb);
        //применяется для вычесления обратного корня y0 = 5F3759DF(16ричн с/с) − (x >> 1)
    }
}
