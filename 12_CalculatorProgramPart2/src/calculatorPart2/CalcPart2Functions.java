// Author: Miho Sekiya
// Date: 7/22/2022
// Assignment: 12_CalculatorProgram_Part2
// Class: Java CIS 016 (Summer2022)
package calculatorPart2;
import java.util.Scanner;
import javafx.scene.control.Label;

public class CalcPart2Functions {

	private String num = "";
	private String mystmt = "";
	private String memory = "";
	private String hold = "";
	
	    /**  Converting calculations  **/
	    static double calcScan(String str) {
			Scanner wordScan = new Scanner(str);

			double result = wordScan.nextDouble();
			String op = wordScan.next();
			double val = wordScan.nextDouble();

			if (op.equals("+")) result += val;
			else if (op.equals("x")) result *= val;
			else if (op.equals("-")) result -= val;
			else if (op.equals("/")) result /= val;
			else if (op.equals("p")) result = Math.pow(result, val);
			else if (op.equals("%")) result = result * 0.01;
			
			else return 0;
			return result;  
	    }
	    
	    /**  Btn 0  **/
	    void btn0(Label mylabel) {
			mystmt = mystmt + "0";
			num = num + "0";
			mylabel.setText(num);
//			System.out.println(mystmt);
	    }	    
	    /**  Btn 1  **/
	    void btn1(Label mylabel) {
			mystmt = mystmt + "1";
			num = num + "1";
			mylabel.setText(num);
//			System.out.println(mystmt);		
			}	  	    
	    /**  Btn 2  **/
	    void btn2(Label mylabel) {
	    	mystmt = mystmt + "2";
	    	num = num + "2";
	    	mylabel.setText(num);
//	    	System.out.println(mystmt);
	    }	    	    
	    /**  Btn 3  **/
	    void btn3(Label mylabel) {
	    	mystmt = mystmt + "3";
	    	num = num + "3";
	    	mylabel.setText(num);
//	    	System.out.println(mystmt);
	    }	   	    
	    /**  Btn 4  **/
	    void btn4(Label mylabel) {
	    	mystmt = mystmt + "4";
	    	num = num + "4";
	    	mylabel.setText(num);
//	    	System.out.println(mystmt);
	    }	   	    
	    /**  Btn 5  **/
	    void btn5(Label mylabel) {
			mystmt = mystmt + "5";
			num = num + "5";
			mylabel.setText(num);
//			System.out.println(mystmt);
			}	    	    
	    /**  Btn 6  **/
	    void btn6(Label mylabel) {
	    	mystmt = mystmt + "6";
	    	num = num + "6";
	    	mylabel.setText(num);
//	    	System.out.println(mystmt);
	    }	   	    
	    /**  Btn 7  **/
	    void btn7(Label mylabel) {
	    	mystmt = mystmt + "7";
	    	num = num + "7";
	    	mylabel.setText(num);
//	    	System.out.println(mystmt);
	    }	   	    
	    /**  Btn 8  **/
	    void btn8(Label mylabel) {
			mystmt = mystmt + "8";
			num = num + "8";
			mylabel.setText(num);
//			System.out.println(mystmt);
			}	   	    
	    /**  Btn 9  **/
		void btn9(Label mylabel) {
			mystmt = mystmt + "9";
			num = num + "9";
	    	mylabel.setText(num);
//			System.out.println(mystmt);
			}	   	    
	    /**  Btn Plus  **/
	    void btnplus(Label mylabel) {
	    	mystmt = mystmt + " + 0";
		    double calcVal = calcScan(mystmt);	
		    String calcValStr = (Double.toString(calcVal));
			if (calcValStr.length() == calcValStr.indexOf('.')+2) {
				if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
				}			    
			num = "";
	    	mylabel.setText(calcValStr);
	    	mystmt = calcValStr + " + ";
//			System.out.println(mystmt);   
		}	   	    
	    /**  Btn Minus  **/
	    void btnminus(Label mylabel) {
	    	 mystmt = mystmt + " - 0";
			    double calcVal = calcScan(mystmt);	
			    String calcValStr = (Double.toString(calcVal));
				if (calcValStr.length() == calcValStr.indexOf('.')+2) {
					if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
					}		
				num = "";
				mylabel.setText(calcValStr);
		    	mystmt = calcValStr + " - ";
//			    System.out.println(mystmt); 
		}	   	    	    
	    /**  Btn Multiply  **/
	    void btnmulti(Label mylabel) {
	        mystmt = mystmt + " x 1";
		    double calcVal = calcScan(mystmt);	
		    String calcValStr = (Double.toString(calcVal));
			if (calcValStr.length() == calcValStr.indexOf('.')+2) {
				if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
				}		
			num = "";
			mylabel.setText(calcValStr);
	    	mystmt = calcValStr + " x ";
//			System.out.println(mystmt);	    	
	    }	    
	    /**  Btn Divide  **/
	    void btndivide(Label mylabel) {
	    mystmt = mystmt + " / 1";
	    double calcVal = calcScan(mystmt);	
	    String calcValStr = (Double.toString(calcVal));
		if (calcValStr.length() == calcValStr.indexOf('.')+2) {
			if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
			}	
		num = "";
		mylabel.setText(calcValStr);
    	mystmt = calcValStr + " / ";
//		System.out.println(mystmt);
	    }		    
	    /**  Btn Equal  **/
	    void btnequal(Label mylabel) {
	    	 double calcVal = calcScan(mystmt);	
			    String calcValStr = (Double.toString(calcVal));
				if (calcValStr.length() == calcValStr.indexOf('.')+2) {
					if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
					}	
				num = "";
				mylabel.setText(calcValStr);
			    mystmt = calcValStr;
//			    System.out.println(mystmt);	
	    }	    
	    /**  Btn Clear  **/
	    void btnclear(Label mylabel) {
	    	mystmt = "";
			num = "";
	    	mylabel.setText("0");
//			System.out.println(mystmt);
	    }			
	    /**  Btn Memory  **/
	    void btnmemory(Label mylabel) {
			mystmt += memory;
		    mylabel.setText(memory);
//			System.out.println(mystmt);	    
	    }	    
	    /**  Btn Memory Plus  **/
	    void btnmemoryP(Label mylabel) {
	    	 memory = mystmt;
			    mylabel.setText(memory);
//			    System.out.println("Memory is now : " + mystmt);
	 	 }	    
	    /**  Btn PN  **/
	    void btnpn(Label mylabel) {
	    	mystmt = Double.toString(Double.parseDouble(mystmt) * -1);
			if (mystmt.length() == mystmt.indexOf('.')+2) {
			if (mystmt.endsWith(".0")) mystmt = mystmt.substring(0, (mystmt.indexOf('.')));
			}
			num = "";
	    	mylabel.setText(mystmt);
//	    	System.out.println(mystmt); 
	    	}	    
	    /**  Btn dot  **/
	    void btndot(Label mylabel) {
			mystmt = mystmt + ".";
			num = num + ".";
			mylabel.setText(num);
//			System.out.println(mystmt);
	    }
	    /**  Btn Square Root  **/
	    void btnSR(Label mylabel) {
	    	mystmt = Double.toString(Math.sqrt(Double.parseDouble(mystmt)));
			if (mystmt.length() == mystmt.indexOf('.')+2) {
			if (mystmt.endsWith(".0")) mystmt = mystmt.substring(0, (mystmt.indexOf('.')));
			}
			num = "";
	    	mylabel.setText(mystmt);
//	    	System.out.println(mystmt); 
	    }
	     /**  Btn Cube Root  **/
	    void btnCR(Label mylabel) {
	    	mystmt = Double.toString(Math.cbrt(Double.parseDouble(mystmt)));
			if (mystmt.length() == mystmt.indexOf('.')+2) {
			if (mystmt.endsWith(".0")) mystmt = mystmt.substring(0, (mystmt.indexOf('.')));
			}
			num = "";
	    	mylabel.setText(mystmt);
//	    	System.out.println(mystmt); 	    	    
	    }	    
	    /**  Btn Power  **/
	    void btnPW(Label mylabel) {
	    	mystmt = mystmt + " x 1";
	    	double calcVal = calcScan(mystmt);	
	    	String calcValStr = (Double.toString(calcVal));
	    	if (calcValStr.length() == calcValStr.indexOf('.')+2) {
	    		if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
	    	}		
	    	num = "";
	    	mylabel.setText(calcValStr);
	    	mystmt = calcValStr + " p ";
//	    	System.out.println(mystmt);	    	
	    }   
	    /**  Btn %  **/
	    void btnpct(Label mylabel) {
	    	hold = mystmt.substring(0, (mystmt.indexOf(" x"))); 
	        mystmt = (mystmt.substring((mystmt.indexOf("x "))+2)) + " % 1";
		    double calcVal = calcScan(mystmt);	
		    String calcValStr = (Double.toString(calcVal));
			if (calcValStr.length() == calcValStr.indexOf('.')+2) {
				if (calcValStr.endsWith(".0")) calcValStr = calcValStr.substring(0, (calcValStr.indexOf('.')));
				}		
			num = "";
	    	mylabel.setText(calcValStr);
	    	mystmt = hold + " x " + calcValStr;
//			System.out.println(mystmt);	    	
	    }	    
	    
	}  // End of class
	
	
