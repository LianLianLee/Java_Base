package java01_basic_plus.q01_oop.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class Student extends People{
    private Date dateTime;

    @Override
    //重写方法中没有 私有变量
    public String toString() {
        return "Student{" +
                "add='" + add + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
