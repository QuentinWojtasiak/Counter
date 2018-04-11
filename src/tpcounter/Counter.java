
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
    
    public void inc()
    {
        this.value+=this.inc;
    }
    
    public String toString()
    {
        return "Valeur : "+this.value+" ( incrément : "+this.inc+" )";
    }
    
    public boolean equals(Counter ctr)
    {
        boolean verif;
        if(this.value==ctr.value)
            verif = true; 
        else
            verif = false;
        return verif;
    }
}
