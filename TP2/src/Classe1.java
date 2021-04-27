import jade.core.Agent;

public class Classe1 extends Agent {

    public static void main(String[] args) {
        String [] jadeArg = new String[2];
        StringBuffer SbAgent = new StringBuffer();
        SbAgent.append("A1:ClasseAgent;");
        SbAgent.append("A2:ClasseAgent;");
        SbAgent.append("A3:ClasseAgent");
        jadeArg[0]="-gui";
        jadeArg[1]=SbAgent.toString();
        jade.Boot.main(jadeArg);
    }
}
/*
        * OneShotBehaviour:
                    comportement qui sert à executer action une seule fois
                            par défaut done true  (done à ne pas programmer)

        * CyclicBehaviour:
                    comportement qui sert à executer action plusieurs fois sans arrêt
                      par défaut done false  (done à ne pas programmer)

        * Generic Behaviour:
                     définir l'action et gérer done ( l'utilisateur)
                    public void  action() /*

 */