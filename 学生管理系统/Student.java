package it_1.com_5;

public class Student {
    private String sid;
    private String name;
    private String age;
    private String adderss;


    public Student() {
    }

    public Student(String sid, String name, String age, String adderss) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.adderss = adderss;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    /*
    public Student(String sid,String name,String age,String adderss){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.adderss = adderss;
    }

    public void setSid(String sid){
        this.sid = sid;
    }
    public String getSid(){
        return sid;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return age;
    }
    public void setAdderss(String adderss){
        this.adderss = adderss;
    }
    public String getAdderss(){
        return adderss;
    }

 */
}
