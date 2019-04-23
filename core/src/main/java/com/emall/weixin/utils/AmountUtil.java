package com.emall.weixin.utils;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * 金额单位互转
 *
 * @author YiFei.Lu
 * @ClassName: AmountUtil
 * @Description: TODO(金额单位互转)
 * @date 2016年9月23日 上午10:51:33
 */
@Service
public class AmountUtil {

    /**
     * 将分为单位的转换为元并返回金额格式的字符串 （除100）
     */
//	public static String changeF2Y(Long amount){
    public static String changeF2Y(String amount) {
        int flag = 0;
        String amString = amount;//.toString();
        if (amString.charAt(0) == '-') {
            flag = 1;
            amString = amString.substring(1);
        }
        StringBuffer result = new StringBuffer();
        if (amString.length() == 1) {
            result.append("0.0").append(amString);
        } else if (amString.length() == 2) {
            result.append("0.").append(amString);
        } else {
            String intString = amString.substring(0, amString.length() - 2);
            for (int i = 1; i <= intString.length(); i++) {
                if ((i - 1) % 3 == 0 && i != 1) {
                    result.append(",");
                }
                result.append(intString.substring(intString.length() - i, intString.length() - i + 1));
            }
            result.reverse().append(".").append(amString.substring(amString.length() - 2));
        }
        if (flag == 1) {
            return "-" + result.toString();
        } else {
            return result.toString();
        }
    }

    /**
     * 将分为单位的转换为万并返回金额格式的字符串 （除1000000）
     */
    public static String changeF2W(String amount) {
        int flag = 0;
        String amString = amount;//.toString();
        if (amString.charAt(0) == '-') {
            flag = 1;
            amString = amString.substring(1);
        }
        StringBuffer result = new StringBuffer();
        if (amString.length() == 1) {
            result.append("0.000,00").append(amString);
        } else if (amString.length() == 2) {
            result.append("0.000,0").append(amString);
        } else if (amString.length() == 3) {
            result.append("0.000,").append(amString);
        } else if (amString.length() == 4) {
            result.append("0.00").append(amString.substring(0, 1)).append(",").append(amString.substring(1, amString.length()));
        } else if (amString.length() == 5) {
            result.append("0.0").append(amString.substring(0, 2)).append(",").append(amString.substring(2, amString.length()));
        } else if (amString.length() == 6) {
            result.append("0.").append(amString.substring(0, 3)).append(",").append(amString.substring(3, amString.length()));
        } else {
            String intString = amString.substring(0, amString.length() - 6);
            for (int i = 1; i <= intString.length(); i++) {
                if ((i - 1) % 3 == 0 && i != 1) {
                    result.append(",");
                }
                result.append(intString.substring(intString.length() - i, intString.length() - i + 1));
            }
            result.reverse().append(".").append(amString.substring(amString.length() - 6, amString.length() - 3)).append(",").append(amString.substring(amString.length() - 3, amString.length()));
        }
        if (flag == 1) {
            return "-" + result.toString();
        } else {
            return result.toString();
        }
    }

    /**
     * 将个为单位的转换为万（除1000）
     */
    public static String changeG2W(String num) {
        int flag = 0;
        String numString = num;//.toString();
        if (numString.charAt(0) == '-') {
            flag = 1;
            numString = numString.substring(1);
        }
        StringBuffer result = new StringBuffer();
        if (numString.length() == 1) {
            result.append("0.000,").append(numString);
        } else if (numString.length() == 2) {
            result.append("0.00").append(numString.substring(0, 1)).append(",").append(numString.substring(1, numString.length()));
        } else if (numString.length() == 3) {
            result.append("0.0").append(numString.substring(0, 2)).append(",").append(numString.substring(2, numString.length()));
        } else if (numString.length() == 4) {
            result.append("0.").append(numString.substring(0, 3)).append(",").append(numString.substring(3, numString.length()));
        } else {
            String intString = numString.substring(0, numString.length() - 4);
            for (int i = 1; i <= intString.length(); i++) {
                if ((i - 1) % 3 == 0 && i != 1) {
                    result.append(",");
                }
                result.append(intString.substring(intString.length() - i, intString.length() - i + 1));
            }
            result.reverse().append(".").append(numString.substring(numString.length() - 4, numString.length() - 1)).append(",").append(numString.substring(numString.length() - 1, numString.length()));
        }
        if (flag == 1) {
            return "-" + result.toString();
        } else {
            return result.toString();
        }
    }

    /**
     * 将分为单位的转换为元 （除100）
     */
    public static String changeF2Y(Long amount) {
        return changeF2Y(amount.toString());
    }

    /**
     * 将分为单位的转换为万 （除1000000）
     */
    public static String changeF2W(Long amount) {
        return changeF2W(amount.toString());
    }


    /**
     * 将元为单位的转换为分 （乘100）
     */
    public static String changeY2F(Long amount) {
        return BigDecimal.valueOf(amount).multiply(new BigDecimal(100)).toString();
    }

    /**
     * 将元为单位的转换为分 （乘100）
     */
    public static String changeY2F(String amount) {
        int index = amount.indexOf(".");
        int length = amount.length();
        Long amLong = 0l;
        if (index == -1) {
            amLong = Long.valueOf(amount + "00");
        } else if (length - index >= 3) {
            amLong = Long.valueOf((amount.substring(0, index + 3)).replace(".", ""));
        } else if (length - index == 2) {
            amLong = Long.valueOf((amount.substring(0, index + 2)).replace(".", "") + 0);
        } else {
            amLong = Long.valueOf((amount.substring(0, index + 1)).replace(".", "") + "00");
        }
        return amLong.toString();
    }

    /**
     * 金额转换
     *
     * @param amount
     * @param flag   0:将金额值*100 1:将金额值/100
     * @return String
     */
    public static String amountConvert(Number amount, String flag) {
        String amountFinal = "0";

        if (amount == null) {
            return amountFinal;
        }
        BigDecimal amountB = new BigDecimal(amount.toString());
        BigDecimal hundred = new BigDecimal("100");
        amountB = amountB.setScale(2, BigDecimal.ROUND_HALF_UP);
        // 当flag为0时,将金额值*100,用于存数据时的转换
        if (flag.equals("0")) {
            amountB = amountB.multiply(hundred);
            String amount1 = String.valueOf(amountB);
            String[] amountArr = amount1.split("\\.");
            amountFinal = amountArr[0];
        }
        // 当flag为1时,将金额值/100,用于取数据时转换
        else if (flag.equals("1")) {
            amountB = amountB.divide(hundred);
            amountFinal = String.valueOf(amountB);
        }
        return amountFinal;
    }

}
