public class Cannon {
    public boolean loaded;

    public Cannon(boolean loaded){
        this.loaded = loaded;
    }
    public boolean fire(){
        while(!loaded){
            if (loaded == false){
                System.out.println("No cannonball in cannon. Cannon will be loaded");
                loaded = true;
                System.out.println("Canon loaded\n");
            }
        }
        return true;
    }
}
