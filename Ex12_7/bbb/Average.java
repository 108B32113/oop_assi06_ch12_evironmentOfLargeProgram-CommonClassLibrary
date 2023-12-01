package Ex12_7.bbb; // if the file in a package that this arranged(安排) instruction will be added "." at behide of projectName => it's packageName

public class Average { // because here had private member, so another package to take the private class member even it's public class it at least will be used import to transfer into other package
    private int sum = 0;
    private int end;
    private double avg;
    public Average(int e){
        end = e;
    }
    public double averg(){
        for(int i=1; i<=end; i++)
            sum+=i;
        avg=(double)sum/end;
        return avg;
    }
}