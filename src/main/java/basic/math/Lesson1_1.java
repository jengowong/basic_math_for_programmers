package basic.math;

import java.math.BigInteger;

/**
 * {@link Lesson1_1}
 */
public class Lesson1_1 {
    /**
     * 十进制转换成二进制
     *
     * @param decimalSource
     *
     * @return string
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource)); // 转换成 BigInteger 类型，默认是十进制
        return bi.toString(2); // 参数 2 指定的是转化成二进制
    }

    /**
     * 二进制转换成十进制
     *
     * @param binarySource
     *
     * @return
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2); // 转换为 BigInteger 类型，参数 2 指定的是...
        return Integer.parseInt(bi.toString()); // 默认转换成十进制
    }

    public static void main(String[] args) {
        int a = 53;
        String b = "110101";
        System.out.println(String.format(" 数字 %d 的二进制是 %s", a, decimalToBinary(a))); // 获取十进制数 53 的二进制数
        System.out.println(String.format(" 数字 %s 的十进制是 %d", b, binaryToDecimal(b))); // 获取二进制数 110101 的十进制数

        a = -53;
        System.out.println(String.format(" 数字 %d 的二进制是 %s", a, decimalToBinary(a)));
        System.out.println(String.valueOf(a));
    }

}
