package ru.netology.stats.StatsService;

public class StatsService {
    public long amountOfSales(long [] sales) {
        long total = 0;

        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSalesAmount(long [] sales) {
        long average;
        long averageSum = amountOfSales(sales);
        int numberOfMonths = sales.length;

        average = averageSum / numberOfMonths;

        return Math.round(average * 100) / 100;
    }

    public int maxSales(long [] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]){
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long [] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]){
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsLessAverage(long [] sales) {
        int monthsLessAverage = 0;
        long average= averageSalesAmount(sales);

        for(int i = 0; i < sales.length; i++){
            if (sales[i] < average){
                monthsLessAverage += 1;
            }
        }
        return monthsLessAverage;
    }

    public int monthsAboveAverage(long [] sales) {
        int monthsAboveAverage = 0;
        long average= averageSalesAmount(sales);

        for(int i = 0; i < sales.length; i++){
            if (sales[i] > average){
                monthsAboveAverage += 1;
            }
        }
        return monthsAboveAverage;
    }
}
