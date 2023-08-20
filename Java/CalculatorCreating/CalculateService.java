public class CalculateService {

   
    public void calculate(String Operator ,double operend1 ,double operend2 ){

        switch (Operator){

            case"+":
                CalculateAddition calculateAddition = new CalculateAddition();
calculateAddition.getCalculateValue(operend1,operend2);
                System.out.println("Addition of 3.0 + 6.4 is==" + calculateAddition.getCalculateValue(operend1,operend2));

                break;
            case "-":
                CalculateSubstraction calculateSubstraction = new CalculateSubstraction();
               calculateSubstraction.getCalculateValue(operend1,operend2);
  System.out.println("Substraction of 3.0 - 6.4 is==" + calculateSubstraction.getCalculateValue(operend1,operend2));
                break;
            case "*":
                CalculateMultiplication calculateMultiplication = new CalculateMultiplication();
                calculateMultiplication.getCalculateValue(operend1,operend2);
System.out.println("Multiplication of 3.0 * 6.4 is==" + calculateMultiplication.getCalculateValue(operend1,operend2));
                break;
            case "/":
                CalculateDivision calculateDivision = new CalculateDivision();
                calculateDivision.getCalculateValue(operend1,operend2);
System.out.println("Division of 3.0 / 6.4 is==" + calculateDivision.getCalculateValue(operend1,operend2));
break;

        }
    }
}
