package it_1.com_5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] arge) {
        ArrayList<Student> array = new ArrayList();

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1、 添加学生");
            System.out.println("2、 删除学生");
            System.out.println("3、 修改学生");
            System.out.println("4、 查看所有学生");
            System.out.println("5、 退出");
            System.out.println("请输入你的选择");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用，期待你的下次光临");
                    //break;
                    System.exit(0);

            }
        }
    }

    //添加学生
/*
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAdderss(address);

        array.add(s);

        System.out.println("添加成功");
    }
*/
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAdderss(address);

        array.add(s);

        System.out.println("添加成功");
    }

    //判断学号是否重复
    public static boolean isUsed(ArrayList<Student>array,String sid){
        boolean flag = false;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //查看学生
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请添加信息再查询");
            return;//为了让程序不再往下执行
        }


        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t\t" + s.getAge() + "岁\t\t" + s.getAdderss());
        }
    }

    //删除学生

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                //array.remove(i);
                break;
            }
        }
        if (index == -1) {
            System.out.println("你输入的学号不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生信息成功");
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改学生信息的学号");
        String sid = sc.nextLine();
        int indx = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                indx = i;
                break;
            }
        }
        if (indx == -1) {
            System.out.println("你输入的学号有误，请重新输入");
        } else {
            System.out.println("请输入学生新姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄");
            String age = sc.nextLine();
            System.out.println("请输入学生居住地");
            String address = sc.nextLine();

            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAdderss(address);

            array.set(indx, s);

        }


    }
    //删除时判断学生学号是否存在
    public static boolean noisUsed(ArrayList<Student>array,String sid) {
        boolean flag = false;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
/*
        Student s = array.get();

           System.out.println("请输入学生新姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄");
            String age = sc.nextLine();
            System.out.println("请输入学生居住地");
            String address = sc.nextLine();

            Student s1 = new Student();
            s1.setSid(sid);
            s1.setName(name);
            s1.setAge(age);
            s1.setAdderss(address);

            for (int i = 0; i < array.size();i++) {
                Student s2 = array.get(i);
                if (s.getSid().equals(sid)) {

                    array.set(i, s2);
                    break;
                }
            }
        } else {
            System.out.println("你输入的学号有误，请重新输入");
        }


    System.out.println("请输入学生新学号");
    String sid = sc.nextLine() ;
        /*System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAdderss(address);
        int index = -1;

        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s1.getSid().equals(sid)){
                index = i;
                array.set(i,s);
                break;
            }
        }

        if (index == -1){
            System.out.println("你输入的学号不存在，请重新输入");
        }else {
            //array.set(index);
        }
        System.out.println("修改学生信息成功");



*/

