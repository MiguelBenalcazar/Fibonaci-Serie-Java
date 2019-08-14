package fibonaci;
import java.util.Scanner;                                                            //IMPORTA LIBRERIA PARA USO DE OBJETO SCANNER
public class Fibonaci {                                                             //INICIO CALSE DE NOMBRE FIBONACI
    public static void main(String[] args) {                                        //DECLARACION E INICIO DE METODO PRINCIPAL    
        Scanner leer=new Scanner(System.in);                                        //CREAR OBJETO DE TIPO SCANNER DE NOMBRE LEER
        int num;                                                                    //CREAR VARIABLE NUM DE TIPO ENTERO PARA ALMACENAR EL DATO A LEER
        int p=0, s=1,fibo;                                                          //CREAR VARIABLE P=PRIMER DATO DE SERIE, S=SEGUNDO DATO DE LA SERIE, Y FIBO DONDE SE GENERA LA SERIE 
        boolean vof=true;                                                           //CREAR VARIABLE DE TIPO BOOLEAN PARA PODER IDENTIFICAR SI PERTENECE O NO A FIBONACI
        System.out.println("INGRESE L NUMERO PARA SABER SI PERTENECE A FIBONACI");  //IMPRIME LA SIGUIENTE INFORMACION
        num=leer.nextInt();                                                         //ALMACENAMOS EN VARABLE NUM EL DATO INGRESADO POR TECLADO CON EL OBJETO DE TIPO SCANNER
        do{                                                                         //INICIO DEL DO/WHILE
            fibo=p+s;                                                               //CALCULO DEL NUEVO VALOR DE LA SERIE 
            p=s;                                                                    //ASIGNAR A P EL VALOR DE S, MUEVO EL VALOR DEL DATO ANTERIOR A LA VARIABLE P
            s=fibo;                                                                 //ASIGNAR A S EL VALOR DE FIBO, MUEVO EL ULTIMO VALOR DE FIBO A LA VARIABLE S
            if(fibo==num || num==0){                                                //INICIA IF 1 EJECUTA SIEMPRE Y CUANDO EL VALOR ACUMULADO EN FIBO ES IGUAL AL VALOR INGRESADO POR EL USUARIO
                vof=false;                                                          //ASIGNA A VARIABLE vof EL VALOR DE FALSO PARA SALIR DEL LAZO DO/WHILE
                System.out.println("ES UN FIBONACI");                               //IMPRIME LA SIGUIENTE INFORMACION
            }                                                                       //FIN IF 1
            if(fibo>num && num!=0){                                                 //INICIA IF 2 EJECUTA SIEMPRE Y CUANDO EL VALOR ACUMULADO EN FIBO SEA MAYOR AL VALOR INGRESADO POR EL USUARIO
                vof=false;                                                          //ASIGNA A VARIABLE vof EL VALOR DE FALSO PARA SALIR DEL LAZO DO/WHILE
                System.out.println("NO ES UN FIBONACI");                            // IMPRIME LA SIGUIENTE INFORMACION
            }                                                                       //FIN IF 2
        }while(vof);                                                                //FIN DO/WHILE REPITE SIEMPRE  CUANDO ESTA SEA VERDADERA CASO CONTRARIO SALE
    }                                                                               //FIN METODO PRINCIPAL
}                                                                                   //FIN CLASE 
