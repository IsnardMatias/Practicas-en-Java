package practicas;

public class Aritmetica {
       
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor Vacio
    Aritmetica(){}
    
    //Constructor con 2 argumentos
    Aritmetica( int a , int b){
        //Uso del operador this
        this.a = a;
        this.b = b;
    }
    
    //Este metodo toma los atributos de la clase para hacer la suma
    int sumar(){
        return a + b;
    }
    
    //Metodo restar
    int restar(){
        return a - b;
    }
    
    //Metodo multiplicar
    int multiplicar(){
        return a * b;
    }
    
    //Metodo dividir
    int dividir(){
        return a / b;
    } 
}