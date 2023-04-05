package com.designpatterns.strategy;

public class Demo {
    public static void main(String[] args) {
        EncryptionStrategy desEncryptionStrategy = new DESEncryption();
        ChatClient chatClient = new ChatClient(desEncryptionStrategy);
        chatClient.send("Message");

        System.out.println("\nSwitching encryption strategy to AES\n");
        EncryptionStrategy aesEncryptionStrategy = new AESEncryption();
        chatClient.setEncryptionStrategy(aesEncryptionStrategy);
        chatClient.send("Message");
    }
}
