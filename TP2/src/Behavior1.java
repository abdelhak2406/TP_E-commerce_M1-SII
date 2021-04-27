import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Behavior1  extends OneShotBehaviour {
    @Override
    public void action() {
        System.out.println("My name is "+this.myAgent.getLocalName());
        int A=10;
        System.out.println(" Nous sommes dans oneShotBehavior, et pi si tout");
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID("A3",AID.ISLOCALNAME));
        msg.addReceiver(new AID("A2",AID.ISLOCALNAME));
        msg.setContent(Integer.toString(A));
        this.myAgent.send(msg);


    }


}
