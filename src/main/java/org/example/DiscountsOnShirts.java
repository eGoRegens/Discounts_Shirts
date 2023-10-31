package org.example;

public class DiscountsOnShirts {
    public static void main(String[] args) {
        final int basePrice = 1500;
        final int numberOfSelectedShirts = 5; // уже выбранно рубашек
        final int requiredQuantityForDiscount = 8;//требуемое кол-во для скидки
        final float discountPercentage = 20;
        final int stillNeedShirtsForDiscount = requiredQuantityForDiscount - numberOfSelectedShirts; //сколько нужно еще выбрать рубашек для скидки
        final int totalPriceOfTheSelected = basePrice * numberOfSelectedShirts; //сумма выбранных рубашек без скидки
        final int totalPriceShirtsNeedPurchased = stillNeedShirtsForDiscount * basePrice; //  общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку
        final double discountedPriceOfSelectedShirts = (basePrice * requiredQuantityForDiscount) * 0.8; //цена рубашек со скидкой
        final double pricePieceDiscount = discountedPriceOfSelectedShirts / requiredQuantityForDiscount; //цена за штуку со скидкой
        final double amountSaved = (totalPriceOfTheSelected + totalPriceShirtsNeedPurchased) - discountedPriceOfSelectedShirts; //количество сэкономленных денег при сикдке
        double freeShirtsInt = amountSaved / basePrice;

        System.out.println("Цена за одну рубашку без скидки - " + basePrice + " у.е.");
        System.out.println("Кол-во выбранных рубашек - " + numberOfSelectedShirts + " шт.");
        System.out.println("Требуемое кол-во для получения скидки - " + requiredQuantityForDiscount + " шт.");
        System.out.println("Размер скидки составит - " + discountPercentage + "%");
        System.out.println("Недостающее кол-во рубашек для получения скидки - " + stillNeedShirtsForDiscount);
        System.out.println("Общая цена рубашек без скидки - " + totalPriceOfTheSelected + " у.е.");
        System.out.println("Сумма рубашек,которые требуются для получения скидки - " + totalPriceShirtsNeedPurchased + " у.е.");
        System.out.println("Сумма рубашек со скидкой - " + discountedPriceOfSelectedShirts + " у.е.");
        System.out.println("Цена одной рубашки со скидкой - " + pricePieceDiscount + " у.е.");
        System.out.println("Экономия составит - " + amountSaved + " у.е.");
        System.out.println("Кол-во рубашек полученных бесплатно - " + freeShirtsInt + " шт.");
    }
}