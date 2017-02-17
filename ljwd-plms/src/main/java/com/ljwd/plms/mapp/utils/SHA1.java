package com.ljwd.plms.mapp.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * SHA1算法工具类
 */
public class SHA1 {
    public static final SHA1 instance = new SHA1();
	private Logger logger = LoggerFactory.getLogger(getClass());
	private Charset CHARSET = Charset.forName("UTF-8");

	private SHA1() {
	}

	/**
	 * 用SHA1算法生成安全签名
	 * @param args 顺序可以不同
	 *             //	 * @param appid       应用唯一标识
	 *             //	 * @param secretKey   应用密钥
	 *             //	 * @param timestamp   时间戳
	 *             //	 * @param nonce       随机数
	 *             //	 * @param encryptData 密文
	 * @return
	 */
	public String getSHA1(String... args) {
		if (args == null) { return null; }
		try {
			Arrays.sort(args); // 将字符串升序排序
			StringBuffer sb = new StringBuffer();
			int len = args.length;
			for (int i = 0; i < len; i++) { sb.append(args[i]); }
			String str = sb.toString();
			// SHA1签名生成
			byte[] digest = MessageDigest.getInstance("SHA-1").digest(str.getBytes(CHARSET));

			len = digest.length;
			StringBuffer hexstr = new StringBuffer();
			String shaHex = null;
			for (int i = 0; i < len; i++) {
				shaHex = Integer.toHexString(digest[i] & 0xFF);
				if (shaHex.length() < 2) { hexstr.append(0); }
				hexstr.append(shaHex);
			}
			shaHex = hexstr.toString();
			return shaHex;
		} catch (Exception e) {
			logger.error("哈希算法执行异常", e);
		}
		return null;
	}

//	/**
//	 * 用SHA1算法生成安全签名
//	 * @param appid       应用唯一标识
//	 * @param secretKey   应用密钥
//	 * @param timestamp   时间戳
//	 * @param nonce       随机数
//	 * @param encryptData 密文
//	 * @return 安全签名
//	 */
//	public String getSHA1(String appid, String secretKey, String timestamp, String nonce, String encryptData) {
//		try {
//			String[] array = new String[]{appid, secretKey, timestamp, nonce, encryptData};
//			StringBuffer sb = new StringBuffer();
//			// 将字符串升序排序
//			Arrays.sort(array);
//			for (int i = 0; i < parameterSize; i++) { sb.append(array[i]); }
//			String str = sb.toString();
//			// SHA1签名生成
//			byte[] digest = MessageDigest.getInstance("SHA-1").digest(str.getBytes(CHARSET));
//
//			StringBuffer hexstr = new StringBuffer();
//			String shaHex = null;
//			for (int i = 0; i < digest.length; i++) {
//				shaHex = Integer.toHexString(digest[i] & 0xFF);
//				if (shaHex.length() < 2) { hexstr.append(0); }
//				hexstr.append(shaHex);
//			}
//			shaHex = hexstr.toString();
//			return shaHex;
//		} catch (Exception e) {
//			logger.error("哈希算法执行异常", e);
//		}
//		return null;
//	}
}
