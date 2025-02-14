package Basics.Hashcode;

import java.util.Random;
import java.util.random.RandomGenerator;

public class User {
    private long id;
    private String name;
    private String email;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User(String name, String email) {
        this.id = RandomGenerator.getDefault().nextInt();
        this.name = name;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return (int) id * name.hashCode() * email.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name) && email.equals(user.email);
    }
}
