package Animal;

class Dog extends Mammal
{
    private String FavColorImamidin57105;

    Dog()
    {
        super();
        FavColorImamidin57105 = "BLACK";
    }

    public Dog(String name, int age, int weight, String order, String favColor)
    {
        super(name, age, weight, order);
        this.FavColorImamidin57105 = favColor;
    }

    public Dog(int age, String order, String favColor)
    {
        super(age, order);
        this.FavColorImamidin57105 = favColor;
    }

    public void WakeUp()
    {
        System.out.println("MORNING");
    }

    @Override
    public void SleepImamidin57105()
    {System.out.println("SLEEPING");}

    @Override
    void getVoiceImamidin57105()
    {System.out.println("Wooof Wooof");}

    @Override
    public void eatImamidin57105(String meal)
    {System.out.println("EATING");}

    public String getFavColorImamidin57105()
    {return this.FavColorImamidin57105;}

    public void setFavColorImamidin57105(String X)
    {this.FavColorImamidin57105 = X;}

    public String ToString()
    {return "Dog :\n " + "Favorite Color : " + FavColorImamidin57105;}
}
