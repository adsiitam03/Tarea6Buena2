package mx.itam.adsi.clases;
public abstract class CriaturaFactory{
  String nom;

  public abstract Animal construye();
  public abstract Monstruo construyeDeforme();
}
