public class RemoteControlTes {

    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOnCommand);
        remote.onButtonWasPressed();
        remote.setCommand(lightOffCommand);
        remote.offButtonWasPressed();
    }
}
