package factorymethod.after;

public class Sonata extends Car{

    private String type = CarName.SONATA.name;

    public Sonata(String owner){
        super(owner);
    }

    public String toString(){
        return owner + "님의 차는 " + type + "입니다.";
    }
}
