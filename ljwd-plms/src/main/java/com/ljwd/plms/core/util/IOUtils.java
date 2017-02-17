package com.ljwd.plms.core.util;

import org.apache.commons.io.output.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * 此类是对IO的一些操作封装
 * Created by tangjialin on 2016-10-13 0013.
 */
public class IOUtils {
	/**
	 * 以字符串形式返回输入流内容
	 * <pre>
	 * 优化{@link org.apache.commons.io.IOUtils#toString(java.io.InputStream)}方法
	 * 因为该方法调用层级过多,且其中额外开启了一个输入流未关闭
	 * 此额外开启对的输入流在一次性运行的程序中无关紧要,
	 * 但因web系统是一直开启不会终止,所以此流很难关闭,
	 * 导致结果是文件句柄占用不释放,而使用过多也会导致内存溢出
	 * </pre>
	 * @param in    输入流
	 * @param enc   输入流读取编码
	 * @param close 是否关闭输入流
	 * @return 返回读取的内容
	 */
	public static String toString(InputStream in, String enc, boolean close) {
		if (in == null) { return null; }
		ByteArrayOutputStream out = null;
		try {
			out = new ByteArrayOutputStream();
			org.apache.commons.io.IOUtils.copyLarge(in, out);
			return enc == null ? out.toString() : out.toString(enc);
		} catch (IOException e) {
			throw new RuntimeException(e.getLocalizedMessage(), e);
		} finally {
			if (close) { org.apache.commons.io.IOUtils.closeQuietly(in);}
			org.apache.commons.io.IOUtils.closeQuietly(out);
		}
	}

	/**
	 * 以字符串形式返回输入流内容
	 * @param in 输入流
	 * @return 返回读取的内容
	 */
	public static String toString(InputStream in) {
		return toString(in, null, true);
	}
}
