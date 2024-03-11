class Programa01

{

  public static void main (String entrada[])

  {
    int n1,n2;
    int mod,vid;
    String msg = "";
    //entrada de dados 
    n1 = Integer.parseInt(entrada[0]);
    n2 = Integer.parseInt(entrada[1]);
    //processamento 
    mod = n1 % n2;
    div = (int)n1/(int)n2;
    raiz = Math.sqrt(n1);
    pot = Match.pow(n1,n2);
    //saindade resultados
    msg = "n1 = " + n2 + "\n";
    msg = msg + "resto da divisao de n1 por n2=" + mod + "\n";
    msg = msg + "quociente de divisao de n1 por n2 = " + div +"\n";
    msg = msg + "raiz quadrada de n1 = " + "\n";
    msg = msg + "potencia de n1 + n2 = " + pot + "\n";
    System.out.println(msg);
    System.exit(0);



  }

}