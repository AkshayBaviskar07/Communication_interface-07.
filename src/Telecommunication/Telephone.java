package Telecommunication;

public interface Telephone {
    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phonenumber);
    boolean isRinging();
}
