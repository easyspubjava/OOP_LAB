package factorymethod.after;

public class Grandeur extends Car{

    private String type = CarName.GRANDEUR.name;

    public Grandeur(String owner){
        super(owner);
    }
    public String toString(){
        return owner + "님의 차는 " + type + "입니다.";
    }
}
