package br.com.ithappens.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

public class MD5Util {
    public static String gerarMD5(String entrada) {

        MessageDigest md = null;
        StringBuffer sb = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(entrada.getBytes());
            byte byteData[] = md.digest();
            sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            Logger.getLogger(e.getMessage());
        }
        return sb.toString();
    }
}
