package entity;

import java.util.Arrays;

public class UserDTO {
    private int id;
    private String username;
    private String password;
    private int[] ids;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", ids=" + Arrays.toString (ids) + '}';
    }
}
