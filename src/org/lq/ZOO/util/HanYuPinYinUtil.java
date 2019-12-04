package org.lq.ZOO.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class HanYuPinYinUtil {

	private static HanyuPinyinOutputFormat format=new HanyuPinyinOutputFormat();
	
	static {
		format.setCaseType(HanyuPinyinCaseType.UPPERCASE);
		format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
	}
	
	public static String getPYFirst(String str) {
		String pinyin = "";
		for (int i = 0; i < str.length(); i++) {
			try {
				String [] py=PinyinHelper.toHanyuPinyinStringArray(str.charAt(i), format);
				String p= py[0];
				pinyin +=p.charAt(0);
			} catch (BadHanyuPinyinOutputFormatCombination e) {
				e.printStackTrace();
			}
		}
		
		return pinyin;
	}
	
	
}
