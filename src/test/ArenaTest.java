import org.junit.Assert;

public class ArenaTest {
    Robot R1 = new Robot("D2R2");
    Robot R2 = new Robot("Data");
    Arena arena = new Arena();

    @org.junit.jupiter.api.Test
    void fight(){
        arena.fight(R1,R2);
        Assert.assertTrue((R1.getPoints() == 0) || (R2.getPoints() == 0));
    }
}
