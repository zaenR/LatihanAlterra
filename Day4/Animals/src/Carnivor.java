public class Carnivor extends Animals{

    @Override
    public void indentify_myself() {
        System.out.println("Hi I'm Carnivor, My name " +getNama()+ ", My Food is " +getMakanan()+
                ", I Have "+getGigi()+ " teeth");
    }
}
