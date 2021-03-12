package Meditor;

public class Market implements Department {

    private Meditor meditor;

    public Market(Meditor meditor) {
        this.meditor = meditor;
        meditor.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("开拓市场，为公司创收");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作：开拓市场需要大量资金");
        meditor.command("fancial");

    }
}
