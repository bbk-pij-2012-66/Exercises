println "Mortgage Calculator!!";
println "Please enter the total amount borrowed:";
String str = System.console().readLine();
double cost = Double.parseDouble(str);

println "Please enter the number of years to pay it back:";
str = System.console().readLine();
int years = Integer.parseInt(str);

println "Please enter the interest rate:";
str = System.console().readLine();
double irate = Double.parseDouble(str);

double total = 0;
double yearly = 0;
double numYears = 0;

println "Calculating...";
println "...";
println "...";

total = calcTotal(cost, years, irate);
println "Total amount to be paid: " + total;
yearly = calcYearly(total, years);
println "Total yearly amount to be paid: " + yearly;
numYears = calcNumYears(cost, total, years);
println "At this rate interest will be paid off in " + numYears + " years";

double calcTotal(double cost, int years, double irate) {
    double totalRate = 1;
        
    for (i = 0; i < years; i++) {
        totalRate *=  (1 + (irate / 100));
    }
    cost = cost * totalRate;  
    return cost;   
}

double calcYearly(double cost, int years) {
    double yearly = (cost / years);
    return yearly;
}

double calcNumYears(double cost, double total, int years) {
    double ratio= 0;

    ratio = (total - cost) / total;
    numberOfYears = ratio * years; 
    return numberOfYears;
}