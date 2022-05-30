package Animal;

class Bird extends Animal
{
    private String Type_BirdImamidin57105;

    public Bird()
    {
        super();
        Type_BirdImamidin57105=" ";
    }

    public Bird(String name,int age , int weight , String Type_of_Bird)
    {
        super(name,age,weight);
        this.Type_BirdImamidin57105 = Type_of_Bird;
    }

    public Bird(int age , String Type_of_Bird)
    {
        super(age);
        this.Type_BirdImamidin57105 = Type_of_Bird;
    }

    public void Fly()
    {System.out.println("Flyin");}

    @Override
    void getVoiceImamidin57105()
    {System.out.println("whistle whistle whistle");}

    @Override
    public void eatImamidin57105(String meal)
    {System.out.println("Bird s eatin "+ meal);}

    public String getTypeImamidin57105()
    {return this.Type_BirdImamidin57105;};

    public void setTypeImamidin57105(String X)
    {this.Type_BirdImamidin57105 = X;};

    public String ToString()
    {return "Bird :\n "+"Type of Bird : "+Type_BirdImamidin57105;}

}
