package com.ljwd.plms.core.util;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

public class EncryptUtils {

    private static Base64 base64Coder = new Base64();

   
    public static byte[] xorEncrypt(String message, String key) {

        byte[] keys = StringUtils.getBytesUtf8(key);
        byte[] msgByte = StringUtils.getBytesUtf8(message);

        int msgLen = msgByte.length;
        int keyLen = keys.length;
        byte[] result = new byte[msgLen];

        for (int i = 0; i < msgLen; i++) {
            result[i] = (byte) (msgByte[i] ^ keys[i % keyLen]);
        }
        return result;

    }

    public static String xorDecrypt(byte[] msgByte, String key) {
        byte[] keys = StringUtils.getBytesUtf8(key);
        int msgLen = msgByte.length;
        int keyLen = keys.length;
        byte[] result = new byte[msgLen];

        for (int i = 0; i < msgLen; i++) {
            result[i] = (byte) (msgByte[i] ^ keys[i % keyLen]);
        }
        return StringUtils.newStringUtf8(result);

    }

    /**
     * base64解密
     * @param encrypedMsg 需解密的密码
     * @param key 秘钥
     * */
    public static String xorDecryptString(String encrypedMsg, String key) {
        return xorDecrypt(decode(encrypedMsg), key);
    }

    /**
     * base64加密
     * @param plainMsg 需加密的密码
     * @param key 秘钥
     * */
    public static String xorEncryptString(String plainMsg, String key) {
        return encode(xorEncrypt(plainMsg, key));
    }

    public static byte[] decode(String message) {
        return base64Coder.decode(message);
    }

    public static String encode(byte[] message) {
        return base64Coder.encodeAsString(message);
    }

    public static String getKey() {
        return "&**98)(";
    }

    /**
     * base64解密
     * @param encrypedMsg 需解密的密码
     * */
    public static String xorDecryptString(String encrypedMsg) {
        return xorDecrypt(decode(encrypedMsg), getKey());
    }

	/**
     * base64加密
     * @param plainMsg 需加密的密码
     * */
    public static String xorEncryptString(String plainMsg) {
        return encode(xorEncrypt(plainMsg, getKey()));
    }

}
