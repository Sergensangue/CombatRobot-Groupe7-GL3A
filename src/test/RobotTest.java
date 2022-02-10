import org.junit.Assert;

class RobotTest {
    Robot R1 = new Robot("D2R2");
    Robot R2 = new Robot("Data");

    @org.junit.jupiter.api.Test
    void fire(){
        int pointsAvant = R1.getPoints();
        R1.fire(R2);

        int pointsApres = R2.getPoints();

        System.out.println(R1.getPoints());
        System.out.println(R2.getPoints());

        Assert.assertTrue(pointsApres < pointsAvant);
    }

    @org.junit.jupiter.api.Test
    void Dead(){
        R1.fire(R2);
        R1.fire(R2);
        R1.fire(R2);
        R1.fire(R2);
        R1.fire(R2);

        Assert.assertFalse(R1.isDead());
        Assert.assertTrue(R2.isDead());
    }

    @org.junit.jupiter.api.Test
    void getNomRobot(){
        Assert.assertEquals("Robot D2R2", R1.getNomRobot());
    }

//    @org.junit.jupiter.api.Test
//    void deadRobot(){
//        R1.fire(R2);
//        R1.fire(R2);
//        R1.fire(R2);
//        R1.fire(R2);
//        R1.fire(R2);
//        R1.fire(R2);
//
//        Assert.assertEquals(R2.isDead(),-2);
//    }
}
