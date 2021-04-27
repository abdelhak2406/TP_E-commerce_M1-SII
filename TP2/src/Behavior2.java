import jade.core.behaviours.CyclicBehaviour;

public class Behavior2 extends CyclicBehaviour {
    int i =0;
    @Override
    public void action() {
            this.i = this.i+1;
        System.out.println("my name is "+this.myAgent.getLocalName());
        if (i==5){
            this.myAgent.doWait(1000);
            this.myAgent.doSuspend();
            //this.myAgent.doActivate();//pour el reprendre
        }
    }
}
