package gb_oop_java.sem4.hw;

import java.util.List;

public class Calculator {

    public Double sumCollection(List<? extends Number> genList) {
        double result = 0;
        for (Number number : genList) {
            result += number.doubleValue();
        }
        return result;
    }

    public double multiCollection(List<? extends Number> genList) {
        double result = 1;
        for (Number number : genList) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double multiSingle(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divCollection(List<? extends Number> genList) {
        double result = genList.get(0).doubleValue();
        for (int i = 1; i < genList.size(); i++) {
            result /= genList.get(i).doubleValue();
        }
        return result;
    }

    public double divSingle(Number num1, Number num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public StringBuilder binar(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        if (obj instanceof Number){
            /**
             * Реализация из коробки
             */
            stringBuilder.append(Integer.toBinaryString(((Number) obj).intValue()));
            /**
             * Самописная реализация
             */
//            Integer numerator = ((Number) obj).intValue();
//            while (numerator > 0) {
//                stringBuilder.append(numerator%2);
//                numerator /= 2;
//            }
//            stringBuilder.reverse();
            if (obj instanceof Double) {
                stringBuilder.append('.');
                double denominator = ((Double) obj).doubleValue() % 1;
                for (int i = 0; i < 3; i++) {
                    denominator = denominator * 2 - (int) denominator * 2;
                    stringBuilder.append((int) denominator);
                }
            }
        }
        if (obj instanceof String) {
            for (int i = 0; i < ((String) obj).length() ; i++) {
                stringBuilder.append(Integer.toBinaryString(((String) obj).charAt(i)));
            }
        }

        return stringBuilder;
    }
}
