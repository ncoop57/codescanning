package com.minimals.des;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class CipherExample {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, BadPaddingException, InvalidKeyException, IllegalBlockSizeException {
        KeyGenerator keygen = KeyGenerator.getInstance("DES");
        SecretKey key = keygen.generateKey();

        Cipher cipher;
        cipher = Cipher.getInstance("DES");

        byte [] plaintext = "some text".getBytes();
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encrypted = cipher.doFinal(plaintext);

        Cipher decipher;
        decipher = Cipher.getInstance("DES");
        decipher.init(Cipher.DECRYPT_MODE, key);

        byte[] deciphered = decipher.doFinal(encrypted);
        System.out.println("plaintext: "+new String(plaintext));
        System.out.println("encrypted: "+new String(encrypted));
        System.out.println("deciphered: "+new String(deciphered));
        System.out.println("Algorithm type: "+cipher.getAlgorithm()+cipher.getParameters());
    }
    
}