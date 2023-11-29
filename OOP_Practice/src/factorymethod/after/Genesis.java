package factorymethod.after;

public class Genesis extends Car{
   private String type =  CarName.GENESIS.name;

   public Genesis(String owner){
       super(owner);
   }
    public String toString(){
        return owner + "님의 차는 " + type + "입니다.";
    }

}
