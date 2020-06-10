package cn.lianxi;

public class Student {
    //姓名
    private String name;
    //语文成绩
    private int chinese;
    //数学成绩
    private int math;
    //英语成绩
    private int english;

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public Student() {
        super();
    }

    public int getSum(){
        return this.chinese+this.math+this.english;
    }


}