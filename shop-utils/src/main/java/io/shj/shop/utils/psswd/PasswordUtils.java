package io.shj.shop.utils.psswd;

import io.shj.shop.utils.md5.MD5Hash;

/**
 * @author lishijiee
 * @version 1.0.0
 * @description 密码工具类
 */
public class PasswordUtils {

    public static String getPassword(String password){
        if (password == null || password.trim().isEmpty()) return password;
        for (int i = 0; i < 5; i++){
            password = MD5Hash.md5Java(password);
        }
        return password;
    }
}
