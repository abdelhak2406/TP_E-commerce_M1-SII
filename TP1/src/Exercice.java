/*
    Ecris par Abdelhak Aissat
 */
import jade.core.Agent;

public class Exercice extends Agent {
    int []  T = {1,2,3,4,5,6,7,8,9,10,11,12};
    public static void main(String[] args) {
        String [] jadeArg = new String[2];
        StringBuffer SbAgent = new StringBuffer();
        SbAgent.append("agent1:Exercice;");
        SbAgent.append("agent2:Exercice;");
        SbAgent.append("agent3:Exercice;");
        jadeArg[0]="-gui";
        jadeArg[1]=SbAgent.toString();
        jade.Boot.main(jadeArg);
    }

    void printByIndex(int begin,int end ){
        for (int i = begin; i < end; i++) {
            System.out.println("T["+i+"] = "+this.T[i]);
        }
    }
    protected void setup(){
        String name = this.getLocalName();
        if(name.equals("agent1")){
            printByIndex(0,4);
            System.out.println("my name is "+name);
            System.out.println("--------------------------");
        }else if(name.equals("agent2")){
            printByIndex(4,8);
            System.out.println("my name is "+name);
            System.out.println("--------------------------");
        }else{
            printByIndex(8,12);
            System.out.println("my name is "+name);
            System.out.println("--------------------------");
        }
    }


}
