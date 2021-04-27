import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class Behavior3 extends Behaviour {
    int step = 0;
    @Override
    public void action() {
        System.out.println("My name is "+ this.myAgent.getLocalName());

        ACLMessage msg = null;
        //msg = this.myAgent.receive();//la methode la plus forte, elle force la reception
        msg = this.myAgent.blockingReceive();//Il reste bloqué jusqu'a l'arrivée du message
        try{
            int [] A = (int [])msg.getContentObject();
            System.out.println(" Message recu B3 : ");
            for (int j = 0; j < A.length; j++) {
                System.out.println("A["+j+"]= "+A[j]);
            }
        }
        catch (Exception e){
            System.out.println("exception");
        }



        switch (step){
            case 0:
                System.out.println("STEP0 "+step);
                    step++;
                break;
            case 1:
                System.out.println("STEP1 "+step);
                step++;
                break;
            case 2:
                System.out.println("STEP2 "+step);
                step++;
                break;
        }
        System.out.println("nous sommes dans Generique");
    }

    @Override
    public boolean done() {
        return (step==3);
    }
}
