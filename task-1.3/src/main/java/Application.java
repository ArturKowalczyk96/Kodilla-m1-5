public class Application {
    public static void main(String arg[]){
        Knight knight = new Knight();
        String questComplited1 = knight.complitedQuest(new EliteKnightQuest());
        System.out.println(questComplited1);
        String questComplited2 = knight.complitedQuest(new DeadIslandQuest());
        System.out.println(questComplited2);
    }
}
