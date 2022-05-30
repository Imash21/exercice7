package Animal;

class BlowFish extends Fish
{
    private String TypeImamidin57105;

    BlowFish()
    {
        super();
        TypeImamidin57105="XXX";
    }
    public BlowFish(String name,int age , int weight , String order, String Type)
    {
        super(name,age,weight,order);
        this.TypeImamidin57105 = Type;
    }

    public BlowFish(int age , String order, String Type)
    {
        super(age,order);
        this.TypeImamidin57105 = Type;
    }

    public void travel()
    {System.out.println("BYE BYE");}

    @Override
    public void Search_For_Food()
    {System.out.println("Lookin for somethin to eat ");}

    @Override
    public void getVoiceImamidin57105()
    {System.out.println("gfdgsdfhsdh");}

    @Override
    public void eatImamidin57105(String meal)
    {System.out.println("Eatin "+meal);}


    public String getType()
    {return this.TypeImamidin57105;};

    public void setType(String X)
    {this.TypeImamidin57105 = X;};

    public String ToString()
    {return "BlowFish :\n "+"Type : "+TypeImamidin57105;}

}
