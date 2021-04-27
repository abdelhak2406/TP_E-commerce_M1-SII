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
        if(msg != null){
            System.out.println("Message Recu dans B3: "+msg.getContent());
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
