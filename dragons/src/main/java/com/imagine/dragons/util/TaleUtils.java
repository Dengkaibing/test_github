package com.imagine.dragons.util;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.imagine.dragons.constant.WebConst;
import com.imagine.dragons.entity.TUsers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TaleUtils {
    /**
     * @description: 将密码进行MD5加密
     * @Param: [source]
     * @return: java.lang.String
     * @author: dkb
     * @time: 2020/1/9 10:24
     */
    public static String MD5encode(String source) {
        if (StringUtils.isBlank(source)) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {

            messageDigest=MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] encode=messageDigest.digest(source.getBytes());
        StringBuffer hexString=new StringBuffer();
        for (byte anEncode : encode) {
            String hex = Integer.toHexString(0xff & anEncode);
            if (hex.length() == 1) {
                hexString.append("0");
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static TUsers getLoginUser(HttpServletRequest request)
    {
        HttpSession httpSession=request.getSession();
        if(httpSession==null)
            return null;
        return (TUsers)httpSession.getAttribute(WebConst.LOGIN_SESSION_KEY);
    }

}
