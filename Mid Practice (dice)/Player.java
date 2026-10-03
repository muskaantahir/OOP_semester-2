public class Player {
    private String name;
    private Dice[] dice;    //array of object
    private int total;

    public Player (String name, int count, int sides) {
        this.name=name;
        this.dice=new Dice[count];
        for(int i=0;i<count;i++) {
            this.dice[i]=new Dice(sides);
        }
        total=0;    //no roll has happened
    }
    public void roll() {    //rolls all dice player owns
        for(int i=0;i<dice.length;i++) {
            dice[i].roll();
            this.total+=this.dice[i].getValue();
        }
    }
    public void rollAgain (int index) {
        dice[index].roll();
        this.total+=this.dice[index].getValue();
    }
    public int getTotal() {
        return total;
    }
}