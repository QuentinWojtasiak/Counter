
package tpcounter;

public class Counter {
    
    private int value;
    private int inc;
    
    public Counter()
    {
        value=0;
        inc=0;
    }
    
    public Counter(int value,int inc)
    {
        this.value=value;
        this.inc=inc;
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    
}
