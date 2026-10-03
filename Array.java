class Array implements Cloneable {
    private int[] anArray;
    private int value;

    public Array() { 
        anArray=new int[]{1,2,3,4,5,6};
        value=10;
    }
    public void increment() {
        value++;
        anArray[0]++;
    }
    @Override 
    public String toString() {
        return "value=" +value +", anArray=" +java.util.Arrays.toString(anArray);
    }
    @Override 
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
