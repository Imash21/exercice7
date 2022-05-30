package Animal;


abstract class Animal
{
    String NameImamidin57105;
    int ageImamidin57105,weightImamidin57105;

    public Animal(int age)
    {this.ageImamidin57105age;}

    public void eatImamidin57105(String meal){};
    abstract void getVoiceImamidin57105();
    public Animal()
    {
        ageImamidin57105 = weightImamidin57105=0;
        NameImamidin57105="XX";
    }
    public Animal(String name,int age , int weight)
    {
        this.NameImamidin57105=name;
        this.ageImamidin57105=age;
        this.weightImamidin57105=weight;
    }

    public String getNameImamidin57105()
    {return this.NameImamidin57105;};

    public void setNameImamidin57105(String X)
    {this.NameImamidin57105=X;};

    public int getAgeImamidin57105()
    {return this.ageImamidin57105;};

    public void setAgeImamidin57105(int X)
    {this.ageImamidin57105=X;};

    public int getWeightImamidin57105()
    {return this.weightImamidin57105;};

    public void setWeightImamidin57105(int X)
    {this.weightImamidin57105=X;};


}


