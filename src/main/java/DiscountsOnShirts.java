public class DiscountsOnShirts {
    public static void main(String[] args) {
        final int basePrice = 1500;
        final int numberOfSelectedShirts = 5; // уже выбранно рубашек
        final int requiredQuantityForDiscount = 8;//требуемое кол-во для скидки
        final float discountPercentage = 20;
        final int STILL_NEED_SHIRTS_FOR_DISCOUNT = requiredQuantityForDiscount - numberOfSelectedShirts; //сколько нужно еще выбрать рубашек для скидки
        final int TOTAL_PRICE_OF_THE_SELECTED = basePrice * numberOfSelectedShirts; //сумма выбранных рубашек без скидки
        final int TOTAL_PRICE_SHIRTS_NEED_PURCHASED = STILL_NEED_SHIRTS_FOR_DISCOUNT * basePrice; //  общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку
        final double DISCOUNTED_PRICE_OF_SELECTED_SHIRTS = (basePrice * requiredQuantityForDiscount) * 0.8; //цена рубашек со скидкой
        final double PRICE_PIECE_DISCOUNT = DISCOUNTED_PRICE_OF_SELECTED_SHIRTS / requiredQuantityForDiscount; //цена за штуку со скидкой
        final double AMOUNT_SAVED = (TOTAL_PRICE_OF_THE_SELECTED + TOTAL_PRICE_SHIRTS_NEED_PURCHASED) - DISCOUNTED_PRICE_OF_SELECTED_SHIRTS; //количество сэкономленных денег при сикдке
        double FREE_SHIRTS = AMOUNT_SAVED / basePrice;

        System.out.println("Цена за одну рубашку без скидки - " + basePrice + " у.е.");
        System.out.println("Кол-во выбранных рубашек - " + numberOfSelectedShirts + " шт.");
        System.out.println("Требуемое кол-во для получения скидки - " + requiredQuantityForDiscount + " шт.");
        System.out.println("Размер скидки составит - " + discountPercentage + "%");
        System.out.println("Недостающее кол-во рубашек для получения скидки - " + STILL_NEED_SHIRTS_FOR_DISCOUNT);
        System.out.println("Общая цена рубашек без скидки - " + TOTAL_PRICE_OF_THE_SELECTED + " у.е.");
        System.out.println("Сумма рубашек,которые требуются для получения скидки - " + TOTAL_PRICE_SHIRTS_NEED_PURCHASED + " у.е.");
        System.out.println("Сумма рубашек со скидкой - " + DISCOUNTED_PRICE_OF_SELECTED_SHIRTS + " у.е.");
        System.out.println("Цена одной рубашки со скидкой - " + PRICE_PIECE_DISCOUNT + " у.е.");
        System.out.println("Экономия составит - " + AMOUNT_SAVED + " у.е.");
        System.out.println("Кол-во рубашек полученных бесплатно - " + FREE_SHIRTS + " шт.");
    }
}