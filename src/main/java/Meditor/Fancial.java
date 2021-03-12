package Meditor;

public class Fancial implements Department {

    private Meditor meditor;

    public Fancial(Meditor meditor) {
        this.meditor = meditor;
        meditor.register("fancial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱，拨款");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作：钱太多了，怎么花？");
    }
}
