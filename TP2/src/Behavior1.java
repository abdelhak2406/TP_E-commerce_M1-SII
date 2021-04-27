import jade.core.behaviours.OneShotBehaviour;

public class Behavior1  extends OneShotBehaviour {
    @Override
    public void action() {
        System.out.println("My name is "+this.myAgent.getLocalName());
        System.out.println(" Nous sommes dans oneShotBehavior, et pi si tout");

    }


}
