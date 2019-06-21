Nas linguagens orientadas a objeto, existe uma diferença entre a referência a um objeto e o valor do objeto. Em java, o operador = = e o método equals, este definido para a classe Object, apresentam comportamento específico que tem relação com essa característica. 
Considere o exemplo de um código Java 6 a seguir.

public class Questao { 

  public static void main(String [ ] args) { 

    integer a,b,c,d,e ; 
    int f ; 
    char r1,r2,r3,r4,r5 ;   
    String s ; 

    a=1; b=1; c = a ; 
    d= b; f=1; e = f.; 

    r 1= ( a.equals(b)? 's' : 'n' ) ; 
    r 2= ( a.equals(c)? 's' : 'n' ) ; 
    r 3= ( a==d? 's' : 'n' ) ; 
    r 4= ( a==e? 's' : 'n' ) ; 
    r 5= ( a.equals(f)? 's' : 'n' ) ;

    s = " "+r1+r2+r3+r4+r5 ; 

    System.out.println(s) ;

  } 
}

Executando-se esse código, em que é possível testar como o comportamento exemplificado foi implementado para a classe Integer e o tipo int, a resposta impressa será
