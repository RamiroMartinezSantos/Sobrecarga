public class Operaciones {
    public int operacion(int num1,int num2){
        return num1 + num2;
    }
    public Integer operacion(Integer num1,Integer num2){
        return num1-num2;
    }
    public Float operacion(Float num1,Float num2){
        return num1 * num2;
    }
    public Double operacion(Double num1,Double num2){
        if(num1 != 0){
            return num1 / num2;
        }else {
            System.out.println(" La divicion no se puede realizar...");
            System.out.println(" Se encontro una vicion entre 0");
            return 0.0;
        }
    }
}
