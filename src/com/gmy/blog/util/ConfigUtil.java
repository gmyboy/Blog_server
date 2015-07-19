package com.gmy.blog.util;

import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
	
	/** 图片文件标识 */
	public static final String FILE_IMG_TYPE = "img";
	/** 音频文件标识 */
	public static final String FILE_AUDIO_TYPE = "audio";
	/** 视频文件标识 */
	public static final String FILE_VEDIO_TYPE = "video";
	private static Properties props = new Properties();
	static {
		InputStream ips = ConfigUtil.class.getClassLoader()
				.getResourceAsStream("com/gmy/blog/util/config.properties");
		try {
			props.load(ips);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getValue(String key) {
		return props.getProperty(key);
	}

	public static void main(String[] args) {
		System.out.println(getValue("ManagerDAO"));
	}
}
