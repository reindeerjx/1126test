package com.user.controller;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Person p1 = new Person("zhangsan",21);
        p1.setAddress("湖北省", "武汉市");


        //Person p2 = (Person) p1.clone();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(p1);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Person p2 = (Person) ois.readObject();

        System.out.println("p1:"+p1);
        System.out.println("p1.getPname:"+p1.getPname().hashCode());

        System.out.println("p2:"+p2);
        System.out.println("p2.getPname:"+p2.getPname().hashCode());

        p1.display("p1");
        p2.display("p2");
        p2.setPname("lisi");
        p2.setPage(28);
        p2.setAddress("湖北省", "荆州市");
        System.out.println("将复制之后的对象地址修改：");
        p1.display("p1");
        p2.display("p2");

    }
}
