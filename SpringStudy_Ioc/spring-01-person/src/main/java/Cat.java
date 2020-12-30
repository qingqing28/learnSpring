public class Cat implements Animal{
    String colour ;
    String chat ;
    boolean food ;
    //构造函数
    public Cat(){
        System.out.println("猫的无参构造函数");
    }
    public Cat(String colour1 , String chat1 , boolean food1){
        this.colour = colour1 ;
        this.chat = chat1 ;
        this.food = food1 ;
        System.out.println("猫的有参构造函数");
    }
    //set函数
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
    //get函数
    public String getColour(){
        return colour ;
    }
    public String getChat(){
        return chat ;
    }
    public boolean isHungry(){
        if(food){
            return false ;
        }
        return true ;
    }
}
