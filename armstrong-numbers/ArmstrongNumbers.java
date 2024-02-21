class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        double suma=0;
        String number=Integer.toString(numberToCheck);
        String[] num=number.split("");
        int tam=num.length;
        for (String s : num) {            
            suma = suma + Math.pow(Integer.parseInt(s), tam);
        }
        return suma == (double) numberToCheck;
    }
}