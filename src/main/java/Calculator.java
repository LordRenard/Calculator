
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.println("Примечание:" +
                "\n Калькулятор производит расчёт римских и арабских цифр." +
                "\n Введенные цифры не должны превышать 10(X)." +
                "\n Введенное уравнение должно состоять либо из арабских цифр, либо из римских." +
                "\n Введенное уровнение должно быть записано с использованием пробелов." +
                "\n Пример уравнения: 1 + 1 или I + I\n");
        System.out.print("Введите уравнение: ");

        //Ввод уравнения пользователем
        String line = cs.nextLine();

        //Распределение полученного уравнения в массив
        String[] mas = line.split(" ");

        int x = 0;
        int y = 0;
        int res;

        //Программа завершает работу если введенное уравнение больше или меньше положенного
        if (mas.length > 3 || mas.length < 2) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Неверный формат уравнения");
                System.exit(0);
            }
        }

        /*Определяем являются ли данные в первой ячеке массива римской цифрой и присваеваем ей значение.
        И завершаем программу если начальные римские операнды превышают допустимое значение*/
        try {
            x = switch (mas[0]) {
                case "I" -> 1;
                case "II" -> 2;
                case "III" -> 3;
                case "Iv" -> 4;
                case "V" -> 5;
                case "VI" -> 6;
                case "VII" -> 7;
                case "VIII" -> 8;
                case "IX" -> 9;
                case "X" -> 10;
            /*Если данные в первой ячейке являются арабской цифрой, изменяем у нее тип данных на int
            и присваеваем значение переменной x*/
                default -> Integer.parseInt(mas[0]);
            };
        } catch (Exception e) {
            System.out.println("Начальные параметры ввода превышают допустимое значение.");
            System.exit(0);
        }

            /*Определяем являются ли данные в третьей ячеке массива римской цифрой и присваеваем ей значение.
        И завершаем программу если начальные римские операнды превышают допустимое значение*/
        try {
            y = switch (mas[2]) {
                case "I" -> 1;
                case "II" -> 2;
                case "III" -> 3;
                case "Iv" -> 4;
                case "V" -> 5;
                case "VI" -> 6;
                case "VII" -> 7;
                case "VIII" -> 8;
                case "IX" -> 9;
                case "X" -> 10;
            /*Если данные в третьей ячейке являются арабской цифрой, изменяем у нее тип данных на int
            и присваеваем значение переменной y*/
                default -> Integer.parseInt(mas[2]);
            };
        } catch (Exception e) {
            System.out.println("Начальные параметры ввода превышают допустимое значение.");
            System.exit(0);
        }

        //Программа завершает работу если начальные арабские операнды превышают допустимое значение
        if (x >= 11 || y >= 11) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Начальные параметры ввода превышают допустимое значение.");
                System.exit(0);
            }
        }

        //Массив римских цифр для ответов в уравнениях с римскими цифрами
        String[] ans = {"nulla", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
                "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
                "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX",
                "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
                "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        /*Выводим результат вычисления уравнения определяя знак расчёта во второй ячейе массива,
        и определяя каких цифр происходит расчёт, арабских или римских*/
        switch (mas[1]) {
            case "+":
                if (mas[0].equals("I") ||
                        mas[0].equals("II") ||
                        mas[0].equals("III") ||
                        mas[0].equals("IV") ||
                        mas[0].equals("V") ||
                        mas[0].equals("VI") ||
                        mas[0].equals("VII") ||
                        mas[0].equals("VIII") ||
                        mas[0].equals("IX") ||
                        mas[0].equals("X")) {
                    res = x + y;
                    System.out.println("Ответ: " + ans[res]);
                } else {
                    System.out.println("Ответ: " + (x + y));
                }
                break;
            case "*":
                if (mas[0].equals("I") ||
                        mas[0].equals("II") ||
                        mas[0].equals("III") ||
                        mas[0].equals("IV") ||
                        mas[0].equals("V") ||
                        mas[0].equals("VI") ||
                        mas[0].equals("VII") ||
                        mas[0].equals("VIII") ||
                        mas[0].equals("IX") ||
                        mas[0].equals("X")) {
                    res = x * y;
                    System.out.println("Ответ: " + ans[res]);
                } else {
                    System.out.println("Ответ: " + (x * y));
                }
                break;
            case "-":
                if (mas[0].equals("I") ||
                        mas[0].equals("II") ||
                        mas[0].equals("III") ||
                        mas[0].equals("IV") ||
                        mas[0].equals("V") ||
                        mas[0].equals("VI") ||
                        mas[0].equals("VII") ||
                        mas[0].equals("VIII") ||
                        mas[0].equals("IX") ||
                        mas[0].equals("X")) {
                    res = x - y;

                    //Программа завершается если ответ уравнения из римских цифр меньше одного
                    if (res < 1) {
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("В римской системе нет нуля и отрицательных чисел.");
                            System.exit(0);
                        }
                    }
                    System.out.println("Ответ: " + ans[res]);
                } else {
                    System.out.println("Ответ: " + (x - y));
                }
                break;
            case "/":
                if (mas[0].equals("I") ||
                        mas[0].equals("II") ||
                        mas[0].equals("III") ||
                        mas[0].equals("IV") ||
                        mas[0].equals("V") ||
                        mas[0].equals("VI") ||
                        mas[0].equals("VII") ||
                        mas[0].equals("VIII") ||
                        mas[0].equals("IX") ||
                        mas[0].equals("X")) {
                    res = x / y;

                    //Программа завершается если ответ уравнения из римских цифр меньше одного
                    if (res < 1) {
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("В римской системе нет нуля и отрицательных чисел.");
                            System.exit(0);
                        }
                    }
                    System.out.println("Ответ: " + ans[res]);
                } else {
                    System.out.println("Ответ: " + (x / y));
                }
                break;
        }

    }
}
