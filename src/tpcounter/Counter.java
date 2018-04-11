
package tpcounter;

public class Counter {
    
    private static int globalCounter=-1;
    private int value;
    private int inc;
    
    public Counter()
    {
        if(globalCounter==-1)
            globalCounter=0;
        value=0;
        inc=1;
    }
    
    public Counter(int value,int inc)
    {
        if(globalCounter==-1)
            globalCounter=value;
        else
            globalCounter+=value;
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
        globalCounter+=this.inc;
    }
    
    public String toString()
    {
        return "Valeur : "+this.getValue()+" ( incrément : "+this.inc+" )";
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
    
    public int getGlobalCounter()
    {
        return globalCounter;
    }
}
