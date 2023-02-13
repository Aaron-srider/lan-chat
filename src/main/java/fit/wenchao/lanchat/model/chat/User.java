package fit.wenchao.lanchat.model.chat;

public class User {
    private String id;
    private String ip;
    private String name;

    int ifThisDev;

    public User() {
    }

    public User(String id, String ip, String name, int ifThisDev) {
        this.id = id;
        this.ip = ip;
        this.name = name;
        this.ifThisDev = ifThisDev;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIfThisDev() {
        return ifThisDev;
    }

    public void setIfThisDev(int ifThisDev) {
        this.ifThisDev = ifThisDev;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", ip=" + ip + ", name=" + name + ", ifThisDev=" + ifThisDev + "]";
    }

}
