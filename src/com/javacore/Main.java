package com.javacore;

public class Main {

    public static void main(String[] args) {
      ITelephone joshPhone;
      joshPhone = new DeskPhone(123456);
      joshPhone.powerOn();
      joshPhone.callPhone(123456);
      joshPhone.answer();

      joshPhone = new MobilePhone(234567);
      joshPhone.powerOn();
      joshPhone.callPhone(234567);
      joshPhone.answer();
    }
}
