
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.println("����������:" +
                "\n ����������� ���������� ������ ������� � �������� ����." +
                "\n ��������� ����� �� ������ ��������� 10(X)." +
                "\n ��������� ��������� ������ �������� ���� �� �������� ����, ���� �� �������." +
                "\n ��������� ��������� ������ ���� �������� � �������������� ��������." +
                "\n ������ ���������: 1 + 1 ��� I + I\n");
        System.out.print("������� ���������: ");

        //���� ��������� �������������
        String line = cs.nextLine();

        //������������� ����������� ��������� � ������
        String[] mas = line.split(" ");

        int x = 0;
        int y = 0;
        int res;

        //��������� ��������� ������ ���� ��������� ��������� ������ ��� ������ �����������
        if (mas.length > 3 || mas.length < 2) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("�������� ������ ���������");
                System.exit(0);
            }
        }

        /*���������� �������� �� ������ � ������ ����� ������� ������� ������ � ����������� �� ��������.
        � ��������� ��������� ���� ��������� ������� �������� ��������� ���������� ��������*/
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
            /*���� ������ � ������ ������ �������� �������� ������, �������� � ��� ��� ������ �� int
            � ����������� �������� ���������� x*/
                default -> Integer.parseInt(mas[0]);
            };
        } catch (Exception e) {
            System.out.println("��������� ��������� ����� ��������� ���������� ��������.");
            System.exit(0);
        }

            /*���������� �������� �� ������ � ������� ����� ������� ������� ������ � ����������� �� ��������.
        � ��������� ��������� ���� ��������� ������� �������� ��������� ���������� ��������*/
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
            /*���� ������ � ������� ������ �������� �������� ������, �������� � ��� ��� ������ �� int
            � ����������� �������� ���������� y*/
                default -> Integer.parseInt(mas[2]);
            };
        } catch (Exception e) {
            System.out.println("��������� ��������� ����� ��������� ���������� ��������.");
            System.exit(0);
        }

        //��������� ��������� ������ ���� ��������� �������� �������� ��������� ���������� ��������
        if (x >= 11 || y >= 11) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("��������� ��������� ����� ��������� ���������� ��������.");
                System.exit(0);
            }
        }

        //������ ������� ���� ��� ������� � ���������� � �������� �������
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

        /*������� ��������� ���������� ��������� ��������� ���� ������� �� ������ ����� �������,
        � ��������� ����� ���� ���������� ������, �������� ��� �������*/
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
                    System.out.println("�����: " + ans[res]);
                } else {
                    System.out.println("�����: " + (x + y));
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
                    System.out.println("�����: " + ans[res]);
                } else {
                    System.out.println("�����: " + (x * y));
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

                    //��������� ����������� ���� ����� ��������� �� ������� ���� ������ ������
                    if (res < 1) {
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("� ������� ������� ��� ���� � ������������� �����.");
                            System.exit(0);
                        }
                    }
                    System.out.println("�����: " + ans[res]);
                } else {
                    System.out.println("�����: " + (x - y));
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

                    //��������� ����������� ���� ����� ��������� �� ������� ���� ������ ������
                    if (res < 1) {
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("� ������� ������� ��� ���� � ������������� �����.");
                            System.exit(0);
                        }
                    }
                    System.out.println("�����: " + ans[res]);
                } else {
                    System.out.println("�����: " + (x / y));
                }
                break;
        }

    }
}
