public class Person {
    String name ;
    int age ;
    Animal animal ;

    public Person(){
        System.out.println("person的无参构造函数");
    }
    public Person(String name , int age , Animal animal){
        this.name = name ;
        this.age = age ;
        this.animal = animal ;
    }
    //get与set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    //判断是否喂食
    public void feed(){
        if(animal.isHungry()){
            System.out.println("给宠物喂食");
        }else{
            System.out.println("陪宠物玩耍");
        }
    }
}
