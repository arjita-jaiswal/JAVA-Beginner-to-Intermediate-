class Operation{
int operand1;
String operator;
int operand2;
double result;
Operation(int operand1,String operator,int operand2){
this.operand1=operand1;
this.operator=operator;
this.operand2=operand2;
}
void calculateValue(){
if (this.operator.equals("+")){
this.result=this.operand1+this.operand2;
}
else if (this.operator.equals("-")){
this.result=this.operand1-this.operand2;
}
else if (this.operator.equals("*")){
this.result=this.operand1*this.operand2;
}
else if (this.operator.equals("/")){
this.result=this.operand1/this.operand2;
}
}
void displayResult(){
//calculateValue();
System.out.println("Result="+result);
}
}