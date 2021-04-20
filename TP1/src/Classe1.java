import jade.core.Agent;
public class Classe1 extends Agent{
    protected void setup(){
        System.out.println("my name is : "+this.getLocalName());
        Object []  T = this.getArguments();
        String a = T[0].toString();
        String b = T[1].toString();
        int c = Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println(" SUM IS = "+c);
    }
}
