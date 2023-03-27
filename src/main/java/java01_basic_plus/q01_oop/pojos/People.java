package java01_basic_plus.q01_oop.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class People {
    private String name;
    private Integer age;

    //公共
    public String add;

    public final void sayyourname()
    {
        System.out.println(this.name+" ");
    }
}
