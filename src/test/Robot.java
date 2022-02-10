public class Robot {
    private String nomRobot;
    private int points;

    public Robot(String nomRobot) {
        this.nomRobot = "Robot " + nomRobot;
        this.points = 10;
    }

    public int getPoints(){
        return points;
    }
    public void setPoints(int points){
        this.points = points;
    }
    public String getNomRobot(){
        return nomRobot;
    }

    public void setNomRobot(String nomRobot) {
        this.nomRobot = nomRobot;
    }

    public void fire(Robot R) {
        R.setPoints(R.getPoints() - 2);
        System.out.println(R.getNomRobot() + " a été touché par " + this.nomRobot);
    }
    public boolean isDead(){
        return this.points == 0;
    }
}
