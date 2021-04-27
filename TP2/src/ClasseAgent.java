import jade.core.Agent;

public class ClasseAgent extends Agent {
    @Override
    protected void setup() {
        if (this.getLocalName().equals("A1") ){
            this.addBehaviour(new Behavior1()) ;
        }
        if (this.getLocalName().equals("A2") ){
            this.addBehaviour(new Behavior2()) ;
        }
        if (this.getLocalName().equals("A3") ){
            this.addBehaviour(new Behavior3()) ;
        }
    }
}
