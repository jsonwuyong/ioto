package com.ioto.util;

/**
 * Creater dengting on 2018/3/22
 */
public class PathUtil {

    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/Users/dengting/Documents/web-code/source/img";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "upload/images/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
