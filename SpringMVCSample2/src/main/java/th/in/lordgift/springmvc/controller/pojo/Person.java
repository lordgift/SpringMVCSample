package th.in.lordgift.springmvc.controller.pojo;

public class Person {
    private String prefix;
    private String nickname;

    public Person(String prefix, String nickname) {
        this.prefix = prefix;
        this.nickname = nickname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
