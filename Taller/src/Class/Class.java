
package Class;

import Interface.Interface;
import java.util.Scanner;


public abstract class Class implements Interface{
    private Double num;
    
    Scanner scan=new Scanner(System.in);

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }
    
    @Override
    public void Lectura() {
        System.out.println("Ingrese un real:");
        this.setNum(scan.nextDouble());
    }

    @Override
    public void Logica() {
    }
    
}
