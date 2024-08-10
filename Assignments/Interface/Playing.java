import java.util.*;
interface Playable{
    void play();
    void pause();
    void stop();
}
class Mp3Player implements Playable{
    static boolean p=false;
    public void play(){
        if(!p){
            p=true;
            System.out.println("Mp3 player is started");
        }
        else
            System.out.println("Mp3 Player is already started");
    }
    public void pause(){
        if(p){
            p=false;
            System.out.println("Mp3 player is paused");
        }
        else
            System.out.println("Mp3 Player is already paused");
    }
    public void stop(){
        if(p){
            p=false;
            System.out.println("Mp3 player is stopped");
        }
        else
            System.out.println("Mp3 Player is already stopped");
    }
}
class CDPlayer implements Playable{
    static boolean p=false;
    public void play(){
        if(!p){
            p=true;
            System.out.println("Mp3 player is started");
        }
        else
            System.out.println("Mp3 Player is already started");
    }
    public void pause(){
        if(p){
            p=false;
            System.out.println("Mp3 player is paused");
        }
        else
            System.out.println("Mp3 Player is already paused");
    }
    public void stop(){
        if(p){
            p=false;
            System.out.println("Mp3 player is stopped");
        }
        else
            System.out.println("Mp3 Player is already stopped");
    }
}
class StreamingPlayer implements Playable{
    static boolean p=false;
    public void play(){
        if(!p){
            p=true;
            System.out.println("Mp3 player is started");
        }
        else
            System.out.println("Mp3 Player is already started");
    }
    public void pause(){
        if(p){
            p=false;
            System.out.println("Mp3 player is paused");
        }
        else
            System.out.println("Mp3 Player is already paused");
    }
    public void stop(){
        if(p){
            p=false;
            System.out.println("Mp3 player is stopped");
        }
        else
            System.out.println("Mp3 Player is already stopped");
    }
}
public class Playing {
    public static void main(String[] args) {
        Playable player=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select the type of player:");
        System.out.println("1. MP3Player");
        System.out.println("2. CDPlayer");
        System.out.println("3. StreamingPlayer");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player = new Mp3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        // Control the player
        boolean exit = false;
        while (!exit) {
            System.out.println("\nControl the player:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid action.");
            }
        }
    }
}
