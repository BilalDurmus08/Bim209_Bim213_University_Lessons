package W2_Gathering_Requirements;

public class DogDoor {
    private boolean doorOpen;

    public DogDoor (){
        this.doorOpen = false;
    }

    public void open (){
        System.out.println("The door starts to open");
        doorOpen = true;
    }
    public  void close (){
        System.out.println("The door starts to close");
        doorOpen = false;

    }

    public boolean isOpen(){
        return doorOpen;
    }

}
