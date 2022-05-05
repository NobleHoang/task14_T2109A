public class Monster {
    private String name;
    public Monster(String name){
        this.name=name;
    }
    public  String attack(){
       return "error";
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                '}';
    }
}
