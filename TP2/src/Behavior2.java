import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Behavior2 extends CyclicBehaviour {
    int i =0;
    @Override
    public void action() {
            this.i = this.i+1;
        System.out.println("my name is "+this.myAgent.getLocalName());
        ACLMessage msg = null;
        //msg = this.myAgent.receive();//la methode la plus forte, elle force la reception
        msg = this.myAgent.blockingReceive();//Il reste bloqué jusqu'a l'arrivée du message
        if(msg != null){
            try{
                int [] A = (int [])msg.getContentObject();
                System.out.println(" Message recu B2 : ");
                for (int j = 0; j < A.length; j++) {
                    System.out.println("A["+j+"]= "+A[j]);
                }
            }
            catch (Exception e){
                System.out.println("exception");
            }



        }

        if (i==5){
            this.myAgent.doWait(1000);
            this.myAgent.doSuspend();
            //this.myAgent.doActivate();//pour el reprendre
        }

    }
}
