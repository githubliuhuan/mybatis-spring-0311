package pojo;

/**
 * Created by liuhuan on 2020/3/11 9:47
 */
public class Dept {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
