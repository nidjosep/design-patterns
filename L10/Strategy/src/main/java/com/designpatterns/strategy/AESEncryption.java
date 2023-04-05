package com.designpatterns.strategy;

class AESEncryption implements EncryptionStrategy {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES encryption");
    }
}