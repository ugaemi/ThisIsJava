package ch7;

public class SmartPhone extends Phone {
    String owner;

    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
