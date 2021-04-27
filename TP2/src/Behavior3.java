import jade.core.behaviours.Behaviour;

public class Behavior3 extends Behaviour {
    int step = 0;
    @Override
    public void action() {
        System.out.println("My name is "+ this.myAgent.getLocalName());
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
