package global.help;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

public class NumberUtils {
	/**
	 * 数值转String 有默认值
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static String numtoStr(Number from, String defVal) {
		if (from == null ) {
			return defVal;
		} else {
			return from.toString();
		}
	}
	/**
	 * 数值转String 默认值NULL
	 * @param from
	 * @return
	 */
	public static String numtoStr(Number from) {
		return numtoStr(from, null);
	}
	/**
	 * String 转 Integer
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static Integer str2Int(String from, Integer defVal) {
		return (from == null || !StringUtils.isNumeric(from)) ? defVal : Integer.parseInt(from);
	}
	/**
	 * String 转 BigDecimal
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static BigDecimal str2Dec(String from, BigDecimal defVal) {
		return (from == null || !StringUtils.isNumeric(from))  ? defVal : new BigDecimal(from);
	}
	/**
	 * String 转 Long
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static Long str2Lng(String from, Long defVal) {
		return (from == null || !StringUtils.isNumeric(from))  ? defVal : Long.parseLong(from);
	}
	/**
	 * String 转 Integer
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static Integer str2Int(String from) {
		return (from == null || !StringUtils.isNumeric(from)) ? null : Integer.parseInt(from);
	}
	/**
	 * String 转 BigDecimal
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static BigDecimal str2Dec(String from) {
		return (from == null || !StringUtils.isNumeric(from))  ? null : new BigDecimal(from);
	}
	/**
	 * String 转 Long
	 * @param from
	 * @param defVal
	 * @return
	 */
	public static Long str2Lng(String from) {
		return (from == null || !StringUtils.isNumeric(from))  ? null : Long.parseLong(from);
	}
}
