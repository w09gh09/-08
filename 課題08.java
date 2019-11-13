class Dog{
  private DogSate mySate;

  public Dog(){
    myState = TanoshiiState.getlnstance();
  }

  public void roudou(){
    myState.tukareta(this);
  }

  public void shokuji(){
    myState.tabeta(this);
  }

  public void changeState(DogState d){
    myState = d;
  }

  public void jyoutaiNani(){
    System.out.print("現在、わたしは「");
    System.out.print(myState.toString());
    System.out.println("」です。");
  }
}

abstract class DogSate{
  public abstract void tukareta(Dog yobidashimoto);//疲れた！
  public abstract void tabeta(Dog yobidashimoto);    //食べた！
}

class TanoshiiState extends DogState{
  private static TanoshiiState s = new TanoshiiState();
  private TanoshiiState(){}

  public static DogState getlnstance(){
    return s;
  }
  public void tukareta(Dog moto){
    moto.changeState(FutsuuState.getlnstance());
  }
  public void tabeta(Dog moto){// なにもしない
  }
  public String to String(){
    return "楽しい状態";
  }
}

class FutsuuState extends DogState{
  private static FutsuuState s = new FutsuuState();
  private FutsuuState(){}

  public static DogState getlnstance(){
    return s;
  }
  public void tukareta(Dog moto){
    moto.changeState(lrairaState.getlnstance());
  }
  public void tabeta(Dog moto){
    moto.changeState(TanoshiiState.getlnstance());
  }
  public String to String(){
    return "普通状態";
  }
}

class lrairaState extends DogState{
  private static lrairaState s = new lrairaState();
  private lrairaState(){}

  public static DogState getlnstance(){
    return s;
  }
  public void tukareta(Dog moto){
    // なにもしない
  }
  public void tabeta(Dog moto){
    moto.changeState(TanoshiiState.getlnstance());
  }
  public String to String(){
    return "いらいら状態";
  }

  class lrairaState extends DogState{
    private static lrairaState s = new lrairaState();
    private lrairaState(){}

    public static DogState getlnstance(){
      return s;
    }
    public void tukareta(Dog moto){
      // なにもしない
    }
    public void tabeta(Dog moto){
      moto.changeSate(TanoshiiState.getlnstance());
    }
    public String to String(){
      return "病気状態";
    }
}
