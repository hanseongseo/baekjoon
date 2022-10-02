package study;

public class Actor {
    String name;
    int age;
    int height;
    int weight;
    int career;
    boolean woman;
    boolean[] checkList;

    public Actor(String name, int age, int height, int weight, int career, boolean woman) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.career = career;
        this.woman = woman;
        this.checkList = new boolean[]{
                this.age > 20 && this.age < 30,
                this.height > 160 && this.height < 170,
                this.weight < 50,
                this.career >= 3,
                this.woman};
    }
//
//    boolean checkAge() {
//        return this.age > 20 && this.age < 30;
//    }
//
//    boolean checkHeight() {
//        return this.height > 160 && this.height < 170;
//    }
//
//    boolean checkWeight() {
//        return this.weight > 50;
//    }
//
//    boolean checkCareer() {
//        return this.career >= 3;
//    }
//
//    boolean checkWoman() {
//        return this.woman;
//    }
}


