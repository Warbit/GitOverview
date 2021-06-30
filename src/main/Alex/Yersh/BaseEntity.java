import Alex.Yersh;

public class BaseEntity{
    private long id;

    @java.lang.Override
    public java.lang.String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}