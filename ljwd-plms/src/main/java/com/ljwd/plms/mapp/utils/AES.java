package com.ljwd.plms.mapp.utils;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;

/**
 * AES加解密
 * AES-128-CBC加密模式,key需要为16位
 * @author tangjialin on 2016-08-25 0025.
 */
public class AES {
    public static final AES instance = new AES();
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Charset CHARSET = Charset.forName("UTF-8");
    private Base64 base64 = new Base64();

    private AES() {
    }

    /**
     * 初始化提供数据加密和解密提供密码功能的实例
     * @param mode      加解密模式.1:加密;2:解密
     * @param secretKey 加解密密钥
     * @return
     */
    public Cipher initCipher(int mode, String secretKey) {
        try {
            if (secretKey == null || secretKey.length() != 16) { return null; }
            byte[] secretKeyBytes = secretKey.getBytes(CHARSET);
            SecretKeySpec skeySpec = new SecretKeySpec(secretKeyBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(secretKeyBytes);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//			Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(mode, skeySpec, ivParameterSpec);
            return cipher;
        } catch (Exception e) {
            logger.error("初始化提供数据加密和解密提供密码功能的实例异常", e);
            return null;
        }
    }

    /**
     * 数据加密并对加密内容进行base64编码
     * @param srcData   需要加密的数据
     * @param secretKey 加密的key
     * @return 返回加密后并进行base64编码后的数据
     */
    public String encrypt(String srcData, String secretKey) {
        if (srcData == null) { return null; }
        try {
            Cipher cipher = initCipher(Cipher.ENCRYPT_MODE, secretKey);
            if (cipher == null) { return null; }
            byte[] dataBytes = srcData.getBytes(CHARSET);
            byte[] encrypted = cipher.doFinal(dataBytes); // 加密
            return base64.encodeAsString(encrypted); // BASE64编码
        } catch (Exception e) {
            logger.error("数据加密异常", e);
        }
        return null;
    }

    /**
     * 数据解密,对数据进行base64解码后再解密
     * @param encData   加密的数据(需要解密的数据)
     * @param secretKey 解密key
     * @return 返回解密后的数据
     */
    public String decrypt(String encData, String secretKey) {
        if (encData == null) { return null; }
        try {
            Cipher cipher = initCipher(Cipher.DECRYPT_MODE, secretKey);
            if (cipher == null) { return null; }
            byte[] bytes = base64.decode(encData); // BASE64解码
            byte[] original = cipher.doFinal(bytes); // 解密
            String originalString = new String(original, CHARSET);
            return originalString;
        } catch (Exception e) {
            logger.error("数据解密异常", e);
            return null;
        }
    }

    public static void main(String[] args) {
        String secretKey = "b60449ddb29221c8"; // 应用密钥
        String encrypt = AES.instance.encrypt("abcd", secretKey);
        System.out.println(encrypt);

        String decrypt = AES.instance.decrypt("gyaLWDXN7CN2WLTVIoBrYg==", secretKey);
        System.out.println(decrypt);
        System.out.println(decrypt.length());
    }
}