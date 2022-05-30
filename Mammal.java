package Animal;

class Mammal extends Animal{
    private String orderImamidin57105;
    public Mammal(){
        super();
        orderImamidin57105="XX";
    }
    public Mammal(String name,int age , int weight , String order){
        super(name,age,weight);
        this.orderImamidin57105=order;
    }
    public Mammal(int age , String order){
        super(age);
        this.orderImamidin57105=order;
    }

    public void SleepImamidin57105(){System.out.println("mmmmm");}

    @Override
    void getVoiceImamidin57105) {
        System.out.println("bla bla bla");
    }
    @Override
    public void eatImamidin57105(String meal)
    {System.out.println("Mammal's eating "+ meal);}



    public String getOrderImamidin571057()
    {return this.orderImamidin57105;};

    public void setOrderImamidin57105(String X)
    {this.orderImamidin57105 = X;};

    public String ToStringImamidin57105()
    {return "Mammal :\n "+"Order : "+orderImamidin57105;}

}

