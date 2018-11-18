public class Glass {

    private String liquid;
    private Integer amount;
    private Integer max;

    public Glass(){
        super();
    }

    public Glass(Integer max){
        this.max = max;
        this.liquid = "Watter";
        this.amount = 0;
    }
    public Integer getAmount() {
        return amount;
    }
    public String getLiquid(){
        return liquid;
    }
    public Integer getMax(){
        return max;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }
    public void setMax(Integer max){
        this.max = max;
    }
    public void setLiquid(String liquid){
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return String.format("Glass type is %s, amount is %d, max is %d.", liquid, amount, max);

    }
}


