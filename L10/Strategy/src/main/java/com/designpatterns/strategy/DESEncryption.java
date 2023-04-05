package com.designpatterns.strategy;

class DESEncryption implements EncryptionStrategy {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES Encryption");
    }
}