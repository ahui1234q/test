package Meditor;

public class Development implements Department {

    private Meditor meditor;

    public Development(Meditor meditor) {
        this.meditor = meditor;
        meditor.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心研发项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作：研发项目需要资金支持");
    }
}
