public class SimpleRemoteControl {

    ICommand slot;

    public SimpleRemoteControl(){}

    public void setCommand(ICommand slot) {
        this.slot = slot;
    }

    public void onButtonWasPressed(){
        slot.execute();
    }

    public void offButtonWasPressed(){
        slot.execute();
    }
}
