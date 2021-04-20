import jade.core.Agent;
public class Classe1 extends Agent{
    public static void main(String[] args) {
        String [] jadeArg = new String[2];
        StringBuffer SbAgent = new StringBuffer();
        SbAgent.append("abdelhak:AgentTry;");
        SbAgent.append("goku:AgentTry;");
        SbAgent.append("abdelhak2:Classe1(2,3)");
        jadeArg[0]="-gui";
        jadeArg[1]=SbAgent.toString();
        jade.Boot.main(jadeArg);
    }


    protected void setup(){
        System.out.println("my name is : "+this.getLocalName());
        Object []  T = this.getArguments();
        String a = T[0].toString();
        String b = T[1].toString();
        int c = Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println(" SUM IS = "+c);
    }
}
